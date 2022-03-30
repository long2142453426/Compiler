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
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Branch (2) (Rel (2))
	, Jump (Abs (13))
	, Jump (Abs (3))
	, EndProg
	]
main = run [prog0]
