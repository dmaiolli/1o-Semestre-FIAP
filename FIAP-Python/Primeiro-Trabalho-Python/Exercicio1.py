salario = 500
salarioTotal = salario
categoria = int(input("Digite o código da sua comissão: "))

if categoria == 1:
    salarioTotal *= 1.04

elif categoria == 2:
    salarioTotal *= 1.055

elif categoria == 3:
    salarioTotal *= 1.07

elif categoria == 4:
    salarioTotal *= 1.085

else:
    print("Digite uma categoria válida")

print("Seu salario total é de R$%.2f, adicionando suas comissões o total será de: R$%.2f" %(salario, salarioTotal))