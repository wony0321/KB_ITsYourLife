import './assets/main.css'

import { createApp } from 'vue'
import { createPinia } from 'pinia'

// import App from './App.vue'
// import App from './App2.vue'
// import App from './App3.vue'
// import App from './App4.vue'
import App from './App5.vue'

import router from './router'
// import CheckboxItem from './components/CheckboxItem.vue'

const app = createApp(App)

app.use(createPinia())
app.use(router)

// 따로 import 하지 않아도 전역으로 컴포넌트 사용 가능
// app.component('CheckboxItem', CheckboxItem).mount('#app')
app.mount('#app')
