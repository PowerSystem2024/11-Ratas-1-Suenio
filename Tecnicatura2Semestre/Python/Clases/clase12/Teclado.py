from dispositivoEntrada import DispositivoEntrada

class Teclado(DispositivoEntrada):
    contador_teclados = 0

    def __init__(self, marca, tipo_marca):
        Teclado.contador_teclados += 1
        self._id_teclados = Teclado.contador_teclados
        super().__init__(marca, tipo_marca)

    def __str__(self):
        return f"id: {self._id_teclados}, Marca: {self._marca}, tipo entrada: {self._tipo_entrada}"
    
if __name__ == "__main__":
    teclado1 = Teclado("HP", "USB")
    print(teclado1)
    teclado2 = Teclado("Gigabyte", "Bluetooth")
    print(teclado2)
    