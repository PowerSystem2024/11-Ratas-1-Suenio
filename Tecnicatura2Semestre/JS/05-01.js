let persona = {
    nombre: "Carlos",
    apellido: "Gil",
    eMail: "Cgil@gmail.com",
    edad: 30,
    idioma: "es",
    get lang(){
        return this.idioma.toUpperCase();
    },
    set lang(lang){
        this.idioma = lang.toUpperCase();
    },
    nombreCompleto: function(){
        return this.nombre+" "+this.apellido;
    },
    get nombreEdad(){
        return "El nombre es: "+this.nombre+" Edad: "+this.edad;
    }
    
}

console.log("comenzamos a utlizar el metodo get ");
console.log(persona.nombreEdad);

console.log("Comenzamos con el metodo get idiomas");
persona.lang = "en";
console.log(persona.lang);

function persona3(nombre /*= "luis"*/, apellido, email){ // constructor
    this.nombre = nombre;
    this.apellido = apellido;
    this.eamil = email;
    this.nombreCompleto = function(){
        return this.nombre+" "+this.apellido
    }
}
let padre = new persona3("Leo", "lopez", "lopezL@gmail.com");
padre.nombre = "luis"; //modificamos el nombre 
padre.telefono = "542604555544";
console.log(padre);

console.log(padre.nombreCompleto());// utilizamos la funcion

let madre = new persona3("laura", "contrera", "Lcontrera@gmail.com");
console.log(madre);
console.log(madre.telefono) // la propiedad no esta definida 
console.log(madre.nombreCompleto());

//diferentes formas de crear objetos
//caso numero 1
let miObjeto = new Object(); //esta es una opcion formal
//caso numero 2
let miObjeto2 = {};

//caso string 1
let miCadena1 = new String("hola");
//caso String 2
let miCadena2 = "hola"; //esta es la sintaxis simplificada y recomendada

//caso con numeros 1
let miNumero = new Number(1);// es formal no recomendable
//caso con numeros 2
let miNumero2 = 1;

//caso boolean 1
let miBoolean1 = new Boolean(false);//formal
//caso boolean 2
let miBoolean2 = false; //sintaxis recomendada

//caso arreglos 1
let miArreglo1 = new Array();//formal
//caso arreglos 1
let miArreglo2 = [];//sintaxis recomendada

//caso arreglos 1
let miFunction1 = new function(){}; //todo despues de new es considerado objeto
//caso arreglos 2
let miFunction2 = function(){};//noracion simplificada y recomendada

//uso de prototype
persona3.prototype.telefono = "2604555544";
console.log(padre);
console.log(madre.telefono);
madre.telefono = "542604555544";
console.log(madre);

//uso de ccall
let persona4 ={
    nombre: "Juan",
    apellido: "Perez",
    nombreCompleto2: function(titulo, telefono){
        return titulo+": "+this.nombre+" "+this.apellido+" "+telefono;
        //return this.nombre+" "+this.apellido;
    }
}

let persona5 ={
    nombre: "carlos",
    apellido: "Lara"
}

console.log(persona4.nombreCompleto2("Lic.", "549261838384"));
console.log(persona4.nombreCompleto2.call(persona5, "Ing.", "2604555544"));

//metodo Apply
let arreglo = ["Ing.", "549261838384"];
console.log(persona4.nombreCompleto2.apply(persona5, arreglo));