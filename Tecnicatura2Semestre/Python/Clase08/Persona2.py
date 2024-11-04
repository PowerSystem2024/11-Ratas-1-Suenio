class Persona2:
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad
        
    def mostrarDetalles(self):
        print(f'Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}')
    
    @property
    def nombre(self):
        return self._nombre
    
    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre
        
    @property
    def apellido(self):
        return self._apellido
    
    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido
        
    @property
    def edad (self):
        return self._edad
    
    @edad.setter
    def edad(self, edad):
        self._edad = edad

# TAREA: Crear tres objetos mas, utilizando los metodos getter y setter
# para modificar, y mostrar los cambios con el metodo mostrar detalles

#Objeto N°1
persona2 = Persona2("Daiana", "Jaldin", 26)
print(persona2.nombre)
print(persona2.apellido)
print(persona2.edad)
persona2.nombre = "Roxana"
persona2.apellido = "Gutierrez"
persona2.edad = 22
print(persona2.mostrarDetalles())

#Objeto N°2
persona3 = Persona2("Ignacio", "Ibañez", 25)
print(persona3.nombre)
print(persona3.apellido)
print(persona3.edad)
persona3.nombre = "Andres"
persona3.apellido = "Sanchez"
persona3.edad = 30
print(persona3.mostrarDetalles())

#Objeto N°3
persona4 = Persona2("Pablo", "Ibañez", 30)
print(persona4.nombre)
print(persona4.apellido)
print(persona4.edad)
persona4.nombre = "Alejo"
persona4.apellido = "Diaz"
persona4.edad = 40
print(persona4.mostrarDetalles())