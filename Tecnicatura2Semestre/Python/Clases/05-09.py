class persona: #creamos una clase 

    def __init__(self, nombre, apellido, edad, *args, **kwargs): # se lo llama metodo init dunder
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
        self.args = args
        self.kwargs = kwargs

    def mostrar_detalle(self):
        print(f"La clase persona tiene los siguientes datos: {self.nombre} {self.apellido} {self.edad}, ka direccion es: {self.args}, los daros importantes son: {self.kwargs}")


persona1 = persona("ariel", "Betancud", 40)
print(persona1.nombre) # hacer el print igual que con el objeto
print(persona1.apellido)
print(persona1.edad)

print(f"El  objeto1 de la clase persona: {persona1.nombre} {persona1.apellido}, su edad es: {persona1.edad}")

persona2 = persona("osvaldo", "giordanini", 45)

print(f"El  objeto2 de la clase persona: {persona2.nombre} {persona2.apellido}, su edad es: {persona2.edad}")

persona1.nombre = "liliana"
persona1.apellido = "buccella"
persona1.edad = 40

print(f"El  objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apellido}, su edad es: {persona1.edad}")

# los atributos son: caracteristicas
# los metodos son: el comportamiento que van a tener los objetos (acciones)
persona1.mostrar_detalle()
persona2.mostrar_detalle()

#persona.mostrar_detalle(persona1) # debemos pasarle una referencia para el self o dara error
persona1.telefono = "44445555289"
print(persona1.telefono)
print(f"este es el telefono: {persona1.telefono}")

#print(persona2.telefono) el objeto persona2 no tiene este atributo, da error
persona3 = persona("Rogelio", "romero", 22, "telefono", "2604445557","Calle lopez", 823, "manzana", 77, "casa", 18, altura=1.83, peso=105, CFavorito="azul", modelo=2021)
persona3.mostrar_detalle()