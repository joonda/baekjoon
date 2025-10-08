N = int(input())
check = [False] * N

lst = []

choose = []

for i in range(1, N+1):
	lst.append(i)

def permutation(level):
	if level == N:
		print(*choose)
		return

	for i in range(0, N):
		if check[i] == True:
			continue

		choose.append(lst[i])
		check[i] = True

		permutation(level+1)

		check[i] = False
		choose.pop()

permutation(0)