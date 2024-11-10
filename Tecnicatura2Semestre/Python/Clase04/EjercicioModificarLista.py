# Ejercicio: Modificar elementos de una lista
# Llenar una lista con los números 1 al 10, luego modificar los
# elementos de la lista multiplicándolos por un valor ingresado por el usuario

lista = list(range(1,11))
print(f'Lista original: {lista}', end='')
print()

num = int(input("Ingresa un número para multiplicarlo por cada elemento de la lista: "))

for i in lista:
  lista[i-1] = i * num
print(f'Lista multiplicada: {lista}', end='')
print()

# En el ejemplo anterior, los índices se están ajustando manualmente al usar -1
# Una forma más apropiada y eficiente es utilizar la función enumerate() 
# la cual nos permite manejar tanto los índices como los elementos de una lista

for i, value in enumerate(lista):
  lista[i] *= num
print(f'Lista multiplicada dos veces: {lista}', end='')
# En este caso i hace referencia a cada índice, mientras que value refiere al elemento 
# en esa posición. 
