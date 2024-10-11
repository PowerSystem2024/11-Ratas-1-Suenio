# Ejercicio Factorial

def factorial(n = int(input('Ingrese el valor: '))):
  if n == 0:
    return 1
  else: 
    return n * factorial(n-1)
 
  
  
resultado = factorial()
print(resultado)
