n, m = map(int, input().split())

arr = []

def permutation(start):
    if len(arr) == m:
        print(*arr)
        return

    for num in range(start, n+1):
        if arr and arr[-1] > num:  # 마지막 원소보다 작으면 패스
            continue
        arr.append(num)
        permutation(start)
        arr.pop()

permutation(1)