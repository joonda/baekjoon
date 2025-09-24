# 카드 놓기

n = int(input())
k = int(input())

cards = [input().strip() for _ in range(n)]

result = set()

def permutation(arr, used):
    if len(arr) == k:
        result.add(''.join(arr))
        return

    for i in range(n):
        if i not in used:
            arr.append(cards[i])
            used.add(i)
            permutation(arr, used)
            arr.pop()
            used.remove(i)

permutation([], set())
print(len(result))