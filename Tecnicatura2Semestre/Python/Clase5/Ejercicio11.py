# Agenda telefonica
# Hacer un programa que simule una agenda de contactos. Crear un
# diccionario donde la clave sea el nombre, y el valor sea el número

agenda = {}

while True:
    print('\t  Menú')
    print('1. Nuevo contacto')
    print('2. Borrar contacto')
    print('3. Ver contactos existentes')
    print('4. Salir')

    opcion = input('Ingrese una opción: ')

    if opcion == '1':
        nombre = input('Ingrese el nombre: ')
        if nombre not in agenda:
          telefono = int(input('Ingrese el número: '))
          agenda[nombre] = telefono
        else:
          print('El nombre ya existe')
    elif opcion == '2':
        print(f'Contactos disponibles \n {agenda}')
        borrar = input('Ingrese el nombre del contacto que desea borrar: ')
        del agenda[borrar]
    elif opcion == '3':
        print(f'Agenda:\n {agenda}')
    elif opcion == '4':
        print('Gracias por usar la agenda')
        break
    else:
        print('Opción no válida, por favor intente de nuevo')
    


      


# print(agenda)
# print(type(agenda))
