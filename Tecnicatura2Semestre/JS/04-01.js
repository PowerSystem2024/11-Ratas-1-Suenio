let x = 10; // variables de tipo primitiva
console.log(x.length)
console.log("tipos primitivos");
//objeto
let persona = {
    nombre: "carlos",
    apellido: "gil",
    eMail: "cgil@gmail.com",
    edad: 30,
    nombreCompleto: function(){ // metodo o funcion de javascript
        return this.nombre+" "+this.apellido;
    }
}

console.log(persona.nombre)
console.log(persona.apellido)
console.log(persona.eMail)
console.log(persona.edad)
//console.log(persona) // muestra todo junto en 1 sola linea 
console.log(persona.nombreCompleto())
console.log("ejecutando con un objeto");
let persona2 = new Object(); // debe crear un nuevo objeto en memoria
persona2.nombre = "Juan";
persona2.direccion = "Salada 14";
persona2.telefono = "5492618282821";
console.log(persona2.telefono);//se respetan las mayusculas
console.log("creamos un nuevo objeto")
console.log(persona["apellido"]);

//for in
for(propiedad in persona){
    console.log(propiedad)
    console.log(persona[propiedad])
}
console.log("cambiamos y eliminamos un error");

//persona.apellido = "Betancud"; // cambiamos dinamicamente un valor del objeto
//delete persona.apellido; // eliminamos el error
console.log(persona);

// distintas formas de imprimir un objeto
//numero 1: la mas sensilla: concatenar ek vakir de cada propiedad
console.log("distintas formas de imprimir un objeto: forma 1");
console.log(persona.nombre+", "+persona.apellido);

//numero 2: a travez de ciclo fon in
console.log("distintas formas de imprimir un objeto: forma 2");
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

//numero 3: la funcion object.values()
console.log("distintas formas de imprimir un objeto: forma 3");
let personaArray = object.values(persona);
console.log(personaArray);

// numero 4: utilizamos el metodo JASON.stringify
console.log("distintas formas de imprimir un objeto: forma 4");
let personaString = JSON.stringify(persona);
console.log(personaString);

