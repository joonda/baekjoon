# queuestack

import sys
from collections import deque

inputValue = sys.stdin.readline
outputValue = sys.stdout.write

# queue stack을 구성하는 자료 개수
n = int(inputValue())

# 0 -> 큐, 1 -> 스택 (0, 1, 1, 0)
types = list(map(int, inputValue().split()))

# 자료구조에 속해있는 원소 (1, 2, 3, 4)
values = list(map(int, inputValue().split()))

# 삽입할 원소의 개수
k = int(inputValue())

# 삽입할 원소 (2, 4, 7)
arr = list(map(int, inputValue().split()))

dq = deque()

for qs in range(n):
    if types[qs] == 0:
        dq.appendleft(values[qs])

for i in range(k):
    dq.append(arr[i])
    print(dq.popleft(), end=' ')