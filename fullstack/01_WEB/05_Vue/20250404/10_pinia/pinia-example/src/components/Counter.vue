<script setup>
import { useCounterStore } from '@/stores/counter.js';

const counter = useCounterStore();
const { increase, reset } = counter;
</script>

<template>
  <div>
    <h3>{{ counter.count }}</h3>
    <button @click="increase">+ 증가</button>
    <button @click="reset">0 초기화</button>
  </div>
</template>

<style scoped></style>
