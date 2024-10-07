// let persona3 = new Persona('Carla', 'Ponce'); esto no se debe hacer: Persona is not defined

class Persona{ //Clase Padre
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }

     get nombre(){
        return this._nombre;
     }

     get apellido(){
        return this._apellido
     }

     set nombre(nombre){
        this._nombre = nombre;
     }

     set apellido(apellido){
        this._apellido = apellido;
     }

}

class Empleado extends Persona{ //Clase Hija
    constructor(nombre, apellido, departamento){
        super (nombre, apellido);
        this._departamento = departamento;
    }

    get departamento(){
        return this._departamento;
    }

    set departamento(departamento){
        this._departamento = departamento;
    }
}

let persona1 = new Persona('Pablo', 'Ibañez');
console.log(persona1.nombre);
console.log(persona1.apellido);
console.log(persona1);
persona1.nombre = 'Pedro';
persona1.apellido = 'Sanchez';
console.log(persona1.nombre);
console.log(persona1.apellido);
let persona2 = new Persona('Igancio', 'Ibañez');
console.log(persona2.nombre);
console.log(persona2.apellido);
console.log(persona2);
persona2.nombre = 'Juan';
persona2.apellido = 'Perez';
console.log(persona2.nombre);
console.log(persona2.apellido);


let empleado1 = new Empleado('Maria', 'Gimenez', 'Sistemas');
console.log(empleado1);
console.log(empleado1.nombre);
console.log(empleado1.apellido);
console.log(empleado1.departamento);