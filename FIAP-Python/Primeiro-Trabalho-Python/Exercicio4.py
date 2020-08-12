a = int(input("Digite o valor de a: "))
b = int(input("Digite o valor de b: "))
mdc = 1
divisor = 1

if a > 0 and b > 0:
    while divisor <= a:
        if a % divisor == 0 and b % divisor == 0:
            mdc = divisor
        divisor += 1 

print("MDC(%d,%d)=%d" %(a, b, mdc))