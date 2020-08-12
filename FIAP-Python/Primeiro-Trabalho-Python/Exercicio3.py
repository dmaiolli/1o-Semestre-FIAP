a = int(input("Digite o valor de a: "))
b = int(input("Digite o valor de b: "))

if a > 0 and b > 0:
    if a > b:
        mmc = a
    else:
        mmc = b

    while mmc % a != 0 or mmc % b != 0:
        mmc += 1
    print("MMC(%d,%d)=%d" %(a, b, mmc))

else:
    print("Insira um numero maior que 0")