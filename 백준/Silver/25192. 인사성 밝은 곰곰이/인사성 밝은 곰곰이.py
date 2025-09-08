# 인사성 밝은 곰곰이

import sys

inputValue = sys.stdin.readline
outputValue = sys.stdout.write

n = int(inputValue())
temp = set([])
answer = 0

for i in range(n):
    line = inputValue().strip()

    if line == 'ENTER':
        answer += len(temp)
        temp.clear()
    else:
        temp.add(line)

outputValue(str(answer+len(temp)))