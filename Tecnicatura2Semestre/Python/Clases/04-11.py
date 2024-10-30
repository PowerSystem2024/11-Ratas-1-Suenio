"""
Ejersicio 6: tabla de multiplicar
hacer un programa que pida un numero por teclado y guarde
en una lista su tabla de multiplicar hasta el 10. por ejemplo:
si digita el 5 la lista tendra: 5,1',15,20,25,30,35,40,45,50
"""
numero = int(input("Digite un numero: "))
lista = [] # creamos una lista vacia
for i in range(1,11): # printea 10 numeros en total
    lista.append(i*numero)

print(f"\nTabla de multiplicar del {numero}: \n {lista}")

for indice,i in enumerate(lista):
    print(f"{numero} x {i} = {lista[indice]}") # este ciclo es para ver de forma de una tabla de multiplicar
    