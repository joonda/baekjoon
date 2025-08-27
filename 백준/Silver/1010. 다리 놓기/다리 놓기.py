T = int(input())

def comb(m, n):
    res = 1
    for i in range(n):
        res *= (m - i)
        res //= (i + 1)
    return res

res = 1
for i in range(T):
    n, m = map(int, input().split())
    print(comb(m, n))