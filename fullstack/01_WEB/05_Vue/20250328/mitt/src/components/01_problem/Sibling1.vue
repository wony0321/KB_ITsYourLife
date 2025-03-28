<script setup>
const emit = defineEmits(['sendMessage'])
function sendMessage() {
  emit('send-message', '안녕 sibling2! 나는 sibling1이야!')
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
