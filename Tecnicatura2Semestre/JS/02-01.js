
//creacion de array o arreglos
//let autos = new Array("Ferrari", "Renault", "BMW");
const autos = ["Ferrari", "Renault", "BMW"];
console.log(autos);

//recorrer los elementos de un arreglo
console.log(autos[0]);
console.log(autos[2]) // forma manual
for(let i = 0; i < autos.length; i++){
    console.log(i+" : "+autos[i])
}

//modificamos los elementos del arreglo
autos[1] = "Volvo";
console.log(autos[1]);

//arreglamos nuevos valores al arreglo
autos.push("Audi") // agregamos el elemento al final del arreglo
console.log(autos);

//otras formas de arreglar elementos al arreglo
autos[autos.length] = "Porche";
console.log(autos);

//Tercera forma de agregar elementos teniendo cuidado
autos[6] = "Renault";
console.log(autos);

//como preguntar si es un array(arreglo)
console.log(Array.isArray(autos)); //devuelve un booleano

console.log(autos instanceof Array) //preguntamos si la variable es una instancia de tipo array

//Clase 3 Funciones