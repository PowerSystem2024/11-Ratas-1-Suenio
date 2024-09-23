#Ejercicio: Calculadora de impuestos

precio_bruto = float(input("Ingrese el monto bruto del pago: "))
impuesto = float(input("Ingrese el porcentaje del impuesto a aplicar: "))

def calculadora_impuestos(precio_bruto,impuesto):
    precio_neto = precio_bruto + (precio_bruto*(impuesto/100))
    return precio_neto

monto_final = calculadora_impuestos(precio_bruto,impuesto)
print(f"El monto final con impuesto incluído es: {monto_final}")