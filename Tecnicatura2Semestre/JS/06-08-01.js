// contiene de la clase 6 hasta la 8

//let persona3 = new persona("carla", "Ponce");

class persona /*extends object*/{ //clase padre

    static contadorPersonas = 0; // atributo estatico
    //email = "Valor default email" // atributo no estatico 
    static get MAX_OBJ(){ // este es un metodo que simula una constante
        return 5;
    }

    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
        if(persona.contadorPersonas < persona.MAX_OBJ){
            this.idPersona = ++persona.contadorPersonas;

        }else{
            console.log("se ha superado el maximo de objetos permitidos")
        }
        //console.log("Se incrementa el contador: "+persona.contadorObjetoPersona);
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
        return this.idPersona+": "+this._nombre+" "+this._apellido;
    }
    toString(){ // regresea un string
        return this.nombreCompleto();
    }
    //clase 8
    static saludar(){
        console.log("Saludos desde este metodo static")
    }
    static saludar2(persona){
        console.log(persona.nombre+" "+persona.apellido);
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

//persona1.saludar(); //no se utiliza desde el objeto pero si de la clase
persona.saludar();
persona.saludar2(persona1);

Empleado.saludar();
Empleado.saludar2(empleado1);

//console.log(persona1.contadorObjetoPersona);
console.log(persona.contadorPersonas);
console.log(Empleado.contadorPersonas);

console.log(persona1.email);
console.log(empleado1.email);
// console.log(persona.email); // no se puede acceder desde la clase

console.log(persona1.toString())
console.log(persona2.toString())
console.log(empleado1.toString())
console.log(persona.contadorPersonas)
let persona3 = new persona("Augusto", "Vernengo")
console.log(persona3.toString());
console.log(persona.contadorPersonas)

console.log(persona.MAX_OBJ);
//persona.MAX_OBJ = 10; // no afecta el valor inicial, no se puede modificar
console.log(persona.MAX_OBJ);

let persona4 = new persona("romina", "trinidad");
console.log(persona4.toString());
let persona5 = new persona("loco", "corcho");
console.log(persona5.toString());

