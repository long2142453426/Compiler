import Sprockell
prog0 =
	[Jump (Abs (1))
	, Load (ImmValue (50)) (4)
	, Compute Add (5) (4) (5)
	, Load (ImmValue (2)) (4)
	, Compute Add (7) (4) (7)
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-2)) (4)
	, Compute Add (2) (4) (2)
	, Load (ImmValue (13)) (6)
	, Store (6) (IndAddr (2))
	, Load (ImmValue (0)) (4)
	, Compute Add (5) (4) (5)
	, Jump (Abs (1))
	, Compute Add (7) (0) (2)
	, Load (ImmValue (-1)) (4)
	, Compute Add (2) (4) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (-2)) (4)
	, Compute Add (7) (4) (7)
	, Load (ImmValue (0)) (4)
	, Compute Add (5) (4) (5)
	, Load (ImmValue (0)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (0)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, WriteInstr (2) (DirAddr (65536))
	, EndProg
	]
main = run [prog0]
