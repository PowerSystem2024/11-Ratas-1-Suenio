from computadora import Computadora
from teclado import Teclado
from monitor import Monitor
from raton import Raton
from orden import Orden

teclado1 = Teclado('Redragon', 'USB')
monitor1 = Monitor('Asus', '24 pulgadas')
raton1 = Raton('Hp', 'USB')
computadora1 = Computadora('HP', teclado1, monitor1, raton1)

teclado2 = Teclado('Logitech', 'USB')
monitor2 = Monitor('Acer', '27 pulgadas')
raton2 = Raton('Viper', 'USB')
computadora2 = Computadora('Gigabyte', teclado2, monitor2, raton2)

computadoras = [computadora1]

orden = Orden(computadoras)
orden.agregar_computadora(computadora2)
print(orden)