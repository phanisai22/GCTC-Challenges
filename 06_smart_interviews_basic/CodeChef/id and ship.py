d = {"c": "Cruiser",
     "d": "Destroyer",
     "b": "BattleShip",
     "f": "Frigate"}

T = int(input())

for k in range(T):
    s = input().lower().strip()
    print(d[s])
