# Desempaquetado de lista o list umpacking
def show(name, lastName):
    print(name+" "+lastName)
person = ["Ariel","Betancud"]
show(person[0], person[1]) # Pasamos uno por uno los datos de la lista a la funcion
show(*person) # esto es lo mismo que lo anterior pero le pasamos todo junto
person2 = ("osvaldo", "Giordanini") # desempaquetamos a traves de una tupla
show(*person2)
person3 = {"lastName":"Lucero", "name":"Natalia"}
show(**person3)

numbers = [1, 2, 3, 4, 5]

for n in numbers:
    print(n)
    if n == 5:
        break # es la unica manera que nos e muestre el (else)
else:
    print("Esto se terminó")
    
# lista comprehension, lista de comprension
names = ["Paolo", "Rodrigo", "Lupe", "Pepe"]
alongP = [p for p in names if p[0] == "P"] # esto regresa una nueva lista 
print(alongP)

bottleC = [{"name": "quilmes", "country": "Arg"},
           {"name": "Corona", "country": "Mx"},
           {"name": "Stella Artois", "country": "Belgium"},
           ]
arg = [b for b in bottleC if b ["country"]== "Arg"]
print(bottleC)
print(arg)

# paso de argumentos (funciones)
def mi_funcion2(name, lastName):
    print("Saludos a todos los que vean a traves del canal de youtube")
    print(f"nombre: {name}, apellido: {lastName}")
mi_funcion2("Jorge", "Lucero")
mi_funcion2("Ariel", "Bentancud")
mi_funcion2("Analia", "pedrosa")

#la palabra return en funciones
# creamos una funcion para sumar
def sumar(a, b):
    return a + b
#resultado = sumar(78, 22)
# print(f"El resultado de la suma es: {resultado}")
print(f"El resultado de la suma es: {sumar(55, 45)}")

def sumar2(a = 0, b = 0): # le damos un valor por default
    return a + b
resultado = sumar2()
print(f"Resultado de la suma: {resultado}")
print(f"Resultado de la suma: {sumar2(22, 66)}")

# argumentos, variables en funciones
def listarNombres(*nombres): # normalemnte se utilizan *args
    for nombre in nombres:# se va a convertir en una tupla
        print(nombre)
listarNombres("lucas", "jose", "claudia", "rosa", "maria")
listarNombres("marcos", "daniel", "romina", "pepe", "marcela", "carlos")
