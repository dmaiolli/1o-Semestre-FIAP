aux = input("Escreva seu salário inicial: ")
salarioInicial = float(aux)

aux = input("Escreva seu salário final: ")
salarioFinal = float(aux)

a = salarioFinal * 100 
b = a / salarioInicial

print("O aumento percentual foi de: ", b - 100 ,"%")