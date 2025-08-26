string = input().strip()

vowels = ['a', 'e', 'i', 'o', 'u']

result = []

i = 0

while i < len(string):
    result.append(string[i])

    if string[i] in vowels:
        i += 3
    else:
        i += 1

print(''.join(result))