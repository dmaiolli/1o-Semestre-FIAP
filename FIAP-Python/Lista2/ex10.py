aux = input("Escreva a distância em metros: ")
metros = float(aux)

aux = input("Escreva o tempo em segundos: ")
tempo = float(aux)

resultado = metros / tempo  
print("O valor de m/s é: ", resultado)

km = metros * 3.6
hora = tempo * 3600
resultado2 = km / hora
print("O valor de km/h é: ", resultado2)