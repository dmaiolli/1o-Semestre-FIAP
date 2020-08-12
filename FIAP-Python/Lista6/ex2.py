def intercala(palavra):
    i = 0
    resp = ""
    tamanho = len(palavra)
    while i < tamanho:
        resp = resp + palavra[i] + " "
        i += 1
    
    return resp
        
print(intercala("Olá"))