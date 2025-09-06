import sys

inputValue = sys.stdin.readline
outputValue = sys.stdout.write

n = int(inputValue())

def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)

outputValue(str(factorial(n)))