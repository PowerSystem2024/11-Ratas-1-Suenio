"""
Ejersicio 2: operaciones de conjuntos con lista
escriba un programa que tenga 2 listas y que a cpntinuacion
cree las siguiente lista (en las que no deben haber repeticion)
1 Lista de palabras que aparecen en las listas
2 Lista de palabras que aparecen en la primera lista, pero no en la segunda 
3 Lista de palabras que aparecen en la segunda lista, pero no en la primera
4 Lista de palabras que aparecen en ambas listas 
"""

Lista1 = [1, 2, 3, 4, 5, 4, 3, 2, 2, 1, 5]
Lista2 = [4, 5, 6, 7, 8, 4, 5, 8, 7, 7, 8]

# Eliminar los elementos repetidos de ambos conjuntos 

conjunto1 = set(Lista1)
conjunto2 = set(Lista2)

union = list(conjunto1 | conjunto2) # unimos los 2 conjuntos 
solo1 = list(conjunto1 - conjunto2) # solo muestra el conjunto1 
solo2 = list(conjunto2 - conjunto1) # solo muestra el conjunto2
interseccion = list(conjunto1 & conjunto2) # mostramos ambas listas 
print(f"lista de palabras que aparecen en las listas{union}")
print(f"lista de palabras que aparecen en la primera lista, pero en la segunda: {solo1}")
print(f"lista de palabras que aparecen en la primera lista, pero en la primera: {solo2}")
print(f"Lista de palabras que aparecen en ambas listas :{interseccion}")
