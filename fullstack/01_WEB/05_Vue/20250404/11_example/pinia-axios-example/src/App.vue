<script setup>
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
  <div class="container">
    <h1>KB 19 회차 학생 관리 시스템</h1>
    <nav class="nav-menu">
      <RouterLink to="/students">학생 목록</RouterLink>
    </nav>
    <RouterView />
  </div>
</template>

<style scoped></style>
