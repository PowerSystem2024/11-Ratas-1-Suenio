from dispositivo_entrada import DispositivoEntrada

class Raton(DispositivoEntrada):
  contadorRatones = 0

  def __init__(self, marca, tipoEntrada):
    Raton.contadorRatones += 1
    self._id_raton = Raton.contadorRatones
    super().__init__(marca, tipoEntrada)

  def __str__(self):
    return f'Id: {self._id_raton}, Marca: {self._marca}, Tipo entrada: {self._tipoEntrada}'
  
# Pruebas
if __name__ == '__main__':
  raton1 = Raton('Hp', 'USB')
  raton2 = Raton('Acer', 'Bluetooth')
  print(raton1)
  print(raton2)
