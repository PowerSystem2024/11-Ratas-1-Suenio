# Ejercicio 5: Convertidor de temperatura
# Realizar dos funciones para convertir de grados a fahrenheit y viceversa

def gradosAFahreinheit(grados):
  return ((grados * 1.8) + 32)

def fahreinheitAGrados(fahreinheit):
  return (fahreinheit - 32) * 0.55

prueba = gradosAFahreinheit(10)
print(prueba)

prueba2 = fahreinheitAGrados(60)
print(prueba2)