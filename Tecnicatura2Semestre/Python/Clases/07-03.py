class Cubo:
    """
    crear la clase cubo con los atributos, acncho alto y profundidad, con
    un metodo calcular_volumen que tendra la formula:
    volumen = ancho * altura * profundidad
    que el usuario ingrese los valores
    """
    def __init__(self, ancho, altura, profundidad):
        self.ancho = ancho
        self.altura = altura
        self.profundidad = profundidad
    def calcular_volumen(self):
        return self.ancho * self.altura * self.profundidad

ancho = int(input("Digite el ancho del cubo: "))
altura = int(input("Digite la altura del cubo: "))
profundidad = int(input("Digite la profundiad del cubo: "))

Cubo1 = Cubo(ancho, altura, profundidad)
print(f"El volumen del cubo es: {Cubo1.calcular_volumen()}")