#Convertidor de temperaturas

def celsius_a_fahrenheit(celsius):
    return (celsius * 9/5) + 32

def fahrenheit_a_celsius(fahrenheit):
    return (fahrenheit - 32) * 5/9

# Pedir al usuario qué conversión desea hacer
opcion = input("Escriba 'C' para convertir de Celsius a Fahrenheit, o 'F' para convertir de Fahrenheit a Celsius: ").upper()

# Realizar la conversión
if opcion == 'C':
    celsius = float(input("Ingrese la temperatura en Celsius: "))
    print(f"{celsius}°C es equivalente a {celsius_a_fahrenheit(celsius)}°F.")
elif opcion == 'F':
    fahrenheit = float(input("Ingrese la temperatura en Fahrenheit: "))
    print(f"{fahrenheit}°F es equivalente a {fahrenheit_a_celsius(fahrenheit):.2f}°C.")
else:
    print("Opción inválida.")
