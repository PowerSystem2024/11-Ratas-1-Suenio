class Persona:
    contador_personas = 0 #Creamos la variable de clase

    @classmethod #Metodo de clase con lógica independiente
    def generar_siguiente_valor(cls):
        cls.contador_personas += 1 #Usamos el operador simplificado para el aumento
        return cls.contador_personas

    def __init__(self, nombre, edad):
        self.id_persona = Persona.generar_siguiente_valor
        self.nombre = nombre
        self.edad = edad
    
    def __str__(self):
        return f"Persona [{self.id_persona}= {self.nombre} {self.edad}]"

#Creamos objetos para probar el contador  
persona1 = Persona("Rocio",27)
print(persona1)
persona2 = Persona("Pablo", 33)
print(persona2)
persona3 = Persona("Nachito", 23)
print(persona3)

Persona.generar_siguiente_valor() #Vamos a incrementar el contador sin crear un objeto
persona4 = Persona("Dai", 26) #Aca vemos que en vez de tener ID 4, pasa a 5
print(persona4)

print(f"Valor contador personas: {Persona.contador_personas}")