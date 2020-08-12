def reverterString(palavra):
    tamanho = len(palavra)
    palavra2 = ""
    while tamanho > 0:
        tamanho -= 1
        palavra2 += palavra[tamanho]
    return palavra2

print(reverterString("Olá como vai?"))