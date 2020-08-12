nAlunos = int(input('Quantos alunos a sala tem: '))
contador = 1
soma = 0
recuperacao = 0
aprovado = 0


while nAlunos >= contador:
    notaAluno = float(input("Digite a nota do aluno: "))
    soma += notaAluno
    contador += 1
    media = soma / nAlunos

    if notaAluno < 5:
            recuperacao += 1

    else:
            aprovado += 1

print('A media dos {} alunos foram {}\n{} alunos ficaram de recuperacao e {} alunos foram reprovados'.format(nAlunos, media, recuperacao, aprovado))
