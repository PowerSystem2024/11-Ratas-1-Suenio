# Ejercicio: Hacer un programa que pida un número por teclado y guarde
# en una lista su tabla de multiplicar hasta el 10.

lista = []
num = -1
while (not num > 0):
  num = int(input("Ingresa un número para hallar su tabla de multiplicar hasta 10: "))

for i in range(1,11):
  lista.append(num * i)

for i, value in enumerate(lista):
  print(f'{num} * {i+1} = {value}')
