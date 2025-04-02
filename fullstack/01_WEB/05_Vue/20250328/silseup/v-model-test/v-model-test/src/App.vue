<script setup>
import InputName from './components/Inputname.vue';
import { ref } from 'vue';

const searchName = ref('');

const nameChangeHandler = (e) => {
  searchName.value = e.childName;
};
</script>

<template>
  <div>
    <InputName @nameChange="nameChangeHandler"> </InputName>
    <br />
    <h3>검색어: {{ searchName }}</h3>
  </div>
</template>

<style scoped></style>
