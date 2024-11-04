# Ejercicio: Hacer un programa que simule un cajero automático con un saldo inicial
# de $1000 y tendrá el siguiente menú de opciones:
# 1. Ingresar dinero en la cuenta 
# 2. Retirar dinero de la cuenta
# 3. Mostrar dinero disponible
# 4. Salir


saldo = 1000
monto = 0
opcion = 0
print('Cajero automático')
print()
print('1. Ingresar dinero en la cuenta')
print('2. Retirar dinero de la cuenta')
print('3. Mostrar dinero disponible')
print('4. Salir')
print()

while (opcion != 4):
  opcion = int(input('Ingrese la opción deseada: '))
  if opcion == 1:
    monto = float(input('Ingrese el monto que desee agregar: '))
    if monto > 0:
      saldo += monto
    print(f'Su saldo actual es ${saldo}')
  elif opcion == 2:
    monto = float(input('Ingrese el monto que desee retirar: '))
    if monto > saldo:
      print('Saldo insuficiente')
    else:
      saldo -= monto
    print(f'Su saldo actual es ${saldo}')
  elif opcion == 3:
    print(f'Su saldo actual es ${saldo}')
  elif opcion == 4:
    print("Gracias por operar en este cajero")
  else:
    print('Opción inválida')