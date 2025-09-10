import sys

inputValue = sys.stdin.readline
outputValue = sys.stdout.write

N, M = inputValue().strip().split()

word_dict = {}

for _ in range(int(N)):
    word = inputValue().strip()

    if len(word) < int(M):
        pass
    else: word_dict[word] = word_dict.get(word, 0) + 1

for key, value in sorted(word_dict.items(), key=lambda x: (-x[1], -len(x[0]), x[0])):
    outputValue(key + '\n')
