class Persona(object): # esta clase hereda la clase object
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
    
    def __str__(self): #override = sobre escribir
        return f"persona: [Nombre: {self._nombre}, Edad: {self._edad}]"
    
class Empleado(Persona): ## esta clase es hija de la clase persona
    def __init__(self, nombre, edad, sueldo):
        super().__init__(nombre, edad)
        self.sueldo = sueldo
        
    @property
    def sueldo(self):
        return self._sueldo
    @sueldo.setter
    def sueldo(self, sueldo):
        self._sueldo = sueldo

    def __str__(self):
        return f"Empleado: [Sueldo: {self._sueldo}]{super().__str__}"
        
        
print("empleado1".center(30, "-"))
empleado1 = Empleado("augusto", 40, 75000)
print(empleado1.nombre)
print(empleado1.edad)
print(empleado1.sueldo)
# tarea crear encapsulamiento y agregar metodos getter and setter
print("empleado2".center(30, "-"))
empleado2 = Empleado("romina", 46, 100000)
print(empleado2.nombre)
print(empleado2.edad)
print(empleado2.sueldo)
print("empleado2 modificado".center(30, "-"))
empleado2.nombre = "julian"
empleado2.edad = 23
empleado2.sueldo = 60000
print(empleado2.nombre)
print(empleado2.edad)
print(empleado2.sueldo)
