#Ejercicio: Funcion recursiva

num = int(input("Ingrese un valor mayor a 0: "))

def numeros_recursivos(num):
    if num >= 1:
        print(num)
        numeros_recursivos(num-1)
    elif num == 0:
        return
    elif num <0:
        print("Valor inválido")

numeros_recursivos(num)