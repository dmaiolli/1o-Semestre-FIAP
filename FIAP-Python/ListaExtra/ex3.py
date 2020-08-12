seq = int(input("Diga quantos numeros a sequência terá: "))
crescente = 0
contador = 0

while seq != contador:
    num = int(input("Digite o numero da sequência: "))
    if num >= crescente:
        crescente += 1
        sequencia = crescente
    elif num < crescente:
        crescente = 1
    contador += 1

print("O comprimento do segmento máximo é de %d" %(sequencia))