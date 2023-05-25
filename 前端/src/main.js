// import './assets/main.css'
// 不再使用内置样式

import './assets/gloable.css'

import { createApp } from 'vue'
import App from './App.vue'
import router from './router'


import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'

const app = createApp(App)

app.use(ElementPlus,{size:"small"})

app.use(router)

app.mount('#app')
