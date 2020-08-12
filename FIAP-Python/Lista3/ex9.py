import math
a = float(input("Digite o valor de A: "))
b = float(input("Digite o valor de B: "))
c = float(input("Digite o valor de C: "))

delta = b ** 2 - 4 * a * c

if a == 0:
    print("Essa não é uma função do 2º grau")

elif delta < 0:
    print("A equação não possui raizes reais")

elif delta >= 0:

    raiz1 = (-b - math.sqrt(delta)) / (2 * a)

    raiz2 = (-b + math.sqrt(delta)) / (2 * a)

    print("A raiz 1 é", raiz1)
    print("A raiz 2 e", raiz2)