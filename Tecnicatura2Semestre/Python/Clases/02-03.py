# concatenar listas 
lista1 = [1, 2, 3]
lista2 = [4, 5, 6]
lista3 = lista1+lista2 # concatenamos 
print(lista3)

lista3.extend([7, 8, 9])# funcion para agregar varios elementos a una lista 
print(lista3)

print(lista3.index(5))# muestra el indicie del elemento desde 0 en adelante
# print(lista3.index(0)) #esto daria un error por no ser el elemento de la lista 

#como saber cuantos valores repetidos hay dentro de una lista 
print(lista3.count(1)) # cuenta cuantos valor

#para poner nuestra lista al reves 
lista3.reverse()
print(lista3)

# para que una lista se multiplique repitiendo sus elementos
list3 = lista3 * 2
print(lista3)

#metodos de ordenamiento
lista3.sort()#ordena los elementos acendentemente
print(lista3)
lista3.sort(reverse=True) #ordenamos descendentemente 
print(lista3)