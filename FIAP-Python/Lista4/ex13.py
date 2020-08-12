num = int(input("Digite um numero para saber se ele é palíndromo ou não: "))
numOriginal = num
resp = 0

while num != 0:
    d = num % 10
    num = num // 10
    resp = resp * 10 + d

if numOriginal == resp:
    print("é um palindromo")
else:
    print("Nao é ")
print(resp)