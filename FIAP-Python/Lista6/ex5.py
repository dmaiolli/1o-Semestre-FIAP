def contaVezes(frase, palavra):
    vezes = 0
    contador = 0
    while len(frase) > contador:
        if palavra in frase:
            vezes += 1
        contador += 1

    return vezes

print(contaVezes("olana", "ana"))