import Producto 
class Orden:
    contador_ordenes = 0

    def __init__(self, productos):
        Orden.contador_ordenes += 1
        self.id_orden = Orden.contador_ordenes
        self._productos = list(productos)
    
    def agregar_producto(self, producto):
        self._productos.append(producto) # esto es para agregar un nuevo producto

    def calcular_total(self):
        total = 0 # variable temporal para almacenar el total temporal
        for producto in self._productos:
            total += producto.precio
        return total
    
    def __str__(self):
        productos_str = ""
        for producto in self._productos:
            productos_str += producto.__str__()+"|"

if __name__ == "__main__": # solo sera visible, la prueba se ejecuta desde aqui
    producto1 = Producto("camiseta", 17000.00)
    producto2 = Producto("pantalon", 15000.00)
    productos1 = [producto1, producto2] # loista de productos
    orden1 = Orden(productos1)# primer objeto orden pasando la lista de productos
    print(orden1)
    orden2 = Orden(productos1)
    print(orden2)

"""
Tarea: modificar la orden2, ingresando nuevos productos con sus nombres y precios
crear una nueva lista de productos y arreglar a la orden2
"""