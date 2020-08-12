import random

sorteado = random.randrange(1, 11)
print(sorteado)

chute1=int(input("Digite o 1º chute: "))
acertou = False

if chute1 == sorteado:
    print("Você acertou, parabens")
    acertou = True

elif chute1 < sorteado:
    print("O numero sorteado é maior, te restam 2 chances")

elif chute1 > sorteado:
    print("O numero sorteado é menor, te restam 2 chances")

if not acertou:
    chute2 = int(input("Digite o 2º chute: "))

    if chute2 == sorteado:
        print("Você acertou, parabens")
        acertou = True

    elif chute2 < sorteado:
        print("O numero sorteado é maior, te restam 1 chances")

    elif chute2 > sorteado:
        print("O numero sorteado é menor, te restam 1 chances")

if not acertou:
    chute3 = int(input("Digite o 3º chute: "))

    if chute3 == sorteado:
        print("Você acertou, parabens")
        acertou = True

    elif chute3 < sorteado:
        print("infelizmente você perdeu, o numero era", sorteado)

    elif chute3 > sorteado:
        print("infelizmente você perdeu, o numero era", sorteado)