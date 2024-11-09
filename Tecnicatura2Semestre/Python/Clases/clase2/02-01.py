# del cocina # esto es para eliminar una tupla 

#tipo set
planetas = {"marte", "júpiter", "venus"}
print(len(planetas)) #usamos la funcion (LEN) = length significa largo

#revisar si un elemento existe dentro de set
print("júpiter" not in planetas) # tiene en cuenta acentos o caracteres raros

#agregar un elemento
planetas.add("Tierra") # add es una funcion
print(planetas)

#Eliminar elementos, puede arrojar un error si el elemento no existe
planetas.remove("júpiter") # esta funcion ante un mal ingreso inexistencia del elemento da error
print(planetas)
planetas.discard("tierra") # esta funcion no nos presenta ningun error 
print(planetas)

# limpiar set
planetas.clear
print(planetas)

#eliminar set o conjunto
#del planetas
#print(planetas) # da error porque eliminamos el conjunto (planetas)