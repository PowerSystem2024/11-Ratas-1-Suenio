
"""
definir una clase padre llamada vehiculo y dos clases hijas llamadas
auto y bicicleta, las cuales heredan de la clase padre vehiculo. la clase
padre debe tener los siguientes atributos y metodos:

vehiculo (clase padre)
-atributos (color, ruedas)
-merodos(__init__(color, ruedas) y __str__())

auto(clase hija del vehiculo)
-atributos (velocidad(km/hr))
-metodos(__init__() y __str__())

Bicicleta(clase hija de vehiculo)
-atributos(tipo(urbana/montaña/etc.))
-metodos(__init__() y __str__())
    
crear un objeto de cada clase
"""
class Vehiculo:
    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas
    
    def __str__(self):
        return "color: "+self.color+", ruedas: "+str(self.ruedas)
    
class auto(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self.velocidad = velocidad
    
    def __str__(self):
        return super().__str__()+", Velocidad(km/hr): "+str(self.velocidad)

class Bicicleta(Vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo

    def __str__(self):
        return super().__str__()+", tipo: "+self.tipo

#Primer objeto de la clase Vehiculo
vehiculo = Vehiculo("blanco", 4)
print(vehiculo)

#segundo objeto, pero ahora de la clase auto
auto = auto("amarillo", 4, 120)
print(auto)

#tercer objeto, el ultimo de la clase bici
bici = Bicicleta("azul", 2, "urbana")
print(bici)
