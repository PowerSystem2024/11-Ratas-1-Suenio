class aritmetica:
    """el nombre de este tipo de comentarios es: DocString
    esto es documentacion de la clase de python
    vamos a hacer esta clase algunas operaciones de: suma, resta, multiplicacion y mas 
    """

    def __init__(self, operadorA, operadorB):
        self.operandoA = operadorA
        self.operandoB = operadorB

        #metodo para sumar
    def suma(self):
        return self.operandoA + self.operandoB
    
    def resta(self):
        return self.operandoA - self.operandoB
    
    def multiplicar(self):
        return self.operandoA * self.operandoB
    
    def dividir(self):
        return self.operandoA / self.operandoB

aritmetica1 = aritmetica(7, 9) # le pasamos los argumentos para los operadores
print(aritmetica1.suma())
print(f"la respuesta de los numeros es: {aritmetica1.resta()}")
print(f"la multiplicacion de los numeros es: {aritmetica1.multiplicar()}")
print(f"la multiplicacion de los numeros es: {aritmetica1.dividir():.2f}")