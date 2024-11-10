#Crear una clase llamada Rectangulo, debe tenér 2 atributos: altura y base
#El nombre del método será calcular_area utilizando la formula:
#area = base * altura. Pero la base y la altura deben ser ingresadas por el usuario.

#Creamos la clase:
class Rectangulo:
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def calcular_area(self):
        return self.base * self.altura

#Pedimos al usuario que ingrese los datos:
base = float(input("Ingrese la base: "))
altura = float(input("Ingrese la altura: "))

rectangulo = Rectangulo(base, altura)

#Imprimimos el resultado:
print(f"El área del rectángulo es: {rectangulo.calcular_area()}")