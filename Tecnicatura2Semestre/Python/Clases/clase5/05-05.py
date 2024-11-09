"""
Ejersicio 02: funcion con *args para multiplicar 
crear una funcion para multiplicar los valores recibidos
de tipo numerico, utilizando argumentos variables *args
como parametro de la funcion y regresar como resultado
la multiplicacion de todos los valores
"""
# definimos la funcion para multiplicar
def multiplicar_valores(*args):
    resultado = 1 # el cero no nos ayuda a multiplicar
    for numero in args:
        resultado *= numero
    return resultado

#llamamos la funcion
print(multiplicar_valores(3, 5, 15))# le pasamos los argumentos

def listarTerminos(**terminos): # lo mas utilizado es **kwargs para recibir los argumentos
    for llave, valor in terminos.items(): # kwargs significa: key word arguments
        print(f"{llave} : {valor}")

listarTerminos() # no recibe nada, nada se va a mostrar
listarTerminos(IDE="Integrated Develoment Enviroment", PK="Primaruy key")
listarTerminos(nombre="leonel messi")

def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)
nombres2 = ["Tito", "Pedro", "Carlos"]
desplegarNombres(nombres2)
desplegarNombres("Carla")
# desplegarNombres(10) # no es un objeti iterable
desplegarNombres((10, 11)) # ka cibvertimos en tupla, en un solo elemento no olvidar la coma porqeu si no no lo toma 
desplegarNombres([22, 55]) # la convertimos en una lista 

#funciones recursivas
def factorial(numero):
    if numero == 1: # caso base
        return 1
    else:
        return numero * factorial(numero-1) # caso recursivo

numero_usuario = int(input("Ingresa un número para calcular su factorial: "))
resultado = factorial(numero_usuario)

#resultado = factorial(5) # lo hacemos en codigo duro
print(f"El factorial del número {numero_usuario} es: {resultado}")

#funcion recursiva
def factorial(numero):
    if numero == 1:
        return 1
    else:
        return numero * factorial(numero-1) # caso recursivo
    
numero = int(input("ingresa el numero: "))
resultado = factorial(numero) 
print(f"El factorial de {numero} es: {resultado}")
