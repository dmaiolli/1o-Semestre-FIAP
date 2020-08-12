aux = input("Digite o valor total à vista: ")
aVista = float(aux)

aux = input("Digite o valor de cada parcela: ")
parcela = float(aux)

a = parcela * 10
b = a  * 100
c = b / aVista

print("O valor do desconto vai ser de: ", c - 100 ,"%, para pagamentos à vista")