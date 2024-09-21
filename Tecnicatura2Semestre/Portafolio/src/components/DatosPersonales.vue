<script setup>

const title = '11 Ratas un Sueño';
const descripcion = 'Técnico Universitario en Programación - UTN';
const presentacion = 'Bienvenidos a nuestro portafolio grupal.';
const residencia = 'Argentina';
const telefono = '242425234';
const redes = [
  {id:1, name: 'Linkedin', src: '/src/assets/img/linkedin_icon.svg', url: 'f'},
  {id:1, name: 'Instagram', src: '/src/assets/img/instagram_icon.svg', url: 'f'},
  {id:1, name: 'GitHub', src: '/src/assets/img/github_icon.svg', url: 'f'},
  {id:1, name: 'Curriculum', src: '/src/assets/img/cv_resume_icon.svg', url: 'f'}
];

</script>

<template>
  <section class="datos-personales">
    <div class="card">
      <h1>{{title}}</h1>
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
    background-color: rgb(97, 97, 97);
    border-radius: 5px;
    margin: 1rem;
  }
  .card{
    padding: 1rem;
    text-align: center;
  }
  .container-lista{
    display: flex;
    justify-content: center;
    align-items: center;
    padding: 1rem;

    li{
     background-color: #fff;
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