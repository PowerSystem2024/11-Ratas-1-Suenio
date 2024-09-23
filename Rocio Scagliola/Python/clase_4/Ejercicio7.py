#Ejercicio: Modificar los elementos de una lista.

lista = list(range(1,11));
print("Lista inicial:")

for i in lista:
    print(i);

num = int(input("Ingrese un valor: "));

#Multiplicar los elementos por el velor ingresado por el usuario

for indice, i in enumerate(lista):
    lista[indice] *= num

print("La nueva lista de elementos es: ");
for i in lista:
    print(i)