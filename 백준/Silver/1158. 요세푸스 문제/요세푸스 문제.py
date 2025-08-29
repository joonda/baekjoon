from collections import deque

n, k = map(int, input().split())
deque = deque()

for i in range(1, n+1):
    deque.append(i)

print("<", end="")

while len(deque) > 1:
    for i in range(k):
        num = deque.popleft()
        deque.append(num)

    print(deque.pop(), end=", ")

print(deque.popleft(), end="")
print(">")