import Sprockell
prog0 =
	[Jump (Abs (164))
	, Load (ImmValue (0)) (2)
	, Compute Add (7) (2) (2)
	, Load (IndAddr (2)) (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (0)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, Load (ImmValue (1)) (2)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (0)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (1)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Compute Gt (2) (3) (2)
	, Load (ImmValue (2)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Branch (2) (Abs (41))
	, Load (ImmValue (1)) (2)
	, Load (ImmValue (3)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (3)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-1)) (4)
	, Compute Add (2) (4) (2)
	, Store (3) (IndAddr (2))
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-2)) (4)
	, Compute Add (2) (4) (2)
	, Load (IndAddr (2)) (6)
	, Jump (Ind (6))
	, Jump (Abs (161))
	, Load (ImmValue (0)) (2)
	, Compute Add (7) (2) (2)
	, Load (IndAddr (2)) (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (4)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, Load (ImmValue (1)) (2)
	, Load (ImmValue (5)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (4)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (5)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Compute Sub (2) (3) (2)
	, Load (ImmValue (6)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (3)) (4)
	, Compute Add (7) (4) (7)
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-2)) (4)
	, Compute Add (2) (4) (2)
	, Load (ImmValue (79)) (6)
	, Store (6) (IndAddr (2))
	, Load (ImmValue (0)) (3)
	, Compute Add (3) (7) (3)
	, Load (ImmValue (6)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Store (2) (IndAddr (3))
	, Load (ImmValue (7)) (4)
	, Compute Add (5) (4) (5)
	, Jump (Abs (1))
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-1)) (4)
	, Compute Add (2) (4) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (-3)) (4)
	, Compute Add (7) (4) (7)
	, Load (ImmValue (-7)) (4)
	, Compute Add (5) (4) (5)
	, Load (ImmValue (7)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (0)) (2)
	, Compute Add (7) (2) (2)
	, Load (IndAddr (2)) (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (8)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, Load (ImmValue (2)) (2)
	, Load (ImmValue (9)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (8)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (9)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Compute Sub (2) (3) (2)
	, Load (ImmValue (10)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (3)) (4)
	, Compute Add (7) (4) (7)
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-2)) (4)
	, Compute Add (2) (4) (2)
	, Load (ImmValue (128)) (6)
	, Store (6) (IndAddr (2))
	, Load (ImmValue (0)) (3)
	, Compute Add (3) (7) (3)
	, Load (ImmValue (10)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Store (2) (IndAddr (3))
	, Load (ImmValue (11)) (4)
	, Compute Add (5) (4) (5)
	, Jump (Abs (1))
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-1)) (4)
	, Compute Add (2) (4) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (-3)) (4)
	, Compute Add (7) (4) (7)
	, Load (ImmValue (-11)) (4)
	, Compute Add (5) (4) (5)
	, Load (ImmValue (11)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (7)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (11)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Compute Add (2) (3) (2)
	, Load (ImmValue (12)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (12)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-1)) (4)
	, Compute Add (2) (4) (2)
	, Store (3) (IndAddr (2))
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-2)) (4)
	, Compute Add (2) (4) (2)
	, Load (IndAddr (2)) (6)
	, Jump (Ind (6))
	, Load (ImmValue (2)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (50)) (4)
	, Compute Add (5) (4) (5)
	, Load (ImmValue (4)) (2)
	, Load (ImmValue (13)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (0)) (2)
	, Load (ImmValue (13)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, WriteInstr (3) (IndAddr (2))
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (1)) (2)
	, WriteInstr (2) (DirAddr (81))
	, Load (ImmValue (1)) (2)
	, WriteInstr (2) (DirAddr (83))
	, ReadInstr (DirAddr (91))
	, Receive (2)
	, Load (ImmValue (1)) (3)
	, Compute Xor (2) (3) (2)
	, Branch (2) (Abs (181))
	, ReadInstr (DirAddr (93))
	, Receive (2)
	, Load (ImmValue (1)) (3)
	, Compute Xor (2) (3) (2)
	, Branch (2) (Abs (186))
	, EndProg
	]
prog1 =
	[Jump (Abs (164))
	, Load (ImmValue (0)) (2)
	, Compute Add (7) (2) (2)
	, Load (IndAddr (2)) (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (0)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, Load (ImmValue (1)) (2)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (0)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (1)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Compute Gt (2) (3) (2)
	, Load (ImmValue (2)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Branch (2) (Abs (41))
	, Load (ImmValue (1)) (2)
	, Load (ImmValue (3)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (3)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-1)) (4)
	, Compute Add (2) (4) (2)
	, Store (3) (IndAddr (2))
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-2)) (4)
	, Compute Add (2) (4) (2)
	, Load (IndAddr (2)) (6)
	, Jump (Ind (6))
	, Jump (Abs (161))
	, Load (ImmValue (0)) (2)
	, Compute Add (7) (2) (2)
	, Load (IndAddr (2)) (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (4)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, Load (ImmValue (1)) (2)
	, Load (ImmValue (5)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (4)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (5)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Compute Sub (2) (3) (2)
	, Load (ImmValue (6)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (3)) (4)
	, Compute Add (7) (4) (7)
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-2)) (4)
	, Compute Add (2) (4) (2)
	, Load (ImmValue (79)) (6)
	, Store (6) (IndAddr (2))
	, Load (ImmValue (0)) (3)
	, Compute Add (3) (7) (3)
	, Load (ImmValue (6)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Store (2) (IndAddr (3))
	, Load (ImmValue (7)) (4)
	, Compute Add (5) (4) (5)
	, Jump (Abs (1))
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-1)) (4)
	, Compute Add (2) (4) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (-3)) (4)
	, Compute Add (7) (4) (7)
	, Load (ImmValue (-7)) (4)
	, Compute Add (5) (4) (5)
	, Load (ImmValue (7)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (0)) (2)
	, Compute Add (7) (2) (2)
	, Load (IndAddr (2)) (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (8)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, Load (ImmValue (2)) (2)
	, Load (ImmValue (9)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (8)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (9)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Compute Sub (2) (3) (2)
	, Load (ImmValue (10)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (3)) (4)
	, Compute Add (7) (4) (7)
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-2)) (4)
	, Compute Add (2) (4) (2)
	, Load (ImmValue (128)) (6)
	, Store (6) (IndAddr (2))
	, Load (ImmValue (0)) (3)
	, Compute Add (3) (7) (3)
	, Load (ImmValue (10)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Store (2) (IndAddr (3))
	, Load (ImmValue (11)) (4)
	, Compute Add (5) (4) (5)
	, Jump (Abs (1))
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-1)) (4)
	, Compute Add (2) (4) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (-3)) (4)
	, Compute Add (7) (4) (7)
	, Load (ImmValue (-11)) (4)
	, Compute Add (5) (4) (5)
	, Load (ImmValue (11)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (7)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (11)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Compute Add (2) (3) (2)
	, Load (ImmValue (12)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (12)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-1)) (4)
	, Compute Add (2) (4) (2)
	, Store (3) (IndAddr (2))
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-2)) (4)
	, Compute Add (2) (4) (2)
	, Load (IndAddr (2)) (6)
	, Jump (Ind (6))
	, Load (ImmValue (2)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (50)) (4)
	, Compute Add (5) (4) (5)
	, ReadInstr (DirAddr (81))
	, Receive (2)
	, Load (ImmValue (1)) (3)
	, Compute Xor (2) (3) (2)
	, Branch (2) (Abs (166))
	, Load (ImmValue (1)) (2)
	, WriteInstr (2) (DirAddr (82))
	, ReadInstr (DirAddr (92))
	, Receive (2)
	, Load (ImmValue (1)) (3)
	, Compute Xor (2) (3) (2)
	, Branch (2) (Abs (173))
	, Load (ImmValue (1)) (2)
	, WriteInstr (2) (DirAddr (91))
	, EndProg
	]
prog2 =
	[Jump (Abs (164))
	, Load (ImmValue (0)) (2)
	, Compute Add (7) (2) (2)
	, Load (IndAddr (2)) (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (0)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, Load (ImmValue (1)) (2)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (0)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (1)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Compute Gt (2) (3) (2)
	, Load (ImmValue (2)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Branch (2) (Abs (41))
	, Load (ImmValue (1)) (2)
	, Load (ImmValue (3)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (3)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-1)) (4)
	, Compute Add (2) (4) (2)
	, Store (3) (IndAddr (2))
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-2)) (4)
	, Compute Add (2) (4) (2)
	, Load (IndAddr (2)) (6)
	, Jump (Ind (6))
	, Jump (Abs (161))
	, Load (ImmValue (0)) (2)
	, Compute Add (7) (2) (2)
	, Load (IndAddr (2)) (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (4)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, Load (ImmValue (1)) (2)
	, Load (ImmValue (5)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (4)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (5)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Compute Sub (2) (3) (2)
	, Load (ImmValue (6)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (3)) (4)
	, Compute Add (7) (4) (7)
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-2)) (4)
	, Compute Add (2) (4) (2)
	, Load (ImmValue (79)) (6)
	, Store (6) (IndAddr (2))
	, Load (ImmValue (0)) (3)
	, Compute Add (3) (7) (3)
	, Load (ImmValue (6)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Store (2) (IndAddr (3))
	, Load (ImmValue (7)) (4)
	, Compute Add (5) (4) (5)
	, Jump (Abs (1))
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-1)) (4)
	, Compute Add (2) (4) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (-3)) (4)
	, Compute Add (7) (4) (7)
	, Load (ImmValue (-7)) (4)
	, Compute Add (5) (4) (5)
	, Load (ImmValue (7)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (0)) (2)
	, Compute Add (7) (2) (2)
	, Load (IndAddr (2)) (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (8)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, Load (ImmValue (2)) (2)
	, Load (ImmValue (9)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (8)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (9)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Compute Sub (2) (3) (2)
	, Load (ImmValue (10)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (3)) (4)
	, Compute Add (7) (4) (7)
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-2)) (4)
	, Compute Add (2) (4) (2)
	, Load (ImmValue (128)) (6)
	, Store (6) (IndAddr (2))
	, Load (ImmValue (0)) (3)
	, Compute Add (3) (7) (3)
	, Load (ImmValue (10)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Store (2) (IndAddr (3))
	, Load (ImmValue (11)) (4)
	, Compute Add (5) (4) (5)
	, Jump (Abs (1))
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-1)) (4)
	, Compute Add (2) (4) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (-3)) (4)
	, Compute Add (7) (4) (7)
	, Load (ImmValue (-11)) (4)
	, Compute Add (5) (4) (5)
	, Load (ImmValue (11)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (7)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (11)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Compute Add (2) (3) (2)
	, Load (ImmValue (12)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (12)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-1)) (4)
	, Compute Add (2) (4) (2)
	, Store (3) (IndAddr (2))
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-2)) (4)
	, Compute Add (2) (4) (2)
	, Load (IndAddr (2)) (6)
	, Jump (Ind (6))
	, Load (ImmValue (2)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (50)) (4)
	, Compute Add (5) (4) (5)
	, ReadInstr (DirAddr (82))
	, Receive (2)
	, Load (ImmValue (1)) (3)
	, Compute Xor (2) (3) (2)
	, Branch (2) (Abs (166))
	, Load (ImmValue (8)) (2)
	, Load (ImmValue (14)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (2)) (4)
	, Compute Add (7) (4) (7)
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-2)) (4)
	, Compute Add (2) (4) (2)
	, Load (ImmValue (191)) (6)
	, Store (6) (IndAddr (2))
	, Load (ImmValue (0)) (3)
	, Compute Add (3) (7) (3)
	, Load (ImmValue (14)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Store (2) (IndAddr (3))
	, Load (ImmValue (15)) (4)
	, Compute Add (5) (4) (5)
	, Jump (Abs (1))
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-1)) (4)
	, Compute Add (2) (4) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (-2)) (4)
	, Compute Add (7) (4) (7)
	, Load (ImmValue (-15)) (4)
	, Compute Add (5) (4) (5)
	, Load (ImmValue (15)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (15)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, WriteInstr (2) (DirAddr (65536))
	, Load (ImmValue (1)) (2)
	, WriteInstr (2) (DirAddr (92))
	, EndProg
	]
prog3 =
	[Jump (Abs (164))
	, Load (ImmValue (0)) (2)
	, Compute Add (7) (2) (2)
	, Load (IndAddr (2)) (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (0)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, Load (ImmValue (1)) (2)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (0)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (1)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Compute Gt (2) (3) (2)
	, Load (ImmValue (2)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Branch (2) (Abs (41))
	, Load (ImmValue (1)) (2)
	, Load (ImmValue (3)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (3)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-1)) (4)
	, Compute Add (2) (4) (2)
	, Store (3) (IndAddr (2))
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-2)) (4)
	, Compute Add (2) (4) (2)
	, Load (IndAddr (2)) (6)
	, Jump (Ind (6))
	, Jump (Abs (161))
	, Load (ImmValue (0)) (2)
	, Compute Add (7) (2) (2)
	, Load (IndAddr (2)) (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (4)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, Load (ImmValue (1)) (2)
	, Load (ImmValue (5)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (4)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (5)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Compute Sub (2) (3) (2)
	, Load (ImmValue (6)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (3)) (4)
	, Compute Add (7) (4) (7)
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-2)) (4)
	, Compute Add (2) (4) (2)
	, Load (ImmValue (79)) (6)
	, Store (6) (IndAddr (2))
	, Load (ImmValue (0)) (3)
	, Compute Add (3) (7) (3)
	, Load (ImmValue (6)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Store (2) (IndAddr (3))
	, Load (ImmValue (7)) (4)
	, Compute Add (5) (4) (5)
	, Jump (Abs (1))
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-1)) (4)
	, Compute Add (2) (4) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (-3)) (4)
	, Compute Add (7) (4) (7)
	, Load (ImmValue (-7)) (4)
	, Compute Add (5) (4) (5)
	, Load (ImmValue (7)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (0)) (2)
	, Compute Add (7) (2) (2)
	, Load (IndAddr (2)) (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (8)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, Load (ImmValue (2)) (2)
	, Load (ImmValue (9)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (8)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (9)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Compute Sub (2) (3) (2)
	, Load (ImmValue (10)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (3)) (4)
	, Compute Add (7) (4) (7)
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-2)) (4)
	, Compute Add (2) (4) (2)
	, Load (ImmValue (128)) (6)
	, Store (6) (IndAddr (2))
	, Load (ImmValue (0)) (3)
	, Compute Add (3) (7) (3)
	, Load (ImmValue (10)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Store (2) (IndAddr (3))
	, Load (ImmValue (11)) (4)
	, Compute Add (5) (4) (5)
	, Jump (Abs (1))
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-1)) (4)
	, Compute Add (2) (4) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (-3)) (4)
	, Compute Add (7) (4) (7)
	, Load (ImmValue (-11)) (4)
	, Compute Add (5) (4) (5)
	, Load (ImmValue (11)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (7)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (11)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Compute Add (2) (3) (2)
	, Load (ImmValue (12)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (12)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-1)) (4)
	, Compute Add (2) (4) (2)
	, Store (3) (IndAddr (2))
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-2)) (4)
	, Compute Add (2) (4) (2)
	, Load (IndAddr (2)) (6)
	, Jump (Ind (6))
	, Load (ImmValue (2)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (50)) (4)
	, Compute Add (5) (4) (5)
	, ReadInstr (DirAddr (83))
	, Receive (2)
	, Load (ImmValue (1)) (3)
	, Compute Xor (2) (3) (2)
	, Branch (2) (Abs (166))
	, Load (ImmValue (6)) (2)
	, Load (ImmValue (16)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (2)) (4)
	, Compute Add (7) (4) (7)
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-2)) (4)
	, Compute Add (2) (4) (2)
	, Load (ImmValue (191)) (6)
	, Store (6) (IndAddr (2))
	, Load (ImmValue (0)) (3)
	, Compute Add (3) (7) (3)
	, Load (ImmValue (16)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Store (2) (IndAddr (3))
	, Load (ImmValue (17)) (4)
	, Compute Add (5) (4) (5)
	, Jump (Abs (1))
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-1)) (4)
	, Compute Add (2) (4) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (-2)) (4)
	, Compute Add (7) (4) (7)
	, Load (ImmValue (-17)) (4)
	, Compute Add (5) (4) (5)
	, Load (ImmValue (17)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (17)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, WriteInstr (2) (DirAddr (65536))
	, Load (ImmValue (1)) (2)
	, WriteInstr (2) (DirAddr (93))
	, EndProg
	]
main = run [prog0, prog1, prog2, prog3]