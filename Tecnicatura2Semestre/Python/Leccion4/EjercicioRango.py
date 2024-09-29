'''
Sintaxis de range(inicio opcional›, fin <requerido>, incremento <opcional>)
'''

# Eiercicio 1: Iterar un rango de 0 a 10 e imprimir números divisibles entre 3
# Ejemplo de ejecución: 0,3,6,9
print('Rango de 0 a 10 con números divisibles entre 3')
for i in range(11):
    if i % 3 == 0:
        print(i)

# Ejercicio 2: Crear un rango de numeros de 2 a 6 a imprimelos
# Ejemplo de ejecución: 2,3,4,5,6
print('Rango de 2 a 6')
rango = range(2, 7)
for i in rango:
    print(i)

# Eiercicio 3: Crear un rango de 3 a 10 pero con incremente de 2 en 2, en lugar de 1 en 1
# Eiemplo de ejecución: 3,5,7,9
print('Rango de 3 a 10 con incremento de 2 en 2')
rango = range(3, 10)
for i in rango:
    if i % 2 == 1:
        print(i)