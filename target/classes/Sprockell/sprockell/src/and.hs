import Sprockell
prog0 =
	[Jump (Abs (1))
	, Load (ImmValue (50)) (4)
	, Compute Add (5) (4) (5)
	, Load (ImmValue (1)) (2)
	, Load (ImmValue (0)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (0)) (2)
	, Compute Add (7) (2) (2)
	, Load (ImmValue (0)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Store (3) (IndAddr (2))
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (0)) (2)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (1)) (2)
	, Compute Add (7) (2) (2)
	, Load (ImmValue (1)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Store (3) (IndAddr (2))
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (1)) (2)
	, Load (ImmValue (2)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (2)) (2)
	, Compute Add (7) (2) (2)
	, Load (ImmValue (2)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Store (3) (IndAddr (2))
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (0)) (2)
	, Compute Add (7) (2) (2)
	, Load (IndAddr (2)) (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (3)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, Load (ImmValue (1)) (2)
	, Compute Add (7) (2) (2)
	, Load (IndAddr (2)) (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (4)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, Load (ImmValue (3)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (4)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Compute And (2) (3) (2)
	, Load (ImmValue (5)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (5)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, WriteInstr (2) (DirAddr (65536))
	, Load (ImmValue (0)) (2)
	, Compute Add (7) (2) (2)
	, Load (IndAddr (2)) (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (6)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, Load (ImmValue (2)) (2)
	, Compute Add (7) (2) (2)
	, Load (IndAddr (2)) (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (7)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, Load (ImmValue (6)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (7)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Compute And (2) (3) (2)
	, Load (ImmValue (8)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (8)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, WriteInstr (2) (DirAddr (65536))
	, Load (ImmValue (0)) (2)
	, Compute Add (7) (2) (2)
	, Load (IndAddr (2)) (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (9)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, Load (ImmValue (1)) (2)
	, Compute Add (7) (2) (2)
	, Load (IndAddr (2)) (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (10)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, Load (ImmValue (9)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (10)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Compute Or (2) (3) (2)
	, Load (ImmValue (11)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (11)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, WriteInstr (2) (DirAddr (65536))
	, EndProg
	]
main = run [prog0]
