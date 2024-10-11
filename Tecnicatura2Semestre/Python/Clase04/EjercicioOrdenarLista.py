# Ejercicio:  Insertar elementos y ordenarlos
# Pedir números y meterlos en una lista hasta que
# el usuario inserte un 0 
# Por último, mostrar los números ordenados de menor a mayor

lista = []
num = 1
print('A continuación podrá agregar cuantos números quiera a una lista. Termina cuando introduce un 0')

while num != 0:
  num = int(input("Ingrese un número para agregar a la lista: "))
  lista.append(num)

print(f'Lista original: {lista}')
print(f'Lista ordenada: {sorted(lista)}')

# A tener en cuenta
# sort() modifica la lista original, por lo que que no podemos usarla directamente en la interpolación
# sorted() sí, ya que esta nos devuelve una nueva lista, dejando la original tal cual


