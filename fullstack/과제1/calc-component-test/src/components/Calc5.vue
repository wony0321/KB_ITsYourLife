<script setup>
import { ref, watch } from 'vue'

const x = ref(0)
const result = ref(0)

watch(x, (newValue, oldValue) => {
  console.log(`x 변경: 이전값 = ${oldValue}, 새로운값 = ${newValue}`)
  result.value = newValue
})
</script>

<template>
  <div>
    X : <input type="text" v-model.number="x" /> <br />
    결과: {{ result }}
  </div>
</template>

<style scoped></style>
