# Ejercicio 2: Función con *args para multiplicar

# Si se pasa con paramentro *args, permite ingresar n cantidad de argumentos

def multiplicar(*numeros):
  resultado = 1
  for numero in numeros:
    resultado *= numero
  return resultado


resultado_multiplicacion = multiplicar(2,4,6)
print(resultado_multiplicacion) 