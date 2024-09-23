#Ejercicio 1: Crear una funcion con *args para multiplicar

def multiplicar_valores(*args):
    resultado = 1 
    for valor in args:
        resultado *= valor
    return resultado

print("El resultado es:")
print(multiplicar_valores(3,5,15,3))