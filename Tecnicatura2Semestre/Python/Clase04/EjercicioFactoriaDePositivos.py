# Ejercicio: Calcular el factorial de un número positivo

num = -1
factorial = 1
while (not num > 0):
  num = int(input("Ingresa un número positivo: "))

  for i in range(1, num + 1):
    factorial *= i
print(f'El factorial de {num} es {factorial:.2f}')