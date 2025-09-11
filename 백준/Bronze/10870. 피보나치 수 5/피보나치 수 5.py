import sys

inputValue = sys.stdin.readline
outputValue = sys.stdout.write

n = int(inputValue())

def fibonacci(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fibonacci(n-1) + fibonacci(n-2)


outputValue(str(fibonacci(n)))