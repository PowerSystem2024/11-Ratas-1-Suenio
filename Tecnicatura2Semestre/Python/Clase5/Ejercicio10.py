# Ejercicio 10:  No repetir caracteres
# Hacer un programa que pida una cadena por teclado, luego
# meter los caracteres en uan lista sin repetir ninguno

def frase():
  frase = input('Ingresa una frase: ')
  lista = []

  for char in frase:
    if char not in lista:
      lista.append(char)
  print(lista)

frase() 

