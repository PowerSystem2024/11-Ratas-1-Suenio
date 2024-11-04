class Persona: # Esta clase hereda de la clase Object
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad

class Empleado(Persona): # Esta clase es hija de la clase persona
    def __init__(self, nombre, edad, sueldo):
        super().__init__(nombre, edad)
        self._sueldo = sueldo

    @property
    def sueldo(self):
        return self._sueldo

    @sueldo.setter
    def sueldo(self, sueldo):
        self._sueldo = sueldo


empleado1 = Empleado('Ariel', 40, 75000)
print(empleado1.nombre)
print(empleado1.edad)
print(empleado1.sueldo)
# Tarea: encapsular los atributos y agregar los métodos getters and setters
# Crear otro objeto, pasar los datos para nombre, edad y sueldo
# Mostrar estos datos, luego modificar y mostrar nuevamente

empleado2 = Empleado('Nacho', 23, 600000)
print(empleado2.nombre)
print(empleado2.edad)
print(empleado2.sueldo)

empleado2 = Empleado('Ignacio', 22, 650000)
empleado2.nombre = 'Ignacio'
empleado2.edad = 22
empleado2.sueldo = 650000