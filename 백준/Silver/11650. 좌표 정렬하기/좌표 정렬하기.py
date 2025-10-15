N = int(input())

lst = [tuple(map(int, input().split())) for _ in range(N)]

sorted_lst = sorted(lst, key = lambda x : x)

for x, y in sorted_lst:
	print(x, y)