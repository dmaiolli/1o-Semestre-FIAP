din = float(input("Digite o montante inicial: "))
juros = float(input("Digite o juros mensal: "))
meses = float(input("Digite o tempo em meses: "))
contador = 0

while contador <= meses:
    resultado = din * (juros + 1)
    contador += 1

print("Se {} R$ ficar aplicado a taxa de juros de {} durante {} meses, o valor final será de {:.2f}R$".format(din, juros, meses, resultado))