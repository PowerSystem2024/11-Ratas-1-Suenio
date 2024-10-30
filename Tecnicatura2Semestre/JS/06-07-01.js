//let persona3 = new persona("carla", "Ponce");

class persona /*extends object*/{ //clase padre
    constructor(nombre, apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    get nombre(){
        return this._nombre;
    }
    set nombre(nombre){
        this._nombre = nombre;
    }
    get apellido(){
        return this._apellido;
    }
    set apellido(apellido){
        this._apellido = apellido;
    }
    nombreCompleto(){
        return this._nombre+" "+this._apellido;
    }
    toString(){ // regresea un string
        return this.nombreCompleto();
    }
}

class Empleado extends persona{ // clase hija
    constructor(nombre, apellido, departamento){
        super(nombre, apellido);
        this._departamento = departamento;
    }
    get departamento(){
        return this._departamento;
    }
    set departamento(departamento){
        this._departamento = departamento;
    }
    //sobreescritura
    nombreCompleto(){
        return super.nombreCompleto()+", "+this._departamento;
    }
    // sobrescribiendo el metodo de la clase padre (Object)
    toString(){
        //se aplica el polimorfismo que significa = multioples formas en tiempo de ejecucion
        //el metodo que se ejecuta depende si es una referencia de tipo padre o hija
        return this.nombreCompleto();
    }
}

let persona1 = new persona("Martin", "Perez");
console.log(persona1._nombre);
persona1.nombre = "Juan Carlos";
console.log(persona1.nombre);
//console.log(persona1);
let persona2 = new persona("Carlos", "Lara");
console.log(persona2._nombre);
persona2.nombre = "María Laura";
console.log(persona2.nombre);
//console.log(persona2);

let empleado1 = new Empleado("María", "Gimenez", "Sistemas");
console.log(empleado1);
console.log(empleado1.nombreCompleto());

// Object.prototype.toString esta es la manera de accedera atributos y metodos de manera dinamica
console.log(empleado1.toString());
console.log(persona1.toString());
