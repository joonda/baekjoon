# 요세푸스 문제

from collections import deque

n, k = map(int, input().split())
q = deque()

for i in range(1, n+1):
    q.append(i)

print("<", end="")

while len(q) > 1:
    for i in range(k-1):
        num = q.popleft()
        q.append(num)

    print(q.popleft(), end=", ")

print(q.popleft(), end="")
print(">")