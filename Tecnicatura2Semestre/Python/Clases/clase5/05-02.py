"""
ejersicio 11: agenda de telefono
hacer un programa que simule una agenda de contactos. crear un 
diccionario donde la clave sea el nombre del usuario y el valor
sea el telefono, el programa tendrá el siguiente menú de opciones
    1. Nuevocontacto
    2. Borrar contacto
    3. Ver contacto existentes
    4. Salir
"""
agenda = {}
while True:
    print("\t.:MENÚ:.")
    print("1. Nuevocontacto")
    print("2. Borrar contacto")
    print("3. Ver contacto existentes")
    print("4. Salir")
    opcion = int(input("Digite una opcion de menú: "))
    if opcion == 1:
        nombre = input("Digite nombre del contacto: ")
        telefono = input("Digite el numero de telefono: ")
        if nombre not in agenda:
            agenda[nombre] = telefono
            print("Contacto agregado exitosamente!")
        else:
            print("Ese nombre de contacto ya existe")
    elif opcion == 2:
        nombre = input("Cual es el nombre del contacto: ")
        if nombre in agenda:
            del (agenda[nombre])
            print("Se ha eliminado el contacto requerido 👍")
        else:
            print("Ese contacto no existe en la agenda 🤨")
    elif opcion == 3:
        print("Agenda de contactos")
        for clave, valor in agenda.items():
            print(f"Nombre: {clave}, Telefono {valor}")
    elif opcion == 4:
        print("Gracias por utilizar su agenda de contactos 🫡")
        break
    else:
        print("Se equivoco de opcion de menú")
        print()
