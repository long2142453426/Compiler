package Parse;

import Exceptions.ParseException;
import Model.Program;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Compiler {

    public String compile(String filePath) throws IOException, ParseException {
        Generator gen = new Generator();
        List<Program> progs = gen.generate(filePath);
        StringBuilder sb = new StringBuilder();
        sb.append("import Sprockell\n");
        for (Program prog : progs) {
            sb.append(prog);
            sb.append(" =\n\t");
            sb.append(prog.getOps());
            sb.append("\n");
        }
        sb.append("main = run ").append(progs);
        return sb.toString();
    }

    public void writeToFile(String content, String fileDir) throws IOException {
        PrintWriter writer = new PrintWriter(new File(fileDir));
        writer.println(content);
        writer.flush();

    }

    /**
     *
     * @param programDir the file path of the output program
     * @param sprockellFile content of sprokellFile
     * @throws IOException File not found
     * @throws ParseException used for testing
     */
    public Integer[] buildAndRun(String programDir, String sprockellFile) throws IOException, ParseException {
        String content;
        try {
            content = compile(programDir);
        } catch (ParseException e) {
            String errorOutPutDir = "src/main/resources/Sprockell/sprockell/src/ErrorOutput/";
            writeToFile(e.getMessage(), errorOutPutDir + sprockellFile);
            throw e;//For testing
        }
        List<Integer> outputs = new ArrayList<>();
        writeToFile(content, "src/main/resources/Sprockell/sprockell/src/" + sprockellFile + ".hs");
        ProcessBuilder pb = new ProcessBuilder("ghci", sprockellFile + ".hs");
        pb.directory(new File("src/main/resources/Sprockell/sprockell/src/"));
        Process process = pb.start();
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        PrintStream writer = new PrintStream(process.getOutputStream());
        writer.println("main");
        writer.println(":q");
        writer.flush();
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            if (line.contains("Sprockell") && line.contains("says")) {
                sb.append(line).append("\n");
                System.out.println(line);
                String lastWord = line.substring(line.lastIndexOf(" ") + 1);
                outputs.add(Integer.parseInt(lastWord));
            }
        }
        String outPutDir = "src/main/resources/Sprockell/sprockell/src/Output/";
        writeToFile(sb.toString(), outPutDir + sprockellFile);
        return outputs.toArray(new Integer[0]);

    }

    public static void main(String[] args) throws IOException, ParseException {
        //Generate the file name in the folder src/main/resources/Sprockell/sprockell/src, the out put will be put in src/main/resources/Sprockell/sprockell/src/Output
        // or src/main/resources/Sprockell/sprockell/src/errorOutPut
        new Compiler().buildAndRun("src/main/resources/samples/Semantics/Thread/lock", "lock");
    }
}
