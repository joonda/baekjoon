n, m = map(int, input().split())

def permutation(arr, n, m):
    if len(arr) == m:
        print(*arr)
        return

    for num in range(1, n+1):
        if num not in arr:
            arr.append(num)
            permutation(arr, n, m)
            arr.pop()

permutation([], n, m)