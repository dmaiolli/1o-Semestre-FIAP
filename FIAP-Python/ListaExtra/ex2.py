num = int(input("Digite um numero para saber se ele é perfeito ou não: "))
divisor = 1
soma = 0

while num >= divisor:
    if num % divisor == 0 and divisor != num:
        soma = soma + divisor
        divisor += 1
    else:
        divisor += 1

if soma == num:
    print("%d é um numero perfeito!" %(num))
else:
    print("%d não é um numero perfeito!" %(num))
    