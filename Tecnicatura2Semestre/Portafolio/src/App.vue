<script setup>
import NavBar from './components/NavBar.vue';
import DatosPersonales from './components/DatosPersonales.vue';
import Educacion from './components/EducacionComponente.vue';
import Experiencia from "./components/ExperienciaComponente.vue";
import ProyectosComponente from './components/ProyectosComponente.vue';
import HabilidadesComponente from './components/HabilidadesComponente.vue';
</script>

<template>
  <header>
    <!--Barra de navegacion-->
    <NavBar />
    <!--Componente Datos Personales-->
    <DatosPersonales />
  </header>
  <main>
    <section id="educacion">
      <h2>Educación - Cursos</h2>
      <Educacion />
    </section>
    <section id="experiencia">
      <h2>Experiencia</h2>
      <Experiencia />
    </section>
    <section id="proyectos">
      <h2>Proyectos</h2>
      <ProyectosComponente />
    </section>

    <section id="habilidades">
      <h2>Habilidades</h2>
        <HabilidadesComponente />
    </section>

    <section id="intereses"><h2>Intereses</h2></section>
  </main>
</template>

<style scoped>

</style>