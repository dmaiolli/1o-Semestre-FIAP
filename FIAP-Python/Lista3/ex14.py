dia = int(input("dia: "))
mes = int(input("mes: "))
ano = int(input("ano: "))

dataValida = True

if dia < 1 or dia > 31:
    dataValida = False

if mes < 1 or mes > 12:
    dataValida = False

if dia == 31 and (mes == 4 or mes == 6 or mes == 9 or mes == 11):
    dataValida = False

if mes == 2 and dia > 28:
    if dia > 29:
        dataValida = False

    elif ano % 4 != 0:
        dataValida = False
        
    elif ano % 100 == 0 and ano % 400 != 0:
            dataValida = False

dataValida = False

if dataValida:
    print("Data Valida")

else:
    print("Data Invalida") 