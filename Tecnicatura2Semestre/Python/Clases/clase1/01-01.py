#lista = ariel, liliana, natalia, osvaldo

nombres = ["naty","osvaldo","lily","ariel"]
print(nombres)
'''
print(nombres[0])
print(nombres[1])
print(nombres[3])
print(nombres[-1])
print(nombres[-2])#se pueden usar los negativos, los toma al reves
''' 
#uso con puntos
print(nombres[0:2])
#ir del inicio de la lista al indice (sin incluirlo)
print(nombres[ :3]) # indices a mostrar 0,1,2
#desde el indice indicado hasta el final
print(nombres[1: ])
#modificamos un valor
nombres[2] = "liliana"
nombres[0] = "natalia"
print(nombres)
#iterar una lista
for nombre in nombres: # nombre es singular, la lista es plural
    print(nombre)
else:
    print("se acabaron los elementos de la lista")
# oreguntamos el elemento que tiene 
print(len(nombres)) #le pasamos como parametro la lista

#agregamos un elemento
nombres.append("marcelo")
print(nombres)

#insertar un elemento en un indice especifico
nombres.insert(1, "alberto")
print(nombres)
nombres.insert(3, "debora")
print(nombres)

#eliminamos un elemento
nombres.remove("alberto")
print(nombres)

#eliminar el ultimo elemento
nombres.pop()
print(nombres)

#eliminar un indice espeifico 
del nombres[2]
print(nombres)

#eleiminar borrar o limpiar todos los elementos 
nombres.clear()
print(nombres)

#eliminar la lista
del nombres
print(nombres)