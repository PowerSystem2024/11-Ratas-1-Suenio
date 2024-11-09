class Teclado:
    def __init__(self, marca, conexion):
        self._marca = marca
        self._conexion = conexion

    def __str__(self):
        return f"Teclado [Marca: {self._marca}, Conexión: {self._conexion}]"
class Monitor:
    def __init__(self, marca, tamaño):
        self._marca = marca
        self._tamaño = tamaño

    def __str__(self):
        return f"Monitor [Marca: {self._marca}, Tamaño: {self._tamaño}]"
class Raton:
    def __init__(self, marca, conexion):
        self._marca = marca
        self._conexion = conexion

    def __str__(self):
        return f"Ratón [Marca: {self._marca}, Conexión: {self._conexion}]"
class Computadora:
    contador_computadoras = 0

    def __init__(self, nombre, monitor, teclado, raton):
        Computadora.contador_computadoras += 1
        self._id_computadora = Computadora.contador_computadoras
        self._nombre = nombre
        self._monitor = monitor
        self._teclado = teclado
        self._raton = raton
    
    def __str__(self):
        return f"""
            {self._nombre}: {self._id_computadora}
            Monitor: {self._monitor}
            Teclado: {self._teclado}
            Ratón: {self._raton}
        """

if __name__ == "__main__":
    teclado1 = Teclado("Tdagger", "USB")
    monitor1 = Monitor("Samsung", "26 pulgadas")
    raton1 = Raton("Logitech", "USB")
    computadora1 = Computadora("Aorus", monitor1, teclado1, raton1)
    print(computadora1)

    teclado2 = Teclado("Corsair", "USB")
    monitor2 = Monitor("Rog", "26 pulgadas")
    raton2 = Raton("RedDragon", "USB")
    computadora2 = Computadora("Aorus", monitor2, teclado2, raton2)
    print(computadora2)
