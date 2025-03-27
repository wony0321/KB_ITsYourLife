<script setup>
// 컴포지션 방식에서는 defineProps 함
// 부모 컴포넌트에서 전달받은 프로퍼티를 정의하는 함수

defineProps({
  id: [Number, String], // 문자열과 숫자형만 가능하다는 의미
  name: String,
  checked: {
    type: Boolean, // Boolean 타입만 가능
    default: false,
    required: false,
  },
})
</script>

<template>
  <li><input type="checkbox" :checked="checked" />{{ name }}</li>
</template>

<style scoped></style>
