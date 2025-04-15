<script setup>
import StudentInfo from '@/components/StudentInfo.vue'
import { useStudentStore } from '@/stores/studentStore'
import { onMounted } from 'vue'

const studentStore = useStudentStore()
const { students, fetchStudents } = studentStore

onMounted(() => {
  fetchStudents()
})
</script>

<template>
  <div>
    <ul class="student-list">
      <li v-for="student in studentStore.students" :key="student.id" class="student-item">
        <StudentInfo :student="student" />
      </li>
    </ul>
  </div>
</template>

<style scoped></style>
