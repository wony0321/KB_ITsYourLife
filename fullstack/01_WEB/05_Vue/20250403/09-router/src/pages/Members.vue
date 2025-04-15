<script setup>
import { onMounted } from 'vue'
import { RouterLink } from 'vue-router'
import members from '@/members.json'

onMounted(() => {
  console.log(members)
})
</script>

<template>
  <div class="card card-body">
    <h2>Members</h2>
    <div v-for="m in members" :key="m.id">
      <RouterLink :to="'/members/' + m.id">
        <img
          class="img-thumbnail"
          style="width: 90px; height: 110px"
          :src="m.photo"
          :title="m.name"
        />
        <h6 class="display-7">{{ m.name }}</h6>
      </RouterLink>
    </div>
  </div>
</template>

<style scoped></style>
