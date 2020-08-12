num = int(input("Digite um numero: "))
positivo = 0
negativo = 0

while num != 0:
   
    if num > 0:
        positivo += 1

    elif num < 0:
        negativo += 1
    
    num = int(input("Digite um numero: "))

print("Você digitou {} numeros positivos e {} numeros negativos".format(positivo, negativo))
