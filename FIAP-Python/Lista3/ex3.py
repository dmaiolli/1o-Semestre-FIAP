time1 = input("Escreva um time: ")

aux = input("Escreva a quantidade de gols que esse time fez: ")
gols1 = int(aux)

time2 = input("Escreva outro time: ")

aux = input("Escreva a quantidade de gols que esse time fez: ")
gols2 = int(aux)

if gols1 == gols2:
    print("EMPATEE!!")

elif gols1 > gols2:
    print(time1, "ganhou de", gols1, "a", gols2)

else :
    print(time2, "ganhou de", gols2, "a", gols1)