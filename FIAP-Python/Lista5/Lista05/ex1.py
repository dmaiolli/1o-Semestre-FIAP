NumPrimo = False
def numPrimo(num):

    primo = 0

    while num != 0:
        num = num - 1
        if num % 10 == 0:
            primo += 1

    if primo == 1:
        NumPrimo = True
    else:
        NumPrimo = False
    print("O numero digitado é primo? %s" %(NumPrimo))

num = numPrimo(7)