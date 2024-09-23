# Ejercicio: Realizar un juego para adivinar un número. Para ello se debe
# generar un número aleatorio entre 1 y 100, y luego ir pidiendo números 
# indicando si "es mayor" o "es menor" según sea el caso.
# El proceso termina cuando el usuario acierta
# Se debe mostrar el número de intentos

import random

# La función randint() nos permite obtener un número aleatorio entre el rango que le pasemos
numAleatorio = random.randint(1,100)
intentos = 1
num = None

print('Intenta adivinar el número secreto entre 1 y 100')
while num != numAleatorio:
  num = int(input("Ingresa un número: "))
  if (num > numAleatorio):
    print('Tu número es mayor')
  elif (num < numAleatorio):
    print('Tu número es menor')
  else:
    print(f'Hallaste el número oculto, {numAleatorio}, con {intentos} intentos')
  intentos += 1


