<script setup>
import { emitter } from '@/mitt'

const emit = defineEmits(['sendMessage'])
function sendMessage() {
  emitter.emit('send-message', 'sibling2! 나 sibling1라고')
}
</script>

<template>
  <div class="sibling">
    <h3>Sibling1</h3>
    <button @click="sendMessage">Sibling2에게 메시지 보내기</button>
  </div>
</template>

<style scoped>
.sibling {
  border: 1px solid blue;
  padding: 10px;
}
</style>
