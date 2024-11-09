#para definir un conjunto
conjunto2 = set()
conjunto1 = {"bye", }
conjunto2.add(7)
conjunto2.add("Hola")
print(conjunto2)
conjunto1.add("hola")
print(conjunto1)
print(3 not in conjunto1) # preguntamos si el numero 3 NO esta en el conjunto1

# como hacer igualdad de los conjuntos
print(conjunto1 == conjunto2) # Nos devuelve como respuesta un booleano

#operaciones en conjuntos
conjunto3 = conjunto1 | conjunto2 #la linea une dos conjuntos 
print(conjunto3)

conjunto3 = conjunto1 & conjunto2 # que elemento tiene en comun 
print(conjunto3)

conjunto3 = conjunto1 - conjunto2 # asigna el valor esta en el conjunto1 y no en el conjunto2 
print(conjunto3)
conjunto3 = conjunto2 - conjunto1
print(conjunto3)

conjunto3 = conjunto1 ^ conjunto2# elementos que no comparten o que son diferentes entre ambos
print(conjunto3)

conjunto3 = conjunto1 | conjunto2
print(conjunto2.issubset(conjunto3)) #aqui preguntamos si un conjunto es un subconjunto dentro de otro
print(conjunto1.issubset(conjunto3))
print(conjunto3.issubset(conjunto1))
print(conjunto3.issubset(conjunto2))

print(conjunto3.issubset(conjunto1)) #preguntamos si los elementos del conjunto1 estan dentro del 3 
print(conjunto3.issubset(conjunto2)) #si es verdadero quiere decir que el conjunto3 es un superconjunto
print(conjunto2.issubset(conjunto3)) 

# como saber si ambos conjuntos son disconexos, esto es si no comparten elementos en comun
print(conjunto1.isdisjoint(conjunto2)) # no hay cosas en comun 

#convertir un conjunto totalemnte en inmutable
conjunto1 = frozenset # esto hace que el conjunto sea totalmente inmutable
#no se puede arreglar, modificar ni eliminar elementos del conjunto