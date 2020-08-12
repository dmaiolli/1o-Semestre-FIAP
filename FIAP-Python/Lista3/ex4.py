aux = input("Digite o numero de dias uteis desse mes: ")
diasUteis = float(aux)

aux = input("Digite o total de horas trabalhadas desse mes: ")
horaTrabalhada = float(aux)

aux = input("Digite o quanto você recebe por hora: ")
valorHora = float(aux)

salario = horaTrabalhada * valorHora

if diasUteis == 30 and horaTrabalhada > 90:
    horaExtra = (horaTrabalhada - 90) * valorHora * 1.5 
    print("Seu salario será de", salario - horaExtra, " e você receberá", horaExtra, "de hora extra")

elif diasUteis == 31 and horaTrabalhada > 93:
    horaExtra2 = (horaTrabalhada - 93) * valorHora * 1.5
    print("Seu salario será de", salario - horaExtra2, "e você receberá", horaExtra2, "de hora extra")

else:
    print("Seu salário será de", salario, "e você nao terá acrescimo de hora extra")