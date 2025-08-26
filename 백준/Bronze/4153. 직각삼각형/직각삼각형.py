while True:
    a, b, c = map(int, input().split())

    if a == b == c == 0:
        break
    else:
        arr = [a, b, c]
        arr.sort()
        if (arr[0] ** 2 + arr[1] ** 2) == arr[2] ** 2:
            print('right')
        else:
            print('wrong')
