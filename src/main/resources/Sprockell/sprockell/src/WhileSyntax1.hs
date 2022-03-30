import Sprockell
prog0 =
	[Jump (Abs (1))
	, Load (ImmValue (50)) (4)
	, Compute Add (5) (4) (5)
	, EndProg
	]
main = run [prog0]
