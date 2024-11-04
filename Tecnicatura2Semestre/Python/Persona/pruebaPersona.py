from Python.Persona.Persona2 import Persona2
# para eleer la tarea de la clase 11

print("creacion de objetos".center(123, "-"))

if __name__ == "__main__":
    persona5 = Persona2("augusto", "vernengo", 23)
    persona5.mostrar_detalles()
    
    print(__name__)

print("eliminacion de objetos".center(123, "-"))
del persona5
