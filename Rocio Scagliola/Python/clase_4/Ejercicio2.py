#Ejercicio 2: Operaciones de conjuntos con listas
#Escriba un programa que tenga 2 listas y que a continuación
#cree las siguientes listas (en las que no deben haber repetición):

lista1 = ["A", "B", "C", "D", "A", "A", "C"];
lista2 = ["A", "B", "C", "E", "E", "B", "B"];

print("Listas:")
print(lista1);
print(lista2)

#Eliminar repetidos de ambas listas:
conjunto1 = set(lista1);
conjunto2 = set(lista2);

print("Listas sin repetidos:");
print(conjunto1);
print(conjunto2);

#1 Lista de palabras que aparecen en las listas
total = list(conjunto1 | conjunto2);
print("Elementos de ambas listas:")
print(total);
#2 Lista de palabras que aparecen en la primera lista, pero no en la segunda
solo1 = list(conjunto1 - conjunto2);
print("Elementos que solo aparecen en la lista 1:");
print(solo1);

#3 lista de palabras que aparecen en la segunda lista, pero no en la primera
solo2 = list(conjunto2 - conjunto1);
print("Elementos que solo aparecen en la lista 2:");
print(solo2);
#lista de palabras que aparecen en ambas listas.
interseccion = list(conjunto2 & conjunto1);
print("Elementos que aparecen en ambas listas:");
print(interseccion);

