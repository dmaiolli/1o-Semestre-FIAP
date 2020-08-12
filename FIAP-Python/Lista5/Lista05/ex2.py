NumPrimo = False
def numPrimo():
    numPrimoo = 0

    num = 1

    while num < 100:
        num = num + 1
        if num % 10 == 0:
            print(num)

numero = numPrimo()
print(numero)