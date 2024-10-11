# Ejercicio: Llenar una lista
# Llenar una lista con los números del 1 al 50, luego
# mostrar la lista con el bucle for, los elementos deben mostrarse 
# de la siguiente forma:
# 1-2-3-4-5...-50

lista = []

# Agregando números del 1 al 50
for i in range(1,51):
  lista.append(i)

# Imprimimos la lista en el formato que se pide
for i in lista:
  if i != 50:
    print(i,end='-')
  else: 
    print(i,end='')

# Otra forma de agregar con range, visto en el video de la clase
# lista = list(range(1,51))