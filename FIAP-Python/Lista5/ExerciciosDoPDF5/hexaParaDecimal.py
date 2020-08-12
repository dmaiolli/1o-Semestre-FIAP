numeroHexa = input("Informe um numero em hexadecimal: ")
potencia = 1
i = len(numeroHexa) - 1
soma = 0
valor = 0 

while i >= 0:
    c = numeroHexa[i]
    if c == 'A':
        valor = 10
    elif c == 'B':
        valor = 11
    elif c == 'C':
        valor = 12
    elif c == 'D':
        valor = 13
    elif c == 'E':
        valor = 14
    elif c == 'F':
        valor = 15
    else:
        valor = int(c)
        soma = soma + valor * potencia
        potencia = potencia * 16
        i = i - 1
print(soma)