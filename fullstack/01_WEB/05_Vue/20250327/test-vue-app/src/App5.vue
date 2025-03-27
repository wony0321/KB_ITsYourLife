<script setup>
import { ref } from 'vue'
import InputName from './components/inputName.vue'

const parentName = ref('')
const nameChangeHandler = (event) => {
  parentName.value = event.childName
}
</script>

<template>
  <InputName @nameChange="nameChangeHandler" />
  <hr />
  <div>
    <h3>App Data: {{ parentName }}</h3>
  </div>
</template>

<style scoped></style>
