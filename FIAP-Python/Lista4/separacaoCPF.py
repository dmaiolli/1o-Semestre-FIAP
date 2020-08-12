cpf = int(input("Digite seu CPF: "))


while cpf != 0:
    imprim = cpf % 10
    cpf = cpf // 10
    print(imprim)