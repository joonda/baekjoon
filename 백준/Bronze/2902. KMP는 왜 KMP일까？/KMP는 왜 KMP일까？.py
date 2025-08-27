name = input().split('-')

answer = ''

for i in range(len(name)):
    answer += name[i][0]

print(answer)