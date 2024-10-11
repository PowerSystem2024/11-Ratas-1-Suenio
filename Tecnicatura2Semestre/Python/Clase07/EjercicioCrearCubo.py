"""
Crear la clase Cubo con los atributos, ancho, alto y profundidad, con
un método calcular_volumen que tendrá la formula:
volumen = ancho * altura * profundidad
que el usuario ingrese los valores.
"""

#Creamos la clase:
class Cubo:
    def __init__(self, ancho, alto, profundidad):
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad

#Definimos el método:
    def calcular_volumen(self):
        return self.ancho * self.alto * self.profundidad
    
# Solicitamos al usuario los valores:
ancho = float(input("Ingrese el ancho del cubo: "))
alto = float(input("Ingrese el alto del cubo: "))
profundidad = float(input("Ingrese la profundidad del cubo: "))

# Creamos un objeto de la clase Cubo
cubo = Cubo(ancho, alto, profundidad)

# Calculamos y mostramos el resultado
print(f"El volumen del cubo es: {cubo.calcular_volumen()}")