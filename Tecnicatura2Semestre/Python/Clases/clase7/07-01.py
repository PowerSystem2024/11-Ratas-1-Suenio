class aritmetica:
    """
    El nombre de este tipo de comentarios es: DocString
    esto es documentacion de la clase python
    camos a hacer en esa clase algunas operaciones de: suma, resta, multiplicacion y mas 
    """
    def __init__(self, operandoA, operandoB):
        self.operandoA = operandoA
        self.operandoB = operandoB
    #metodo para sumar
    def sumar(self):
        return self.operandoA + self.operandoB
    
    def resta(self):
        return self.operandoA - self.operandoB
    
    def multiplicar(self):
        return self.operandoA * self.operandoB
    
    def dividir(self):
        return self.operandoA / self.operandoB
    

aritmetica1 = aritmetica(7, 9) # le pasamos los argumentos para los operandos
print(f"la suma de los numeros es:{aritmetica1.sumar()}")
print(f"la resta de los numeros es: {aritmetica1.resta()}")
print(f"la multiplicacion de los numeros es: {aritmetica1.multiplicar()}")
print(f"la division de los numeros es: {aritmetica1.dividir():.2f}")
