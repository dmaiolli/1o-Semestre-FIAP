aux = input("Digite seu RM: ")
rm = int(aux)

a = rm % 10 

b = (rm % 100) // 10

c = (rm % 1000) // 100

d = (rm % 10000) // 1000

e = (rm % 100000) // 10000

print("A soma do seu rm é: ", a + b + c + d + e)