import math

# Sacar la raiz cuadrada de un número positivo
num = -1
while (not num > 0):
  num = int(input("Ingresa un número: "))
  # La función sqrt() solo acepta números positivos, por eso hacemos esta
  # segunda validación. Así el bucle continúa y no hay ningún error en caso de 
  # ingresar un número negativo
  if num > 0: print(f'La raiz cuadrada de {num} es: {math.sqrt(num):.2f}')