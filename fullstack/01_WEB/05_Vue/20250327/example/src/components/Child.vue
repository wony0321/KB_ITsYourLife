<script>
import GrandChild from './GrandChild.vue'

export default {
  name: 'Child',
  data() {
    return {}
  },
  components: {
    GrandChild,
  },
}
</script>

<template>
  <div class="child">
    <h1>나는 자식</h1>
  </div>
  <GrandChild />
</template>

<style scoped>
.child {
  border: 2px solid blue;
}
</style>
