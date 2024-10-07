<script setup>
const PROYECTOS = [
  {id: 1, name: 'Proyecto 1', src: 'src/assets/img/rata.webp', description: 'Ejemplo de proyecto creado.', url: '#' },
  {id: 2, name: 'Proyecto 2', src: 'src/assets/img/rata.webp', description: 'Ejemplo de proyecto creado.', url: '#' },
  {id: 3, name: 'Proyecto 3', src: 'src/assets/img/rata.webp', description: 'Ejemplo de proyecto creado.', url: '#' },
  {id: 4, name: 'Proyecto 4', src: 'src/assets/img/rata.webp', description: 'Ejemplo de proyecto creado.', url: '#' },
  {id: 5, name: 'Proyecto 5', src: 'src/assets/img/rata.webp', description: 'Ejemplo de proyecto creado.', url: '#' },
  {id: 6, name: 'Proyecto 6', src: 'src/assets/img/rata.webp', description: 'Ejemplo de proyecto creado.', url: '#' },
]

</script>
<template>
  <div class="galeria">
      <ul class="lista-proyectos">          
        <li v-for="proyecto in PROYECTOS" :key="proyecto.id" class="item-proyecto">
          <img :src="proyecto.src" width="3rem">
          <h3>{{ proyecto.name }}</h3>
          <p>{{ proyecto.description }}</p>
          <button><a :href="proyecto.url" target="_blank">Ver más</a></button>
        </li>
      </ul>
    </div>
</template>

<style scoped>
  .galeria{
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
    align-items: center;
    background: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)), url('src/assets/img/fondoProyectos.jpg') center center / cover no-repeat;
    max-height: 100vh; 
    overflow: auto;

    .lista-proyectos{
      padding: 0;
      display: flex;
      flex-wrap: wrap;
      justify-content: center;
      align-items: center;

      .item-proyecto{
        background-color: rgba(19, 18, 18, 0.822);
        padding: 20px 15px;
        border-radius: 10px;
        margin: 40px 30px;

        img{
          height: 120px;
          width: 100%;
        }
        button a{
          color: #000;
        }
      }
    }

}
</style>