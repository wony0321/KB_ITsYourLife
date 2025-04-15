import { ref } from 'vue';
import { defineStore } from 'pinia';

// pinia 스토어 정의
// defineStore: 스토어 생성하는 함수
// 첫번째 인자가 스토어의 고유 ID가 된다.

export const useCounterStore = defineStore('counter', () => {
  // state (관리할 것)
  const count = ref(0); // 카운터 값을 저장하는 상태

  // getter

  // action
  // 1씩 증가하는 메서드
  function increase() {
    count.value++;
  }

  // 0으로 초기화하는 메서드
  function reset() {
    count.value = 0;
  }

  return { count, increase, reset };
});
