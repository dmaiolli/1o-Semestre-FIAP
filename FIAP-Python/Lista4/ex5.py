num = int(input("Digite um numero para saber seus divisores positivos: "))
contador = 1
i = 1

while contador <= num:
    if num % i == 0:
        print(i)
    i += 1
    contador += 1