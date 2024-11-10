from dispositivo_entrada import DispositivoEntrada

class Teclado(DispositivoEntrada):
  contadorTeclados = 0

  def __init__(self, marca, tipoEntrada):
    Teclado.contadorTeclados += 1
    self._id_teclado = Teclado.contadorTeclados
    super().__init__(marca, tipoEntrada)

  def __str__(self):
    return f'Id: {self._id_teclado}, Marca: {self._marca}, Tipo entrada: {self._tipoEntrada}'
  
#Pruebas
if __name__ == '__main__':
  teclado1 = Teclado('Redragon', 'USB')
  teclado2 = Teclado('Logitech', 'Bluetooth')

  print(teclado1)
  print(teclado2)