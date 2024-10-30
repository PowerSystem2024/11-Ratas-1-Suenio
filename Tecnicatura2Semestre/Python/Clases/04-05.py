"""
Ejersicio 1: llenar una lista
llenar una lista con numeros del 1 al 50, luego mostrar
la lista con el bucle for, los elementos deben de mostrarse
de la siguiente forma: 1-2-3-4-5...-50
"""
"""
lista = []
i = 1
while i <= 50:
    lista.append(i)
    i += 1 
"""
# de 4 lineas se redunce a 1
lista = list(range(1, 51))  # empieza a contar desde 0 en adelante por eso se pone 51  
for i in lista:
    print(i, end="-")

