<script setup>
import { useLikeStore } from '@/stores/like.js';

const likeStore = useLikeStore();
const { likeCount, likeGetter } = likeStore;
</script>

<template>
  <div>
    <h3>좋아유 개수를 올려보아용</h3>
    <button @click="likeCount">좋아요</button>
  </div>
</template>

<style scoped></style>
