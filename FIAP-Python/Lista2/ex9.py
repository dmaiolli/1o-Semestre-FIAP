aux = input("Escreva o preço inicial: ")
precoInicial = float(aux)

aux = input("Escreva o percentual do desconto: ")
desconto = float(aux) / 100

resultDesconto = precoInicial * desconto
print("O valor do desconto é: ", resultDesconto ,"reais")

precoFinal = precoInicial - resultDesconto
print("O preço final é: ", precoFinal ,"reais")