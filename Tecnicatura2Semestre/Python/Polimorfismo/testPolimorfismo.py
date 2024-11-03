from Empleado import Empleado
from Gente import Gerente

def imprimir_detalles(objeto): # este es el metodo para aprender lo que es el polimorfismo 
    #print(objeto) # de manera indirecta llama al str de la clase empleado o gerente
    print(type(objeto)) #esto es para saber el tipo de dato
    print(objeto.mostrar_detalles())
    if isinstance(objeto, Gerente):
        print(objeto.departamento)

empleado = Empleado("augusto", 50000)
imprimir_detalles(empleado)

gerente = Gerente("julian", 80000, "sistemas")
imprimir_detalles(gerente)
