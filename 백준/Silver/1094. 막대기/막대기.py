import sys

input = sys.stdin.readline
x = int(input())

length = 64
cur = 64
answer = 1

if x == 64:
    print(answer)
else:
    while True:
        cur /= 2 # 막대기 절반으로 자른다
        length -= cur # 막대기 1개 버렸다고 가정한다
        if length < x: # 만약 막대기 길이가 x보다 작다면
            answer += 1 # 막대기는 버리지 않는다
            length += cur # 1개 버렸다고 가정한걸 다시 복구
        elif length == x:
            break # 막대기의 합이 x와 같다면 break
    print(answer)