class Persona {
    constructor(nombre, apellido) {
    this._nombre = nombre;   
    this._apellido = apellido; 
    }

    // Método getter para obtener el nombre
    get nombre() {
    return this._nombre;
    }

    // Método setter para modificar el nombre
    set nombre(nombre) {
    this._nombre = nombre;
    }

    // Método getter para obtener el apellido
    get apellido() {
    return this._apellido;
    }

    // Método setter para modificar el apellido
    set apellido(apellido) {
    this._apellido = apellido;
    }
}


const persona1 = new Persona("Christian", "Bonilla");


persona1.nombre = "Ignacio";
persona1.apellido = "Noguerol";

// Mostrar el nombre y apellido usando los getters
console.log("Nombre: " + persona1.nombre); // Resultado: Ignacio
console.log("Apellido: " + persona1.apellido); // Resultado: Noguerol