import sys

inputValue = sys.stdin.readline
outputValue = sys.stdout.write

n = int(inputValue())

arr = list(map(int, inputValue().split()))
arr.sort()

answer = arr[0] * arr[-1]

outputValue(str(answer))