# Ejercicio 1: Eliminar duplicados de una lista 
# Escriba un programa donde tenga una lista y que a continuación 
# elimine los elementos repetidos, por último mostrar la lista.

# Creamos la lista

paises = ['Argentina', 'Ecuador', 'Uruguay', 'Chile', 'Brasil', 'Perú', 'Venezuela', 'Paraguay', 'Colombia', 'Brasil', 'Bolivia', 'Venezuela', 'Ecuador']

# Imprimiendo la lista con duplicados
print("Paises con duplicados:")
for pais in (paises):
  print(f'- {pais}')
print()

# Eliminando duplicados al convertirla en conjunto (set)
conjunto_paises = set(paises)
paises = list(conjunto_paises)
paises.sort()

# Corroborando
print("Paises sin duplicados:")
for pais in (paises):
  print(f'- {pais}')

