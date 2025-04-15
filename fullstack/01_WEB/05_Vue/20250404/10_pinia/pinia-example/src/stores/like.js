import { ref, computed } from 'vue';
import { defineStore } from 'pinia';

export const useLikeStore = defineStore('like', () => {
  const likes = ref(0);
  const fiveTimes = computed(() => likes.value * 5);

  const likeCount = () => {
    likes.value++;
  };

  return { likes, likeCount, fiveTimes };
});
