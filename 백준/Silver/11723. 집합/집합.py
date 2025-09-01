import sys

inputValue = sys.stdin.readline
outputWrite = sys.stdout.write

m = int(inputValue())
arr = [False] * 21

for _ in range(m):
    line = inputValue().split()

    if line[0] != 'all' and line[0] != 'empty':
        x = int(line[1])
        if line[0] == 'add':
            arr[x] = True
        elif line[0] == 'remove':
            arr[x] = False
        elif line[0] == 'check':
            outputWrite('1\n' if arr[x] else '0\n')
        elif line[0] == 'toggle':
            arr[x] = not arr[x]
    elif line[0] == 'all':
        for i in range(1, 21):
            arr[i] = True
    elif line[0] == 'empty':
        for i in range(1, 21):
            arr[i] = False