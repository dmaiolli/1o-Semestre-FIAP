def montaPalavraTracejada(pal, letras):
    resp = ""

    for c in pal:
        if c in letras:
            resp = resp + c + " "
        else:
            resp = resp + "_ "    

    return resp


maxErros = 6
erros = 0
letrasChut = ""

palavraOculta = "Coreia do Sul"
palavrax = montaPalavraTracejada(palavraOculta, letrasChut)
acertou = False

while erros < maxErros and not acertou:
    print(palavrax)
    print("Erros: {} de {}".format(erros, maxErros))
    print("Letras chutadas: ", letrasChut)
    letra = input("Letra: ")

    letrasChut = letrasChut + letra
    if letra in palavraOculta:
        palavrax = montaPalavraTracejada(palavraOculta, letrasChut)
    else:
        erros = erros + 1    

    if not "_" in palavrax:
        acertou = True