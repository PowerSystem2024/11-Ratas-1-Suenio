# Ejercicio 01: Crear una función para sumar los valores recibidos de tipo
# numéricos

def suma():
  a = int(input('Ingresa el primer valor: '))
  b = int(input('Ingresa el segundo valor: '))
  return a + b

resultado = suma()
print(f'El resultado es: {resultado}')
