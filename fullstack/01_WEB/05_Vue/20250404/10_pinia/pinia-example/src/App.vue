<script setup>
import Counter from '@/components/Counter.vue';
import Like from '@/components/Like.vue';
import { useCounterStore } from '@/stores/counter.js';
import { useLikeStore } from '@/stores/like.js';

const counter = useCounterStore();
const likeStore = useLikeStore();
</script>
<!-- likeStore를 만들고 
 like component에서 버튼으로 좋아요를 올려서
 App component에서 바인딩해서 보이게 하기

 getter 함수를 만들어서 좋아요 개수 5배 뻥튀기
 
 -->
<template>
  <div>
    <h1>Pinia 상태관리 예제</h1>
    <hr />
    <h2>좋아요 개수: {{ likeStore.likes }}</h2>
    <h2>좋아요 개수 뻥튀기: {{ likeStore.fiveTimes }}</h2>
    <Like />
    <hr />
    <h2>App에서 보는 Counter : {{ counter.count }}</h2>
    <Counter />
  </div>
</template>

<style scoped></style>
