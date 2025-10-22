N = int(input())

A = list(map(int, input().split()))
B = list(map(int, input().split()))

sorted_A = sorted(A, key=lambda x : -x)
sorted_B = sorted(B)

sum = 0

for i in range(N):
	sum += sorted_A[i] * sorted_B[i]

print(sum)