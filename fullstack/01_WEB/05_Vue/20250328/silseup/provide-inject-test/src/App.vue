<script setup>
import { ref, computed } from 'vue'
import SongList from './components/SongList.vue'

const songs = ref([
  { id: 1, title: 'Blueming', done: true },
  { id: 2, title: 'Dynamite', done: true },
  { id: 3, title: 'Lovesick Girls', done: false },
  { id: 4, title: '마리아(Maria)', done: false },
])

const icons = ref({
  checked: 'far fa-check-circle',
  unchecked: 'far fa-circle',
})

const doneCount = computed(() => {
  return songs.value.filter((s) => s.done).length
})
</script>

<template>
  <div>
    <h2>최신 인기곡</h2>
    <SongList :songs="songs" :icons="icons" :done-count="doneCount" />
  </div>
</template>

<style scoped>
@import url('https://cdnjs.cloudflare.com/ajax/libs/fontawesome/5.14.0/css/all.min.css');
</style>
