from Persona2 import Persona2

print("creacion de objetos".center(123, "-"))

if __name__ == "__main__":
    persona5 = Persona2("augusto", "vernengo", 23)
    persona5.mostrar_detalles()
    
    print(__name__)

print("eliminacion de objetos".center(123, "-"))
del persona5

#clase 9 lo que sigue poo