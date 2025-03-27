<script setup>
import CheckboxItem from './components/CheckboxItem2.vue'
import { ref } from 'vue'

const idols = ref([
  { id: 1, name: 'BTS', checked: true },
  { id: 2, name: 'Black Pink', checked: false },
  { id: 3, name: 'EXO', checked: false },
  { id: 4, name: 'ITZY', checked: false },
])
</script>

<template>
  <h2>관심있는 K-POP 가수?</h2>
  <hr />
  <ul>
    <CheckboxItem v-for="idol in idols" :key="idol.id" :idol="idol" />
  </ul>
</template>

<style scoped></style>
