<script setup>
import { ref } from 'vue'

const state = ref({
  x: 10,
  y: 20,
  result: 30,
})

const calcAdd = () => {
  return (state.value.result = Number(state.value.x) + Number(state.value.y))
}
</script>

<template>
  <div>
    X : <input type="text" v-model.number="state.x" /> <br />
    Y : <input type="text" v-model.number="state.y" /> <br />
    <button @click="calcAdd">계산</button> <br />
    <div>결과: {{ state.result }}</div>
  </div>
</template>

<style scoped></style>
