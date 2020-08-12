particip = 20
contador = 1
maior = 0
candidatoMaior = 0
candidatoMenor = 0
menor = 100
percent20 = 0
percent2150 = 0
percent51 = 0

while contador <= particip:
    notaParticip = int(input("Digite a nota de um participantes: "))
    
    if notaParticip > maior:
        maior = notaParticip
        candidatoMaior = contador
    
    if notaParticip < menor:
        menor = notaParticip
        candidatoMenor = contador

    if notaParticip < 20:
        percent20 += 1
    
    elif notaParticip <= 50:
        percent2150 += 1

    elif notaParticip > 50:
        percent51 += 1

    contador += 1

percent20 = (percent20 * 100) / 20
percent2150 = (percent2150 * 100) / 20
percent51 = (percent51 * 100) / 20

print('A maior nota foi {} do candidato numero {}. A menor nota foi {} do candidato numero {}'.format(maior, candidatoMaior, menor, candidatoMenor))
print('O percentual de canditatos que acertaram pelo menos 20 questões foi de: {:.2f}%, 21 a 50: {:.2f}%, 50 pra cima: {:.2f}%'.format(percent20, percent2150, percent51))

