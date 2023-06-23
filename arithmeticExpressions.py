def arithmeticExpressions(arr):
    this = [None] * 101
    this[arr[0]] = [arr[0]]
    for a in arr[1:]:
        if this[0]:
            this[0] += ['*', a]
        else:
            that = [None] * 101
            for i, v in enumerate(this):
                if v is not None:
                    that[(i+a)%101] = this[i] + ['+', a]
                    that[(i-a)%101] = this[i] + ['-', a]
                    that[(i*a)%101] = this[i] + ['*', a]
            this = that
    return ''.join(map(str, this[0]))

n=int(input())
arr=list(map(int,input().split()))
print(arithmeticExpressions(arr))