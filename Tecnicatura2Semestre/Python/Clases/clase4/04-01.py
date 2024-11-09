"""
Ejercicio 1: eleiminar duplicados de una lista
escriba un programa donde tenga una lista y que a continuacion
eleimine los elementos repetidos,por ultimo mostrar la lista.
"""

# Creamos una lista

lista = [1, 2, 3,  "Ariel", 7, 7, 3, "Alberto", 5, "Ariel", 2, "Alberto"]
#conjunto = set(lista) # elimina repetidos (convierte la lista en un conjunto tipo set)
lista = list(set(lista)) # la conversion hecha en una sola linea de codigo  (mas eficiente)
print(lista)