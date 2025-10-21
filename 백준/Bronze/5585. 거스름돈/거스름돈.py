money = int(input())
change = 1000 - money

use500 = change // 500
change %= 500
use100 = change // 100
change %= 100
use50 = change // 50
change %= 50
use10 = change // 10
change %= 10
use5 = change // 5
change %= 5
use1 = change // 1
change %= 1

print(use500 + use100 + use50 + use10 + use5 + use1)