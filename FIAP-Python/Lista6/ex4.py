def substitui(frase, letras):
    resp = ""
    i = 0

    while i < len(frase):
        if frase[i] in letras:
            resp = resp + "*"
        else:
            resp = resp + frase[i]
        i = i + 1

    return resp

print(substitui("Olá ado ado ado", "ado"))