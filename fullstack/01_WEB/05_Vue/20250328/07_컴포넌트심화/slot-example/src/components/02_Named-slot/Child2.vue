<script setup></script>

<template>
  <div>
    <header>
      <slot name="header"></slot>
    </header>
    <section>
      <slot></slot>
    </section>
    <footer>
      <slot name="footer"></slot>
    </footer>
    <h1>나는 자식</h1>
  </div>
</template>

<style scoped></style>
