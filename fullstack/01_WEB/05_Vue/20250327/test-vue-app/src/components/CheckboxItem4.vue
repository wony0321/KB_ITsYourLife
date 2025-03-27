<script setup>
// 컴포지션 방식에서는 defineProps 함
// 부모 컴포넌트에서 전달받은 프로퍼티를 정의하는 함수

defineProps({
  idol: {
    type: Object,
    required: true,
    // validator: Vue의 공식 기능으로, 부모가 prop을 전달할 때마다 함수가 호출됨
    validator: (value) => {
      return (
        (typeof value.id === 'number' || typeof value.id === 'string') &&
        typeof value.name === 'string' &&
        typeof value.checked === 'boolean'
      )
    },
  },
})
</script>

<template>
  <li><input type="checkbox" :checked="checked" />{{ name }}</li>
</template>

<style scoped></style>
