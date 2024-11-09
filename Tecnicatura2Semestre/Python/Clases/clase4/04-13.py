"""
Ejersicio 8: Menú interactivo - cajero automatico
hacer un programa que simule un cajero automatico conun saldo
inicial de 1000$ y tendra el siguiente menu de opciones
                                1. ingresar dinero en la cuenta
                                2. retirar dinero de la cuenta
                                3. mostrar dinero disponible
                                4. salir
"""
saldo = 1000
while True:
    print("\t.:MENÚ:.")
    print("1. Ingresar dinero en la cuenta")
    print("2. Retirar dinero de la cuenta")
    print("3. Mostrar dinero disponible")
    print("4. Salir")
    opcion = int(input("Digite una opcion de menú: "))
    print()
    if opcion == 1:
        extra = float(input("cuanto dinero desea ingresar -> "))
        saldo += extra
        print(f"Dinero en la cuenta al momento: ${saldo}")
    elif opcion == 2:
        retirar = float(input("Cuanto dinero desea retirar ->"))
        if retirar > saldo:
            print("No tiene esa cantidad de dinero")
        else:
            saldo -= retirar
            print(f"Dinero en la cuenta al momento: ${saldo}")
    elif opcion == 3:
        print("--------------------------------------")
        print(f"Dinero en la cuenta al momento: ${saldo}")
        print("--------------------------------------")
        print()
    elif opcion == 4:
        print("-------------------------------------------------------")
        print("gracias por utilizar su cajero automatico, hasta pronto")
        print("-------------------------------------------------------")
        print()
        break
    else:
        print("------------------------------------")
        print("Error, se equivoco de opcion de menu")
        print("------------------------------------")
        print()
