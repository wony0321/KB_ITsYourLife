<script setup>
import { emitter } from '@/mitt'
import { ref, onMounted, onUnmounted } from 'vue'

const message = ref('메시지 없음')

function handleMessage(msg) {
  message.value = msg
}

// 컴포넌트가 마운트되기 직전
onMounted(() => {
  // mitt 이벤트 리스너
  emitter.on('send-message', handleMessage)
})

onUnmounted(() => {
  emitter.off('send-messgae', handleMessage)
})
</script>

<template>
  <div>
    <h3>Sibling2</h3>
    <p>받은 메시지: {{ message }}</p>
  </div>
</template>

<style scoped></style>
