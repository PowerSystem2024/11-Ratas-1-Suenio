class Monitor:
  contadorMonitores = 0

  def __init__(self, marca, tamanio):
    Monitor.contadorMonitores += 1
    self._id_monitor = Monitor.contadorMonitores
    self._marca = marca
    self._tamanio = tamanio

  def __str__(self):
    return f'Id: {self._id_monitor}, Marca: {self._marca}, Tamaño: {self._tamanio}'
  
#Pruebas
if __name__ == '__main__':
  monitor1 = Monitor('Asus', '24 pulgadas')
  print(monitor1)