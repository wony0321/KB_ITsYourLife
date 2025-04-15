<script setup>
import { useStudentStore } from '@/stores/studentStore'
import { onMounted } from 'vue'

const studentStore = useStudentStore()
</script>

<template>
  <div class="summary">
    <p>전체 학생 수: {{ studentStore.studentCount }}</p>
  </div>
</template>

<style scoped></style>
