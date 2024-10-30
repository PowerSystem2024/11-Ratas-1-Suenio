mifuncion(8, 2);
function mifuncion(a, b){
    //console.log("Sumamos: "+ (a+b));
    return 0;
}

//Llamando al funcion
mifuncion(5, 4);

let resultado = mifuncion(6, 7);
console.log(resultado);

//declaramos una funcion de tipo expresion
let x = function(a, b){ return a + b}; // nesecita cierre con punto y coma
resultado = x(5, 6); // al llamarla se pone la variable y parentesis
console.log(resultado);

//funciones de ripo self y invoking
(function(a, b){
    console.log("Ejecutando la función: "+ (a + b));
})(9, 6);

console.log(typeof mifuncion);
function mifuncionDos(a, b){
    console.log(arguments.length);
}

mifuncionDos(5, 7, 3, 6);

//tostring
var mifuncionTexto = mifuncionDos.toString();
console.log(mifuncionTexto);

//funciones flecha
const sumarFuncionFlecha = (a, b) => a + b;
resultado = sumarFuncionFlecha(3, 7); // asignamos el valor a una variable
console.log(resultado);

//funcion tipo expresion
let sumar = function(a = 4, b = 8){
    console.log(arguments[0]); // muestra el parametro de: a
    console.log(arguments[1]); // muestra el parametro de: b
    return a + b + arguments[2]; // muestra el parametro de: c
}
resultado = sumar(3, 2, 9);
console.log(resultado);

//sumar todos los argumentos
let respuesta = sumarTodo(5, 4, 13, 10, 9);
console.log(respuesta);
function sumarTodo(){
    let suma = 0;
    for(let i = 0; i < arguments.length; i++){
        suma += arguments[i]; //arguments es para arreglos
    }
    return suma;
}

//tipos primitivos
let k = 10;
function cambiarValor(a){
    a = 20;
}

cambiarValor(k);
console.log(k)

const persona = {
    nombre: "Juan",
    apellido: "lepez"
}
console.log(persona)
function cambiarValorObjeto(P1){
    P1.nombre = "ignacio";
    P1.apellido = "perez";
}


cambiarValorObjeto(persona);
console.log(persona)