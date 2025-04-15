<script setup>
import { onMounted } from 'vue'
import { useStudent } from '@/api/Students'
import StudentCard from '@/components/StudentCard.vue'

// 컴포저블 함수 사용
const { students, error, fetchAllStudents } = useStudent()

onMounted(() => {
  fetchAllStudents()
})
</script>

<template>
  <div class="students">
    <h2>KB-19기 학생들</h2>
    <div>
      <div v-for="student in students" :key="student.id">
        <StudentCard :student="student" />
      </div>
    </div>
  </div>
</template>

<style scoped>
.students {
  margin: 20px;
}
</style>
