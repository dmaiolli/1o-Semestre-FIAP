num1 = int(input("Digite um numero: "))
op = input("Digite um operador: ")
num2 = int(input("Digite outro numero: "))

if op == "+":
    print(num1 + num2)

elif op == "-":
    print(num1 - num2)

elif op == "*":
    print(num1 * num2)

elif op == "/" and num1 == 0 or num2 == 0:
    print("Impossivel fazer calculo")

elif op == "/":
    print(num1 / num2)

