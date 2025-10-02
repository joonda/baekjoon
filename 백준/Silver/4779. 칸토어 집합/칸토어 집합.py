def cantor(n):
	if n == 0:
		print('-', end='')
		return 

	cantor(n-1)
	print(' ' * (3 ** (n-1)), end='')
	cantor(n-1)
	

while True:
	try:
		N = int(input())
		cantor(N)
		print()
	except:
		break