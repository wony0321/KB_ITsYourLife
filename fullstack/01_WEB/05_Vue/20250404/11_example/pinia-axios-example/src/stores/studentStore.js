import { ref, computed } from 'vue'
import { defineStore } from 'pinia'
import apiClinet from '@/utils/axios'

export const useStudentStore = defineStore('studentStore', () => {
  // 상태
  const students = ref([])
  // 액션

  const fetchStudents = async () => {
    try {
      const response = await apiClinet.get('/students')
      students.value = response.data
    } catch (error) {
      console.log('학생 정보 로딩 에러', error)
    }
  }
  // 게터
  const studentCount = computed(() => students.value.length)

  return { students, studentCount, fetchStudents }
})
