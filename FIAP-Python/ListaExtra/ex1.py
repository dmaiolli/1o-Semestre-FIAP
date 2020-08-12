import random

numero = int(input("Digite um numero de 1 a 100: "))
sorteado = random.randint(1, 101)
print(sorteado)
tentativas = 1

while numero != sorteado:
    if numero > sorteado:
        numero = int(input("O numero sorteado é menor que esse, tente outra vez: "))
    elif numero < sorteado:
        numero = int(input("O numero sorteado é maior que esse, tente outra vez: "))
    tentativas += 1
    
print("Parabens você acertou o numero com %d tentativas" %(tentativas))

