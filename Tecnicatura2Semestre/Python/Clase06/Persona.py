class Persona:  #Creamos una clase
    def __init__(self, nombre, apellido, edad):  # Se lo llama método Init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad

    def mostrar_detalle(self):
        print(f'Persona: {self.nombre} {self.apellido} {self.edad}')


persona1 = Persona('Pablo', 'Ibañez', 32)
print(f'El objeto 1 de la clase persona: {persona1.nombre} {persona1.apellido}. Edad: {persona1.edad}')

persona2 = Persona('Ignacio', 'Ibañez', 23)
print(f'El objeto 2 de la clase persona: {persona2.nombre} {persona2.apellido}. Edad: {persona2.edad}')

persona1.nombre = 'Juan'
persona1.apellido = 'Ibañez'
persona1.edad = 28
print(f'El objeto 1 modificado de la clase persona: {persona1.nombre} {persona1.apellido}. Edad: {persona1.edad}')

# Los atributos son: caracteristicas
# Los métodos son: el comportamiento que van a tener los objetos (acciones)
persona1.mostrar_detalle()
persona2.mostrar_detalle()
