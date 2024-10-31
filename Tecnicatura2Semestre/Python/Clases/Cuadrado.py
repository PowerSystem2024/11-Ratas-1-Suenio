from Tecnicatura2Semestre.Python.Clases import FiguraGeometrica
from turtle import color


class Cuadrado(FiguraGeometrica, color):
    def __init__(self, lado, color):
        super.__init__(lado)
        FiguraGeometrica.__init__(self, lado, lado)
        color.__init__(self, color)

    def calcular_area(self):
        return self.alto*self.ancho
    