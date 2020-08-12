numero = int(input("Informe parte do boleto: "))

dcRecebido = numero % 10
numero = numero // 10

soma = 0
mult = 2
while numero != 0:
    digito = numero % 10 #8
    valor = digito * mult
    valor = (valor // 10) + (valor % 10)
    soma = soma + valor
    numero = numero // 10
    if mult == 2:
        mult = 1
    else:
        mult = 2    

resto = soma % 10
dcCalculado = 0
if resto > 0:
    dcCalculado = 10 - resto

if dcCalculado == dcRecebido:
    print("Essa parte do boleto foi validada!")
else:
    print("Erro nesta parte do boleto!")    