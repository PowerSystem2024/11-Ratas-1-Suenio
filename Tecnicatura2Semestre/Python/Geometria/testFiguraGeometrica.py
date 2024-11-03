from Cuadrado import Cuadrado
from Rectangulo import Rectangulo
from FiguraGeometrica import FiguraGeometrica

print("Creacion de objeto clase cuadrado".center(50, "-"))
cuadrado1 = Cuadrado(8, "azul") # -1 da 0
cuadrado1.alto = 7 # si estos valores son erroneos no los toma 
cuadrado1.ancho = 7 # y se queda con el valor ya ingresado
#print(cuadrado1.ancho)
#print(cuadrado1.alto)
print(f"Calculo del area del cuadrado: {cuadrado1.calcular_area()}")

#MRO = Method Resolution Order
#print(Cuadrado.mro())

print(cuadrado1)
print("Creacion de objeto clase rectangulo".center(50, "-"))
rectangulo1 = Rectangulo(3, 9, "Verde") # 11 da 0 
rectangulo1.ancho = 8
print(f"calculo del area del rectangulo: {rectangulo1.calcular_area()}")
print(rectangulo1)

#figura1 = FiguraGeometrica() no se puede instanciar, es abstracta
print(Cuadrado.mro())