class MiClase:

    variable_clase = "esta es una cariavle clase"

    def __init__(self, variavle_instancia): # la variable de instancia, da diferentes calores
        self.variavle_instancia = variavle_instancia

    @staticmethod
    def metodo_estatico(): # metodo estatico se asocia a la clase
        print(MiClase.variable_clase)
    @classmethod
    def metodo_clase(cls):
        print(cls.variable_clase)

    def metodo_instancia(self):
        self.metodo_clase()
        self.metodo_estatico()
        print(self.metodo_clase())
        print(self.metodo_estatico())


print(MiClase.variable_clase)
miClase1 = MiClase("esta es una variacle de instancia")
print(miClase1.variavle_instancia)
print(miClase1.variable_clase)
miClase2 = MiClase("esta es otra prueba de variable de instancia")
print(miClase2.variavle_instancia)
print(miClase2.variable_clase)

MiClase.variable_clase2 = "valor de variable de clase 2"
print(MiClase.variable_clase2)
print(miClase1.variable_clase2)
print(miClase2.variable_clase2)

MiClase.metodo_estatico()

MiClase.metodo_clase()
miObjeto = MiClase("variable de instancia")
miObjeto.metodo_clase()
miObjeto.metodo_instancia()
