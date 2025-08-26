string = input()
sum = 0
index_even = False

for i in range(13):
    if string[i] == '*':
        if i % 2 != 0:
            index_even = True
        continue
    sum += int(string[i]) * (1 if i % 2 == 0 else 3)

if index_even:
    for i in range(10):
        if (sum + (i * 3)) % 10 == 0:
            print(i)
            break
else:
    print(10 - sum % 10)