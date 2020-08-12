media1 = float(input("Digite sua média 1: "))
media2 = float(input("Digite sua média 2: "))

media = (media1 * 4) + (media2 * 6) / 10

if media < 6:
    print("Reprovado")

elif media >= 6:
    aulasMinistradas = float(input("Digite o total de aulas: "))
    aulasAssistidas = float(input("Digite o total de aulas assistidas: "))
    aulas = (aulasAssistidas * 100) / aulasMinistradas

    if aulas <= 70:
        print("Precisa repor aulas")

    else:
        print("Aprovado")

