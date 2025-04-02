<script setup>
import { ref } from 'vue'

const x = ref(10)
const y = ref(20)
const result = ref(30)

const calcAdd = () => {
  return (result.value = Number(x.value) + Number(y.value))
}
</script>

<template>
  <div>
    X : <input type="text" v-model.number="x" /> <br />
    Y : <input type="text" v-model.number="y" /> <br />
    <button @click="calcAdd">계산</button> <br />
    <div>결과: {{ result }}</div>
  </div>
</template>

<style scoped></style>
