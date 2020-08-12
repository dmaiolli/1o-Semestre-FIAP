def quantVogais(palavra):
    palavra = palavra.upper()
    vogais = 0
    letra = 0
    
    for letra in palavra:
        if letra == "A" or letra == "E" or letra == "I" or letra == "O" or letra == "U":
            vogais += 1 
    return vogais

print(quantVogais("alex"))