# Ejercicio 3:  Función recursiva
# Imprimir números de manera descendente usando funciones recursivas
# Solo imprime si el número es positivo

def conteoRecursivo(n = int(input('Ingresa un valor: '))):
  if n >= 1:
    print(n)
    conteoRecursivo(n-1)
    
conteoRecursivo()