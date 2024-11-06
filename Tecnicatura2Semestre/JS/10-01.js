class Producto{

    static contadorProducto = 0;
    
    constructor(nombre, precio){
        this._idProducto = ++Producto.contadorProducto;
        this._nombre = nombre;
        this._precio = precio;
    }

    get idProducto(){
        return this._idProducto;
    }
    get nombre(){
        return this._nombre;
    }
    set nombre(nombre){
        this._nombre = nombre;
    }
    get precio(){
        return this._precio;
    }
    set precio(precio){
        this._precio = precio;
    }
    toString(){ //template literals
        return `idProducto: ${this._idProducto}, nombre: ${this._nombre}, precio: $${this._precio}`;
    }
}
class Orden{
    static contadorOdenes = 0;
    static getMAX_PRODUCTOS(){ // simula una constante 
        return 5;
    }
    constructor(){
        this._idOrden = ++Orden.contadorOdenes;
        this._productos = []
        this._contadorProductosAgregados = 0;
    }

    get idOrden(){
        return this._idOrden;
    }
    agregarProducto(producto){
        if(this._productos.length < Orden.getMAX_PRODUCTOS()){
            this._productos.push(producto);// tenemos 2 tipos de sintaxis 1
            //this._productos[this._contadorProductosAgregados++] = producto //sintaxis numero 2
        }else{
            console.log("No se pueden agregar mas productos");
        }
    }//fin del metodo agregar productos
    calcularTotal(){
        let totalVenta = 0;
        for(let producto of this._productos){
            totalVenta += producto.precio;
        }// fin ciclo for
        return totalVenta;
    }//fin del metodo calcularTotal
    mostrarOrden(){
        let productoOrden = " ";
        for(let producto of this._productos){
            productoOrden += "\n{ "+producto.toString()+" }";
        }//fin del ciclo for
        console.log(`Orden: ${this.idOrden}, Total: $${this.calcularTotal()}, productos: ${productoOrden}`);
    }// fin metodo mostrar orden
}//fin de la clase Orden

let producto1 = new Producto("pantalon", 200);
let producto2 = new Producto("Remera", 500);
let producto3 = new Producto("cinturon", 747);
//console.log(producto1.toString());
//console.log(producto2.toString());

let orden1 = new Orden();
let orden2 = new Orden();

orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.agregarProducto(producto3);

orden2.agregarProducto(producto1);
orden2.agregarProducto(producto2);
orden2.agregarProducto(producto3);

//orden1.mostrarOrden();
//orden2.mostrarOrden();
