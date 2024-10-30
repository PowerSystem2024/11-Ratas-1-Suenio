# definimos una tupla
cocina = ("cuchara", "cuchillo", "tenedor")
print(len(cocina))

#accerder a un elemento, para esto utilizamos corchetes no parentesis
print(cocina[0])
#mostrar de manera inversa
print(cocina[-1])

#como acceder a un rango
print(cocina[0:2])
#ejemplo
verduras = ("papa",) #es tupla si contiene coma
#de lo contrario solo seria un tipo string cadena

#recorremos los elementos de la tupla
for cocinar in cocina: #print esta usando \n para saltos de linea 
    print(cocinar, end=" ") #usamos end= para eliminar los saltos de linea

cocinalista = list(cocina)
cocinalista[0] = "plato"
cocina = tuple(cocinalista)# no es una buena practica
print("\n", cocina)

# del cocina # esto es para eliminar tuplas

#dada la siguientetupla
tupla = (13, 1, 8, 3, 2, 5, 8)
#crear una lista que solo incluya los numeros menores a 5 
#e imprima por consola [1, 3, 2]

lista = [] # definimos la lista
#filtramos los elementos menores a 5 de la tupla
for elemento in tupla:
    if elemento < 5:
        lista.append(elemento)
print(lista)