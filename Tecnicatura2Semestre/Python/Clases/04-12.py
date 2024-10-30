"""
Ejersicio 7: juego adivina el numero
realizar un juego para adivinar un numero. para ello se debe
generar un numero aleatorio entre 1 - 100, y luego ir pidiendo
numeros indicado "es mayor" o "es menor" segun sea mayot o menor
con respecto a N. el proceso termina cuando el usuario acierta
y alli se debe mostrar el numero de intentos
"""
import random
print("\t.:Juego Adivina el número: ")
aleatorio = random.randint(0,100) # toma de 0 a 100 literal, generamos un numero aleatorio
contador = 0
while True:
    numero = int(input("Digite un número: "))
    contador += 1
    if numero > aleatorio:
        print("\tNo es el núnero, digite un numero menor")
    elif numero < aleatorio:
        print("\tNo es el numero digite un numero mayor")
    else:
        print(f"Felicidades, acabas de adivinar el nnumero {aleatorio}")
        break # rompe el ciclo y el bucle
print(f"\nNumero de intentos: {contador}")