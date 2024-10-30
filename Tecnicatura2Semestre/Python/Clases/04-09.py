"""
Ejersicio 5: Factorialde un numero positivo
hacer un programa para calcular el factorial de un numero positivo
"""
numero = int(input("Digite un numero: "))
while numero < 0: # ientras el numero sea negativo
    print("Error -> El numero tiene que ser positivo")
    numero = int(input("Digite un numero: "))
factorial = 1 # esta es la variable para calcular el factorial
for i in range(1, numero+1):
    factorial *= i
print(f"\nEl factorial del numero {numero} positivo ingresado es {factorial}")
