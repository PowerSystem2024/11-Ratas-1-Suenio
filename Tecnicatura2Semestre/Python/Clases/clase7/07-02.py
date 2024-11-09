class Rectangulo:
    """
    crear una clase llamada rectangulo, debe tener 2 atributos: altura y base
    el nombre del metodo sera calcular_area utilizando la formula:
    area = base * altura. pero la base y la altura deben ser ingresadas por 
    el usuario y los objetos deben ser tres
    """
    def __init__(self, altura, base):
        self.altura = altura
        self.base = base
        
    def calcular_area(self):
        return self.base * self.altura
    
base = int(input("Digite el numero para la BASE del rectangulo: "))
altura = int(input("Digite el numero para la ALTURA del rectangulo: "))
rectangulo1 = Rectangulo(base, altura)
print(f"El area del rectangulo es: {rectangulo1.calcular_area()}")