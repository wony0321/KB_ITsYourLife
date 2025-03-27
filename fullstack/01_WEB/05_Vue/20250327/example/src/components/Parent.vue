<script>
import Child from './Child.vue'
import GrandChild from './GrandChild.vue'

export default {
  name: 'Parent',
  data() {
    return {}
  },
  components: { Child, GrandChild },
}
</script>

<template>
  <div class="parent">
    <h1>나는 부모!</h1>
  </div>
  <Child />
  <GrandChild />
</template>

<style scoped>
.parent {
  border: 2px solid red;
}
</style>
