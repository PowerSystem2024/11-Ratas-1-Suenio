#Ejercicio 1 con Matemáticas y la clase math
#Sacar la raíz cuadrada de un número positivo

import math;

num = int(input("Ingrese un numero positivo: "));

while num < 0:
    print("¡Error! No se ha ingresado un número válido. ");
    num = int(input("Ingrese un numero positivo: "));

print(f"La raíz cuadrada de {num} es: {math.sqrt(num):.2f}");