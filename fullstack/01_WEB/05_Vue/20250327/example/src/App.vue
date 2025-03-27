<script>
import Parent from './components/Parent.vue'

export default {
  name: 'App',
  data() {
    return {}
  },
  components: { Parent },
}
</script>

<template>
  <h1>나는 루트!</h1>
  <Parent />
</template>

<style scoped></style>
