n, m = map(int, input().split())
arr = []
def permutation(start):
    if len(arr) == m:
        print(*arr)
        return

    for num in range(start, n+1):
        if num not in arr:
            arr.append(num)
            permutation(num+1)
            arr.pop()

permutation(1)