import { fileURLToPath, URL } from 'node:url';

import { defineConfig } from 'vite';
import vue from '@vitejs/plugin-vue';
import vueDevTools from 'vite-plugin-vue-devtools';

// https://vite.dev/config/
export default defineConfig({
  plugins: [vue(), vueDevTools()],

  // 심볼릭 링크 생성
  resolve: {
    // @ 심볼릭 링크를 생성하여 src 디렉토리를 가리킴
    alias: {
      '@': fileURLToPath(new URL('./src', import.meta.url)),
    },
  },
});
