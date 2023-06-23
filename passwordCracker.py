t = int(input().strip())

def solve(ws, x):
    dead_end = set()
    
    stack = []
    stack.append(([], x))
    while stack:
        acc, cur = stack.pop()
        
        if cur == "":
            return acc

        is_dead_end = True
        for w in ws:
            if cur.startswith(w):
                cur2 = cur[len(w):]
                if cur2 in dead_end:
                    continue
                is_dead_end = False    
                acc2 = acc[:]
                acc2.append(w)
                stack.append((acc2, cur2))
        
        if is_dead_end:
            dead_end.add(cur)
            
for _ in range(t):
    n = int(input().strip())
    ws = [tmp for tmp in input().strip().split(' ')]
    x = input().strip()
    answer = solve(ws, x)
    if answer is None:
        print("WRONG PASSWORD")
    else:
        print(" ".join(answer))