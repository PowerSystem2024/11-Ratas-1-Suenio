class Persona:
    contador_personas = 0 # variable de clase

    @classmethod
    def generar_siguiente_valor(cls):
        cls.contador_personas += 1 #vamos incrementando
        return cls.contador_personas

    def __init__(self, nombre, edad):
        Persona.contador_personas += 1 # vamos incrementando
        self.id_persona = Persona.contador_personas
        self.nombre = nombre
        self.edad = edad

    
    def __str__(self):
        return f"Persona[{self.id_persona} = {self.nombre},{self.edad}]"


persona1 = Persona("augusto", 23)
print(persona1)
persona2 = Persona("julian", 32)
print(persona2)
persona3 = Persona("romina", 46)
print(persona3)
Persona.generar_siguiente_valor()
persona4 = Persona("fernanda", 64)
print(persona4)
print(f"contador personas: {Persona.contador_personas}")