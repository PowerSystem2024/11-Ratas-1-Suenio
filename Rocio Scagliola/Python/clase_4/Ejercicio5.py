#Recorremos el Diccionario seleccionArgentina  

seleccion_argentina = {
    10: {"Nombre":"Lionel Messi","Edad":"35","Altura":"1,70","Precio":"50 Millones","Posicion":"Extremo derecho",},
    11: {"Nombre":"Angel Di María","Edad":"34","Altura":"1.80","Precio":"12 Millones","Posicion":"Extremo derecho",},
    24: {"Nombre":"Paulo Dibala","Edad":"28","Altura":"1.77","Precio":"35 Millones","Posicion":"Media punta",},
    19: {"Nombre":"Nicolas Otamendi","Edad":"34","Altura":"1.83","Precio":"3.5 Millones","Posicion":"Defensa central",},
    1: {"Nombre":"Franco Armani","Edad":"35","Altura":"1.89","Precio":"3.5 Millones","Posicion":"Arquero",},
    7: {"Nombre": "Rodrigo De Paul", "Edad": "29", "Altura": "1.80", "Precio": "40 millones", "Posición": "Mediocampista"},
    23: {"Nombre": "Emiliano Martínez", "Edad": "31", "Altura": "1.95", "Precio": "28 millones", "Posición": "Arquero"},
    22: {"Nombre": "Lautaro Martínez", "Edad": "26", "Altura": "1.74", "Precio": "85 millones", "Posición": "Delantero"},
    8: {"Nombre": "Enzo Fernández", "Edad": "23", "Altura": "1.78", "Precio": "80 millones", "Posición" : "Mediocampista"},
}

print(seleccion_argentina[10])

for llave, valor in seleccion_argentina.items():
    print(llave,valor);