N, M = map(int, input().split())

# 거리를 담는 리스트
dis = list(map(int, input().split()))

# 책의 거리를 sort
books = sorted(dis, key=lambda x : x)

# 왼쪽과 오른쪽으로 구분하여 리스트로 저장
left = sorted([-x for x in books if x < 0])
right = sorted([x for x in books if x > 0])

distances = []

# 리스트의 맨 마지막부터 맨 첫번째 인덱스 (0)까지 M을 기점으로 띄운다.
for i in range(len(left)-1, -1, -M):
    distances.append(left[i])

for i in range(len(right)-1, -1, -M):
    distances.append(right[i])

# distance의 합을 구한 뒤, max 값을 한 번 뺀다
# 가장 먼 거리는 마지막에 가고 다시 돌아올 필요가 없기 때문에 max 값은 제외
total = sum(d * 2 for d in distances)
total -= max(distances)

print(total)