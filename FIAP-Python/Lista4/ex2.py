nAlunos = int(input('Quantos alunos a sala tem: '))
contador = 1
soma = 0

while nAlunos >= contador:
    notaAluno = float(input("Digite a nota do aluno: "))
    soma += notaAluno
    contador += 1

media = soma / nAlunos
print('A media dos {} alunos foram {}'.format(nAlunos, media))