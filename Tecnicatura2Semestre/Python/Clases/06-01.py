class persona:
    def __init__(self, nombre, apellido, dni, edad, *args, **kwargs): # se lo llama metodo init dunder
        self.nombre = nombre
        self.apellido = apellido
        self._dni = dni # este atributo esta encapsulado de una manera sugerida
        self.edad = edad
        self.args = args
        self.kwargs = kwargs
        
    def mostrar_detalle(self): # self es igual a this (no ses obligatorio que se llame self(pero es lo recomendado))
        print(f"La clase p ersona tiene los siguientes datos:{self.nombre} {self.apellido} {self.edad}, la direccion es: {self.args},los datos importantes son {self.kwargs}")

persona1 = persona("augusto", "Vernengo", 679023457980, 23) # enviamos nuestros argumentos
#print(persona1.nombre)
#print(persona1.apellido)
#print(persona1.edad)
print(f"el objeto2 de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}")
persona2 = persona("julian", "lima", 679023457980, 32)
print(f"el objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} Su edad es: {persona2.edad}")

persona2.nombre = "romina"
persona2.apellido = "argañaraz"
persona2.edad = 46
print(f"el objeto2 modigficado de la clase persona: {persona2.nombre} {persona2.apellido} Su edad es: {persona2.edad}")

# los atributos son: caracteristicas
#los metodos son: el comportamiento que van a tener los objetos (acciones)
persona1.mostrar_detalle() # en este caso la referencia se pasa de manera automatica
persona2.mostrar_detalle()

#persona.mostrar_detalle(persona1) # en este caso si o si nesecitamos referencia
persona1.telefono = "43242587"
print(f"Este es el telefono de {persona1.nombre}: {persona1.telefono}")

#print(persona2.telefono) # el objeto persona 2 no tiene este atributo
persona3 = persona("guillermo", "federico", 679023457980, 56, "Telefono", "2604675908", "calle lopez", 823, "manzana", 77, "casa", 18, altura=2.01, peso=97, CFavorito="verde", auto="citroen", modelo=2021)
persona3.mostrar_detalle()
#print(persona3._dni) esto no se debe utilizar en python, esto dice que lo desconocemos
#persona3.__nombre # esta totalmente encapsulado no se puede mostrar