# Ejercicio: Hacer un programa donde el usuario ingrese una frase
# y se le devuelva la misma frase sin espacios, y con los caracteres contados

print('La frase que ingrese se le devolverá sin espacio y con la cantidad de caracteres que posee')
frase = input('Ingrese su frase: ')
nuevaFrase = ''
contador = 0

for char in frase:
  if char != ' ':
    nuevaFrase += char
    contador += 1

print(f'Su frase sin espacios es: "{nuevaFrase}", y tiene {contador} caracteres')

# En el video de la clase, en lugar de usar una variable contador, se usó la función len() sobre la nueva frase