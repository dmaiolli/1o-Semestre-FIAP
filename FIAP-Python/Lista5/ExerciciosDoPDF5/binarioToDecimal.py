import math
numBinario = int(input("Digite o numero binario: "))
soma = 0
potDois = 1

while numBinario != 0:
    resto = numBinario % 10
    numBinario = numBinario // 10
    if resto == 1:
        soma = soma + potDois
    potDois *= 2

print("Resposta: ", soma)