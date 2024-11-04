class Persona2:
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f"los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}")
    
    @property # decorador
    def nombre(self): #metodo getter 
        print("estamos utilizando el metodo get")
        return self._nombre
    
    @nombre.setter
    def nombre(self, nombre): #metodo setter 
        print("estamos utilizando el metodo set")
        self._nombre = nombre
    
    @property
    def apellido(self):
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad
    
    def __del__(self):
        print(f"persona2: {self._nombre} {self._apellido} {self._edad}")

if __name__ == "__main__":
    persona1 = Persona2("augusto", "vernengo", 41)
    print(persona1.nombre)
    persona1.nombre = "juan pedro" # llamamos al metodo setter
    print(persona1.nombre) # otra vez con el metodo getter
    print(persona1.mostrar_detalles()) #llamamos el metodo mostrar detalles
    # atributo read-only seria la edad porque no tiene el metodo set
    print(persona1.edad)

    # traer crear tres objetos mas, utilizando los metodos getter and setter
    # para modificar, y mostrar los cambios

    #tarea de clase 11

    persona2 = Persona2("lores", "romero", 23)
    persona2.nombre = "flores"
    persona2.apellido = "romero"
    persona2.edad = 23
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad)
    print(persona2.mostrar_detalles())

    persona3 = Persona2("caro", "felisa", 21)
    persona3.nombre = "caro"
    persona3.apellido = "felisa"
    persona3.edad = 21
    print(persona3.nombre)
    print(persona3.apellido)
    print(persona3.edad)
    print(persona3.mostrar_detalles())

    persona4 = Persona2("naty", "lucero", 35)
    persona4.nombre = "naty"
    persona4.apellido = "lucero"
    persona4.edad = 35
    print(persona4.nombre)
    print(persona4.apellido)
    print(persona4.edad)
    print(persona4.mostrar_detalles())

    