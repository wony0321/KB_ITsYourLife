<script setup>
defineProps(['song', 'icons'])
</script>

<template>
  <li>
    <i :class="song.done ? icons.checked : icons.unchecked"></i>
    {{ song.title }}
  </li>
</template>

<style scoped></style>
