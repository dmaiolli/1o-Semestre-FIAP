num = int(input("Digite um numero para saber se ele é primo ou nao: "))
contador = 1

while contador <= num:

    if num % num != 1 and num % num == 0:
        print('Esse numero é primo')

    else:
        print("Esse numero nao é primo")
    contador += 1
        