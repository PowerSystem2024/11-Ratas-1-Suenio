# Ejercicio 4: Calculadora de impuestos
# Crear una función para calcular el total de un pago incluyendo un impuesto aplicado (IVA)


def calcularPago(pagoInicial = float(input('Ingrese el pago sin impuestos: ')), impuesto = float(input('Ingrese el impuesto: '))):  
  pagoTotal = pagoInicial + pagoInicial * (impuesto/100)
  return pagoTotal

resultado = calcularPago()
print(resultado)
