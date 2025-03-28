<script setup>
import Child2 from './Child2.vue'
</script>

<template>
  <div style="border: 2px solid blue; padding: 10px">
    <Child2>
      <template #header>
        <p>헤더입니다.</p>
      </template>
      <template #default>
        <p>기본 슬롯입니다.</p>
      </template>
      <template #footer>
        <p>푸터입니다.</p>
      </template>
    </Child2>
  </div>
</template>

<style scoped></style>
