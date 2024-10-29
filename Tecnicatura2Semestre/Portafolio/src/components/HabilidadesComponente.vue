<script setup>

  const HABILIDADES = [
    {id: 1, nombre: "Java", src: "src/assets/icons/java.svg"},
    {id: 2, nombre: "Python", src: "src/assets/icons/python.svg"},
    {id: 3, nombre: "Vue", src: "src/assets/icons/vue.svg"},
    {id: 4, nombre: "Git", src: "src/assets/icons/git.svg"},
  ]

  const IDIOMAS = [
    {id: 1, nombre: "Inglés", nivel: "Avanzado"},
    {id: 2, nombre: "Japonés", nivel: "Nativo"},
    {id: 3, nombre: "Portugués", nivel: "Básico"},
  ]
</script>

<template>
  <div class="contendor_habilidades">
    <ul class="habilidades_lista">
      <li class="habilidad" v-for="habilidad in HABILIDADES" :key="HABILIDADES.id">
        <h3>{{ habilidad.nombre }}</h3>
        <img :src="habilidad.src" alt="Icono tecnología">
      </li>
    </ul>
  </div>
  <div class="idiomas">
    <h4>Idiomas</h4>
      <ul class="idiomas_lista">
        <li class="idioma" v-for="idioma in IDIOMAS" :key="IDIOMAS.id">
          <h5>Lengua: {{ idioma.nombre }}</h5>
          <p>Nivel: {{ idioma.nivel }}</p>
        </li>
      </ul>
  </div>
</template>

<style scoped>

  .contenedor_habilidades{
    height: 600px;
  }
  .habilidades_lista{
    margin-top: 20px;
    display: grid;
    grid-template-columns: 1fr 1fr;
    height: 100%;
    padding: 0;
    gap: 20px;

    .habilidad{
      display: flex;
      justify-content: center;
      align-items: center;
      gap: 20px;

      h3{
        font-size: 1.6rem;
      }
      img{
        height: 50px;
        border-radius: 100%;
      }
    }
  }

  .idiomas{
    h4{
      font-size: 2rem;
    }
    .idiomas_lista{
      text-align: start;

      .idioma{
        h5{
          font-size: 1.8rem;
        }
        p{
          font-size: 1.3rem;
        }
      }
    }
  }
  </style>