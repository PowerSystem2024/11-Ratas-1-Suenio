# Ejercicio: Sumar números pares dentro de un rango

sumaPares = 0
for i in range(1,6):
  if i % 2 == 0:
    sumaPares += i
print(sumaPares)

# También se puede cambiar los parámentros de range por unos que ingrese el usuario