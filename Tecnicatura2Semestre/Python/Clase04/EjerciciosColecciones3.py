# Ejercicio 3:  Agregar personajes a una lista
# Escriba un programa donde cree una lista con los siguientes personajes del señor de los anillos

# Nombre: Aragorn
# Clase: Guerrero
# Raza: Dúnadan del norte

# Nombre: Gandalf
# Clase: Mago
# Raza: Istar

# Nombre: Legolas
# Clase: Arquero
# Raza: Elfo Sindar

# Lista vacía
personajes_lotr = []

# Agregamos personajes a modo de diccionarios
personajes_lotr.append({'nombre': 'Aragorn', 'clase': 'Guerrero', 'Raza': 'Dúnadan del norte'})
personajes_lotr.append({'nombre': 'Gandalf', 'clase': 'Mago', 'Raza': 'Istar'})
personajes_lotr.append({'nombre': 'Legolas', 'clase': 'Arquero', 'Raza': 'Elfo Sindar'})

# Imprimimos la lista
for personaje in personajes_lotr:
  print(personaje)