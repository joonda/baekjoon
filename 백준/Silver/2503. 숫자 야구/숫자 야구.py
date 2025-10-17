from itertools import permutations

# 324

# 429 -> 1s 1b
# 241 -> 0s 2b
# 924 -> 2s 0b

# 123 -> 1s 1b
# 356 -> 1s 0b
# 327 -> 2s 0b
# 489 -> 0s 1b

N = int(input())
infos = [input().split() for _ in range(N)]

ans = 0

for cur in permutations(range(1, 10), 3):
	ok = True

	for num, st, bl in infos:
		real_st = real_bl = 0

		for i in range(3):
			if str(cur[i]) == num[i]:
				real_st += 1
			elif str(cur[i]) in num:
				real_bl += 1

		if real_st != int(st) or real_bl != int(bl):
			ok = False

	if ok:
		ans += 1

print(ans)