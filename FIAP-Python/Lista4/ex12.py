num = int(input("Digite um numero: "))
a1 = 1
a2 = 1

if num == 1 or num == 2:
    print("1")

else:
    contador = 3
    while contador <= num:
        result = a1 + a2
        a1 = a2
        a2 = result
        contador += 1
    print(result)