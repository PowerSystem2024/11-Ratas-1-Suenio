#repaso diccionarios
diccionarioNuevo = {"Azul": "Blue", "Rojo": "Red", "Verde": "Green", "Amarillo": "Yellow"}
print(diccionarioNuevo)

# como eliminar 
del (diccionarioNuevo["Azul"])
print(diccionarioNuevo)

# los diccionarios pueden almacenar diferentes tipos de datos
diccionario2 = {"Ariel":{"edad": 40, "altura": 1.83}, "osvaldo": [45,1.85],"Natalia": [35, 1.67]}
print(diccionario2)

#diccionario de seleccion argentina

seleccionArgentina = {
    10: {"nombre": "Leonel Messi", "Edad": 35, "Altura": 1.70, "Precio": "112 Millones", "Posicion": "Extremo Derecha"},
    11: {"nombre": "Ángel Di Maria", "Edad": 34, "Altura": 1.80, "Precio": "45 Millones", "Posicion": "Extremo Derecha"},
    24: {"nombre": "Paulo Dybala", "Edad": 30, "Altura": 1.77, "Precio": "25 Millones", "Posicion": "Media Punta"},
    19: {"nombre": "Nicolas Otamendi", "Edad": 34, "Altura": 1.83, "Precio": "38 Millones", "Posicion": "Defensa Central"},
    1: {"nombre": "Emiliano Martínez", "Edad": 32, "Altura": 1.95, "Precio": "28 Millones", "Posicion": "Portero"},
    17: {"nombre": "Alejandro Garnacho", "Edad": 20, "Altura": 1.80, "Precio": "45 Millones", "Posicion": "Extremo izquierdo"},
    7: {"nombre": "Rodrigo de Paul", "Edad": 30, "Altura": 1.80, "Precio": "30 Millones", "Posicion": "Mediocentro ofensivo"},
    23: {"nombre": "Lautaro Martínez", "Edad": 27, "Altura": 1.74, "Precio": "110 Millones", "Posicion": "Delantero centro"},
} # tarea agregar 3 a 4 jugadores nuevos

for llave, valor in seleccionArgentina.items():
    print(llave, valor) # aca se ve el numero mas la informa cion con el .items

  
print("tenemos cargados en el diccionario la cantidad de :", end=" ")
print(len(seleccionArgentina))
