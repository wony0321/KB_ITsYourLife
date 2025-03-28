<script setup>
import Parent from './components/01_slot-basic/Parent.vue'
import Parent2 from './components/02_Named-slot/Parent2.vue'
</script>

<!--
Slot
- 부모의 컴포넌트에서 자식으로 콘텐츠를 전달하는 기능
- 컴포넌트를 더 유연하고, 재사용 가능하게 만들기 위해
-->

<template>
  <Parent />
  <hr />
  <Parent2 />
</template>

<style scoped></style>
