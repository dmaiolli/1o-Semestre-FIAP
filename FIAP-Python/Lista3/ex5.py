aux = input("digite um numero: ")
n1 = int(aux)

aux = input("digite um numero: ")
n2 = int(aux)

if n1 // n2 == 0:
    print(n1, "é divisivel por", n2)

elif n2 // n1 == 0:
    print(n2, "é divisivel por", n1)

elif n1 // n2 != 0:
    print(n1, "nao é divisivel por", n2)

elif n2 // n1 != 0:
    print(n2, "nao é divisivel por", n1)