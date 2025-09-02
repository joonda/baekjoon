import sys

inputValue = sys.stdin.readline
outputWrite = sys.stdout.write

s = int(inputValue())

sum = 0
k = 0
i = 1

while sum+i <= s:
    sum += i
    i += 1
    k += 1

outputWrite(str(k))