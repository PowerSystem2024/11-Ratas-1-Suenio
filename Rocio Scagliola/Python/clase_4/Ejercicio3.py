#Agregar personajes a una lista

personajes = []

P = {"Nombre": "Aragorn", "Clase": "Guerrero", "Raza": "Dúnadan del norte"}
personajes.append(P)

P = {"Nombre": "Gandalf", "Clase": "Mago", "Raza": "Istar"}
personajes.append(P)

P = {"Nombre": "Legolas", "Clase": "Arquero", "Raza": "Elfo Sindar"}
personajes.append(P)

# Añadiendo tres personajes más
P = {"Nombre": "Frodo", "Clase": "Portador del Anillo", "Raza": "Hobbit"}
personajes.append(P)

P = {"Nombre": "Gimli", "Clase": "Guerrero", "Raza": "Enano"}
personajes.append(P)

P = {"Nombre": "Boromir", "Clase": "Capitán", "Raza": "Hombre"}
personajes.append(P)

# Verificando la lista
for personaje in personajes:
    print(personaje)
