from orden.Orden import Orden
from Producto import Producto

producto1 = Producto("camiseta", 17000.00)
producto2 = Producto("pantalon", 15000.00)
producto3 = Producto("medias", 8000.00)
producto4 = Producto("camperas", 250000.00)
producto5 = Producto("Sweter", 95000.00)
producto6 = Producto("Blusa", 75000.00)

productos1 = [producto1, producto2] 
Orden1 = Orden(productos1)
Orden1.agregar_producto(producto5)
Orden1.agregar_producto(producto3)
print(Orden1)
print(f"total de la orden1: {Orden1.calcular_total()}")
productos2 = [producto3, producto4]
Orden2 = Orden(productos2)
Orden1.agregar_producto(producto6)
Orden1.agregar_producto(producto2)
print(Orden2)
print(f"total de la orden2: {Orden2.calcular_total()}")
