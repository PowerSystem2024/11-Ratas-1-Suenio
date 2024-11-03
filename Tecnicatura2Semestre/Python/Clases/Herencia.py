class Persona:
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
    @nombre.setter
    def edad(self, edad):
        self._edad = edad

class Empleado(Persona):
    def __init__(self, nombre, edad, sueldo):
        super().__init__(nombre, edad)
        self.sueldo = sueldo
    
    @property
    def sueldo(self):
        return self._sueldo
    @sueldo.setter
    def sueldo(self, sueldo):
        self._sueldo = sueldo


empleado1 = Empleado("augusto", 40, 75000)
print(empleado1.nombre)
print(empleado1.edad)
print(empleado1.sueldo)

empleado2 = Empleado("julian", 23, 70000)
print(empleado2.nombre)
print(empleado2.edad)
print(empleado2.sueldo)
empleado2.nombre = "romina"
empleado2.edad = 46
empleado2.sueldo = 100000
print(empleado2.nombre)
print(empleado2.edad)
print(empleado2.sueldo)
