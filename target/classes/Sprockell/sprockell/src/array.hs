import Sprockell
prog0 =
	[Jump (Abs (1))
	, Load (ImmValue (50)) (4)
	, Compute Add (5) (4) (5)
	, Load (ImmValue (2)) (2)
	, Load (ImmValue (0)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (0)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (3)) (2)
	, Load (ImmValue (13)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (13)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (2)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (4)) (2)
	, Load (ImmValue (14)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (14)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (3)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (5)) (2)
	, Load (ImmValue (15)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (15)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (4)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (6)) (2)
	, Load (ImmValue (16)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (16)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (5)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (7)) (2)
	, Load (ImmValue (17)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (17)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (6)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (2)) (2)
	, Load (ImmValue (18)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (18)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (7)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (3)) (2)
	, Load (ImmValue (19)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (19)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (8)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (4)) (2)
	, Load (ImmValue (20)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (20)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (9)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (5)) (2)
	, Load (ImmValue (21)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (21)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (10)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (6)) (2)
	, Load (ImmValue (22)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (22)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (11)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (7)) (2)
	, Load (ImmValue (23)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (23)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (12)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (0)) (2)
	, Load (ImmValue (1)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, WriteInstr (3) (IndAddr (2))
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (2)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, WriteInstr (3) (IndAddr (2))
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (3)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, WriteInstr (3) (IndAddr (2))
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (4)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, WriteInstr (3) (IndAddr (2))
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (5)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, WriteInstr (3) (IndAddr (2))
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (6)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, WriteInstr (3) (IndAddr (2))
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (7)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, WriteInstr (3) (IndAddr (2))
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (8)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, WriteInstr (3) (IndAddr (2))
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (9)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, WriteInstr (3) (IndAddr (2))
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (10)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, WriteInstr (3) (IndAddr (2))
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (11)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, WriteInstr (3) (IndAddr (2))
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (12)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, WriteInstr (3) (IndAddr (2))
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (0)) (2)
	, Load (ImmValue (24)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (0)) (2)
	, Load (ImmValue (25)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (0)) (2)
	, Load (ImmValue (26)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (26)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Load (ImmValue (25)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (6)) (4)
	, Compute Mul (3) (4) (3)
	, Compute Add (2) (3) (2)
	, Load (ImmValue (25)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (2)) (2)
	, Load (ImmValue (27)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (27)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, Load (ImmValue (25)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, Load (ImmValue (1)) (4)
	, Compute Mul (3) (4) (3)
	, Compute Add (2) (3) (2)
	, Load (ImmValue (25)) (4)
	, Compute Add (4) (5) (4)
	, Store (2) (IndAddr (4))
	, Load (ImmValue (24)) (3)
	, Compute Add (3) (5) (3)
	, Load (IndAddr (3)) (3)
	, WriteInstr (3) (IndAddr (2))
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (0)) (2)
	, ReadInstr (IndAddr (2))
	, Receive (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (28)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, ReadInstr (IndAddr (2))
	, Receive (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (29)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, ReadInstr (IndAddr (2))
	, Receive (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (30)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, ReadInstr (IndAddr (2))
	, Receive (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (31)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, ReadInstr (IndAddr (2))
	, Receive (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (32)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, ReadInstr (IndAddr (2))
	, Receive (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (33)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, ReadInstr (IndAddr (2))
	, Receive (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (34)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, ReadInstr (IndAddr (2))
	, Receive (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (35)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, ReadInstr (IndAddr (2))
	, Receive (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (36)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, ReadInstr (IndAddr (2))
	, Receive (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (37)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, ReadInstr (IndAddr (2))
	, Receive (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (38)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, ReadInstr (IndAddr (2))
	, Receive (3)
	, Load (ImmValue (1)) (4)
	, Compute Add (4) (2) (2)
	, Load (ImmValue (39)) (4)
	, Compute Add (4) (5) (4)
	, Store (3) (IndAddr (4))
	, Load (ImmValue (28)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, WriteInstr (2) (DirAddr (65536))
	, Load (ImmValue (29)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, WriteInstr (2) (DirAddr (65536))
	, Load (ImmValue (30)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, WriteInstr (2) (DirAddr (65536))
	, Load (ImmValue (31)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, WriteInstr (2) (DirAddr (65536))
	, Load (ImmValue (32)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, WriteInstr (2) (DirAddr (65536))
	, Load (ImmValue (33)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, WriteInstr (2) (DirAddr (65536))
	, Load (ImmValue (34)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, WriteInstr (2) (DirAddr (65536))
	, Load (ImmValue (35)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, WriteInstr (2) (DirAddr (65536))
	, Load (ImmValue (36)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, WriteInstr (2) (DirAddr (65536))
	, Load (ImmValue (37)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, WriteInstr (2) (DirAddr (65536))
	, Load (ImmValue (38)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, WriteInstr (2) (DirAddr (65536))
	, Load (ImmValue (39)) (2)
	, Compute Add (2) (5) (2)
	, Load (IndAddr (2)) (2)
	, WriteInstr (2) (DirAddr (65536))
	, EndProg
	]
main = run [prog0]
