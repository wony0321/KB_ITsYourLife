<script setup></script>

<template>
  <div class="child">
    <h2>Child 1</h2>
  </div>
</template>

<!-- scoped를 써주어야 여기서만 스타일 적용

  특정 속성을 만들어서 해당 컴포넌트에만 등록될 수 있게 바꾸어줌
  ex) data-v-xxxxx
-->
<style scoped>
.child {
  background-color: yellow;
  border: solid 1px black;
  margin: 1.5em;
  padding: 1em;
}
</style>
