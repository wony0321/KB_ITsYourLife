<script setup>
// 컴포지션 방식에서는 defineProps 함
// 부모 컴포넌트에서 전달받은 프로퍼티를 정의하는 함수

defineProps(['idol'])
</script>

<template>
  <li><input type="checkbox" :checked="idol.checked" />{{ idol.name }}</li>
</template>

<style scoped></style>
