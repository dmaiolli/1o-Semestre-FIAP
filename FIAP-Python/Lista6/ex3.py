def substitui(palavra, letras):
    resp = ""
    i = 0

    while i < len(palavra):
        if palavra[i] in letras:
            resp = resp + "*"
        else:
            resp = resp + palavra[i]
        i = i + 1

    return resp

print(substitui("jabuticaba", "a"))