<script setup>
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
  <div class="card card-body">
    <h2>About</h2>
    <nav>
      <RouterLink :to="{ name: 'class' }">학급 소개</RouterLink>
      <br />
      <RouterLink :to="{ name: 'goal' }">목표</RouterLink>
    </nav>
    <hr />
    <RouterView />
  </div>
</template>

<style scoped></style>
