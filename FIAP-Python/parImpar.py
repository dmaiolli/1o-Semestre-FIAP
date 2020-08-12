import random

vitorias = 0
derrotas = 0
contador = 1

melhorDe = int(input("Digite melhor de quantas você quer jogar: "))

while contador <= melhorDe:
    parImpar = str(input('Escolha Par ou Impar [P/I]: ')).lower()
    usuario = int(input('Digite um numero: '))
    computador = random.randrange(1, 11)
    soma = usuario + computador

    if soma % 2 == 0 and parImpar == 'p' or soma % 2 != 0 and parImpar == 'i':
        vitorias += 1
        print('Voce jogou %d e escolheu %s, o computador jogou %d e a soma foi de %d' %(usuario, parImpar, computador, soma))
        print('Você ganhou %d vezes, vamos jogar denovo!' %(vitorias))
        # querJogar = str(input("Quer jogar mais uma? [S/N]: ")).lower()
        

    else:
        derrotas += 1
        print('Voce jogou {} e escolheu {}, o computador jogou {} e a soma foi de {}'.format(usuario, parImpar, computador, soma))
        print('Você perdeu {} vezes, vamos jogar mais uma?'.format(derrotas))
        # querJogar = str(input("Quer jogar mais uma? [S/N]: ")).lower()
    
    contador += 1

print("O resumo do jogo foi de %d vitórias para você e %d derrotas" %(vitorias, derrotas))