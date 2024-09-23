#Ejercicio: Insertar elementos y ordenarlos

lista = [];
fin = False;

while not fin:
    num = int(input("Digite el numero a ingresar: "));
    if num == 0:
        fin = True;
    else:
        lista.append(num);

lista.sort() #Funcion para ordenar la lista
print(f"La lista generada, en orden creciente es:",lista);