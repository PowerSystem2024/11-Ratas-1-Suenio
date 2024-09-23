#Ejercicio 10: Crear una funcion para sumar los valores recibidos de tipo numérico

def sumar_valores(*args):
    resultado = 0
    for valor in args:
        resultado += valor
    return resultado

print(sumar_valores(5,7,2,3,5))