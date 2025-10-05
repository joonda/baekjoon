choose = []

def combination(index, level):
	if level == 6:
		print(*choose)
		return

	for i in range(index, k):
		choose.append(s[i])
		combination(i+1, level+1)
		choose.pop()

while True:
	data = list(map(int, input().split()))
	if data[0] == 0:
		break
	k = data[0]
	s = data[1:]
	combination(0, 0)
	print()