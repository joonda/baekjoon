# 1986 스포츠 클라이밍
# 1989 스피드 클라이밍 
# 1999 볼더링 

# 1 * 5 * 2 = 10 낮은 순서가 종합 순위에서 앞섦.
# 두 선수의 곱한 수가 같을 시에는 합산 점수가 낮은 선수가 이긴다.

N = int(input())

arr = []

for i in range(N):
	record = list(map(int, input().split()))

	player = record[0]	
	score = record[1] * record[2] * record[3]
	score2 = record[1] + record[2] + record[3]

	arr.append(tuple((player, score, score2)))

sorted_arr = sorted(arr, key=lambda x : (x[1], x[2], x[0]))

for i in range(3):
	print(sorted_arr[i][0], end=' ')
