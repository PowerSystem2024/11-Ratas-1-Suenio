#Ejercicio: Agenda telefónica

agenda = { }

while True:
    num = int(input("==================== \n MENU \n1.Nuevo contacto \n2.Borrar contacto \n3.Ver contactos existentes \n4.Salir \n \n Ingrese la opcion deseada: "));
    if num == 1:
        nombre = (input("Nombre:\n"))
        telefono = (input("Teléfono:\n"))
        if nombre not in agenda:
            agenda[nombre] = telefono
            print( )
            print("Listo!\n\n")

        else : 
            print( )
            print("Contacto existente.\n")
    elif num == 2:
        nombre = input("Ingrese el nombre del contacto:\n")
        if nombre in agenda:
            del (agenda[nombre])
            print( )
            print("Contacto eliminado.\n")
        else:
            print("Contacto inexistente.\n")
    elif num == 3:
        print("=== AGENDA DE CONTACTOS ===\n")
        for clave, valor in agenda.items():
            print(f"Nombre: {clave}, Teléfono: {valor}")
    elif num == 4:
        print("Adios!")
        break
    else:
        print("Ingrese una opcion válida.\n")


