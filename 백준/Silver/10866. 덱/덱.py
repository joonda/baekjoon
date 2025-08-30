import sys
from collections import deque

input = sys.stdin.readline
n = int(input())

q = deque()
result = []

for _ in range(n):
    command = input().split()

    if command[0] == 'push_back':
        q.append(command[1])
    elif command[0] == 'push_front':
        q.appendleft(command[1])
    elif command[0] == 'pop_front':
        result.append(q.popleft() if q else -1)
    elif command[0] == 'pop_back':
        result.append(q.pop() if q else -1)
    elif command[0] == 'size':
        result.append(len(q))
    elif command[0] == 'empty':
        result.append(0 if q else 1)
    elif command[0] == 'front':
        result.append(q[0] if q else -1)
    elif command[0] == 'back':
        result.append(q[-1] if q else -1)

print(*result, sep="\n")