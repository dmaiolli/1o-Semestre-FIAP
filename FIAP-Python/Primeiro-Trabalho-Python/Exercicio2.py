aulasSemanais = int(input("Digite quantas aulas voce leciona por semana: "))
valorHoraAula = float(input("Digite qual o valor da sua hora-aula: "))

salarioBase = aulasSemanais * 4.5 * valorHoraAula
print("Seu salario base é de ", salarioBase)

Dsr = salarioBase / 6
print("Seu descanso semanal remunerado é de ", Dsr)

horaAtividade = (salarioBase + Dsr) * 0.05
print("Sua hora atividade é de", horaAtividade)

salarioMensal = salarioBase + Dsr + horaAtividade
print("Seu salario mensal é de ", salarioMensal)

print("Você leciona %d aulas por semana, logo seu salario base é de R$%.2f, o descanso semanal remunerado de R$%.2f, R$%.2f por hora atividade e o salario mensal de R$%.2f" %(aulasSemanais, salarioBase, Dsr, horaAtividade, salarioMensal))