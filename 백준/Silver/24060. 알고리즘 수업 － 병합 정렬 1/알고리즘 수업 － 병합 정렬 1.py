# 알고리즘 수업 - 병합정렬

import sys

N, K = map(int, sys.stdin.readline().split())
A = list(map(int, sys.stdin.readline().split()))

cnt = 0
answer = -1

def merge_sort(A, p, r):
    if p < r:
        q = (p + r) // 2 # 배열 길이의 중앙 값
        merge_sort(A, p, q) # 재귀적으로 전반부 정렬
        merge_sort(A, q + 1, r) # 재귀적으로 후반부 정렬
        merge(A, p, q, r) # 병합

# A[p ~ q] / A[(q + 1) ~ r]
def merge(A, p, q, r):
    global cnt, K, answer
    i = p
    j = q + 1
    tmp = []
    while i <= q and j <= r:
        if A[i] <= A[j]:
            tmp.append(A[i])
            i += 1
        else:
            tmp.append(A[j])
            j += 1

    while i <= q:
        tmp.append(A[i])
        i += 1
    while j <= r:
        tmp.append(A[j])
        j += 1

    i = p
    t = 0
    while t < len(tmp):
        A[i] = tmp[t]
        cnt += 1
        if cnt == K:
            answer = tmp[t]
            break
        t += 1
        i += 1

merge_sort(A, 0, N - 1)

sys.stdout.write(str(answer))