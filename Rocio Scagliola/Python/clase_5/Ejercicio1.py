#Ejercicio: No repetir caracteres

cadena = input("Ingrese una cadena de texto: ");
lista = [];

for i in cadena:
    if i not in lista:
        lista.append(i);

print(f"Lista de caracteres no repetidos: \n {lista}");