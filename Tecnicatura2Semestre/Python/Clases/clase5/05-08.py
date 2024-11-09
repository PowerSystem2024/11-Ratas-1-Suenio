"""
Ejersicio 5: convertidor de temperaturas
realizar dos funciones para convertir de grados a celsius
a fahrenheit y viseversa
investigar la formula
"""

#funcion que convierte de celcius a fahrenheit

def celcius_fahrenheit(celcius):
    return celcius * 9 / 5 + 32 # la presedencia: multiplica,divide y suma (es una flecha ->)

def fahrenheit_celsius(fahrenheit):
    return (fahrenheit - 32) * 5 / 9 # respetar la presedencia utilizando parentesis

celcius = float(input("Digite el valor de celcius: "))
resultado = celcius_fahrenheit(celcius)
print(f"{celcius} C a F -> {resultado:.2f}")

fahrenheith = float(input("Digite el valor de fahrenheit: "))
resultado = fahrenheit_celsius(fahrenheith)
print(f"{fahrenheith} F a C -> {resultado:.2f}" )