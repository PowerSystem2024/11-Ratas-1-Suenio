#pilas usando listas
pila = [1, 2, 3]

#agregar elementos a la pila por el final
pila.append(4)
pila.append(5)
print(pila)

#sacamos elementos del final
elementoBorrado = pila.pop() # quitamos el ultimo elemento y lo guarda en la variable
print(f"sacamos el elemento {elementoBorrado}")
print(f"la pila ahora quedo asi : {pila}")

#colas con lista
# estructura de datos de tipo fifo (first imput / first outpot)

cola = ["ariel", "osvaldo", "liliana", "pilar"]

# agregamos elementos al final de la cola
cola.append("natalia")
cola.append("jose")
print(cola)

# sacamos elementos de la cola
seRetira = cola.pop(0)
print(f"atendido el cliente {seRetira}")
print(cola)

seRetira = cola.pop(0)
print(f"atendido el cliente {seRetira}")
print(cola)