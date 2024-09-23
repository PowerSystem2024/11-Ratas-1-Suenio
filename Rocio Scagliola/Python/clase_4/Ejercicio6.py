#Ejercicio: Llenar una lista

lista = [];

i = 1 #para que no comience en 0
while i <= 50:
    lista.append(i);
    i += 1;

for i in lista:
    print(i, end="-"); #Para agregar el divisor