import sys

inputValue = sys.stdin.readline
outputValue = sys.stdout.write

n = int(inputValue())

answer = { "ChongChong" }

for _ in range(n):
    line = inputValue()
    name1, name2 = line.strip().split(" ")
    if name1 in answer or name2 in answer:
        answer.add(name1)
        answer.add(name2)

outputValue(str(len(answer)))