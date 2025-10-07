# 최소 한개의 모음, 두개의 자음이 포함

vows = ['a', 'e', 'i', 'o', 'u'] # 모음
choose = []

def is_possible():
	global L, C, S, choose

	vow = 0
	for c in choose:
		vow += (c in vows) 

	con = L - vow

	return (vow >= 1 and con >= 2)

def combination(index, level):
	global L, C, S, choose

	if level == L:
		if is_possible():
			for u in choose:
				print(u, end='')
			print()
		return

	for i in range(index, C):
		choose.append(S[i])
		combination(i+1, level+1)
		choose.pop()

L, C = list(map(int, input().split()))
S = list(map(str, input().split()))
S = sorted(S)

combination(0, 0)