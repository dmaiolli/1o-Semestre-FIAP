valor = float(input("Digite o valor da conta: "))
codigo = int(input("Digite o numero do codigo: "))

if codigo == 1:
    preco1 = (valor * 0.10) + valor
    print(preco1)

elif codigo == 2:
    preco2 = (valor * 0.05) + valor
    print(preco2)

elif codigo == 3:
    preco3 = valor / 2
    print(preco3, "R$ por parcela em 2x")

elif codigo == 4:
    preco4 = (valor * 1.07) / 4
    print(preco4, "R$ por parcela em 4x")