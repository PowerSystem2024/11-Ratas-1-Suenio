from teclado import Teclado
from monitor import Monitor
from raton import Raton

class Computadora:
  contadorComputadoras = 0

  def __init__(self, nombre, monitor, teclado, raton):
    Computadora.contadorComputadoras += 1
    self._id_computadora = Computadora.contadorComputadoras
    self._nombre = nombre
    self._monitor = monitor
    self._teclado = teclado
    self._raton = raton

  def __str__(self):
    return f'{self._nombre}: {self._id_computadora} \nMonitor: {self._monitor}, \nTeclado: {self._teclado}, \nRatón: {self._raton}\n'
  
#Pruebas
if __name__ == '__main__':
  # computadora1 = Computadora('Asus', '24 pulgadas')
  teclado1 = Teclado('Redragon', 'USB')
  monitor1 = Monitor('Asus', '24 pulgadas')
  raton1 = Raton('Hp', 'USB')
  computadora1 = Computadora('HP', teclado1, monitor1, raton1)
  print(computadora1)