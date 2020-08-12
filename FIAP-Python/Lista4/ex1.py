num = int(input("Digite um numero: "))
soma = 0

while num != 0:
    if num % 2 == 0:
        soma += num
    num = int(input("Digite um numero: "))

print(soma)
    