# Ejercicio 2: Operaciones de conjuntos con listas
# Escriba un programa que tenga 2 listas y que a continuación 
# cree las siguientes listas (en las que no debe haber repetición)
# 1 Lista de palabras que aparecen en las listas  
# 2 Lista de palabras que aparecen en la primera lista, pero no en la segunda
# 3 Lista de palabras que aparecen en la segunda lista, pero no en la primera
# 4 Lista de palabras que aparecen en ambas listas

# Creando dos listas
paises1 = ['Argentina', 'Ecuador', 'Venezuela', 'Uruguay', 'Chile', 'Brasil']
paises2 = ['Ecuador', 'Uruguay', 'Chile', 'Brasil', 'Perú', 'Venezuela', 'Paraguay', 'Colombia']

paises1 = set(paises1)
paises2 = set(paises2)

# Lista 1 / Unión de ambas listas
lista1 =  paises1 | paises2
print(f'Lista 1:{list(lista1)}') 

# Lista 2 / Valores que solo están en la primera lista
lista2 = paises1 - paises2
print(f'Lista 2:{list(lista2)}') 

# Lista 3 / Valores que solo están en la segunda lista
lista3 = paises2 - paises1
print(f'Lista 3:{list(lista3)}') 

# Lista 4 / Valores que se repiten en ambas listas
lista4 = paises1 & paises2
print(f'Lista 4:{list(lista4)}') 

