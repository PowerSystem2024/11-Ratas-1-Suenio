<script setup>

const title = '11 Ratas un Sueño';
const logo = [
  {id:0, name: 'Logo', src: '/src/assets/img/logo.png', url: 'f'},
  ];
const descripcion = 'Portafolio Web Grupal 11 Ratas Un Sueño';
const presentacion = 'Grupo de ratas entusiastas con la meta de seguir aprendiendo y mejorando. Actualmente cursando la Tecnicatura Superior en Programación (TUP) en la Universidad Tecnológica Nacional (UTN) - FRSR, Argentina.';
const residencia = 'Argentina';
const telefono = '123456789';
const redes = [
  {id:1, name: 'Linkedin', src: '/src/assets/img/linkedin.png', url: 'f'},
  {id:1, name: 'Instagram', src: '/src/assets/img/instagram.png', url: 'f'},
  {id:1, name: 'GitHub', src: '/src/assets/img/github.png', url: 'f'},
  {id:1, name: 'Curriculum', src: '/src/assets/img/cv.png', url: 'f'}
];

</script>

<template>
  <section class="datos-personales">
    <div class="card">
      <h1>{{title}}</h1>
      <a class="icono-grande">
        <img class="logo-grupo" :src="logo[0].src" alt="Logo">
      </a>
      <h2>{{descripcion}}</h2>
      <p>{{presentacion}}</p>
      <ul class="container-lista">
        <li v-for="red in redes" :key="red.id">
          <a :href="red.url"><img class="icon-redsocial" :src="red.src" width="35rem" alt="Redes"></a>
        </li>
      </ul>
      <h3>Teléfono: {{telefono}}</h3>
      <h4>{{residencia}}</h4>
    </div>
  </section>
</template>

<style scoped>
  .datos-personales{
    background-color: rgba(97, 97, 97,.6);
    border-radius: 5px;
    margin: 1rem;
  }
  .card{
    padding: 1rem;
    text-align: center;
  }

  .icono-grande {
    background-color: rgba(255, 255, 255, 0.8);
    border-radius: 50%;
    width: 8rem;
    display: flex;
    justify-content: center;
   align-items: center;
    margin: .5rem auto;
  }

  .logo-grupo {
    width: 100%; /* % del tamaño del logo dentro del círculo */
    border-radius: 50%;
  }

  .container-lista{
    display: flex;
    justify-content: center;
    align-items: center;
    padding: 1rem;

    li{
     background-color:  rgba(255, 255, 255, 0.8);
     border-radius: 100%;
     height: 2.5rem;
     width: 2.5rem;
     margin: .3rem;
     display: flex;
     justify-content: center;
     align-items: center;

     a{
      display: flex;
      img{
        border-radius: 100%;
      }
     } 
    }
  }

</style>