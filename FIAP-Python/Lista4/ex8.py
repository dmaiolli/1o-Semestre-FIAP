num = int(input("Digite um numero para saber se ele é primo ou não: "))
divisores = 0
i = 1

while i <= num:
    if num % i == 0:
        divisores += 1

    i += 1

if divisores == 2:
        print("{} é um numero primo".format(num))

else:
        print("{} não é um numero primo".format(num))