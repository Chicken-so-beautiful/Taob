import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeView from '../views/HomeView.vue'
import login from "@/views/Login";
import fourC from "@/views/four-c";
import personcenter from "@/views/Personcenter";
import Shoppingpage from "@/views/Shoppingpage";
import SHoppingcart from "@/views/SHoppingcart";
import mycartLi from "@/views/Mycart-li";
import ManageLi from "@/views/Manage-li";
Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'HomeView',
    component: HomeView
  },
  {
    path: '/about',
    name: 'about',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  },
  {
    path: '/login',
    name: 'login',
    component: login
  },
  {
    path: '/four-c',
    name: 'four_c',
    component:  fourC,
  },
  {
    path: '/person',
    name:'person',
    component: personcenter

  },
  {
    path: '/Shoppingpage',
    name:'Shoppingpage',
    component: Shoppingpage
  },
  {
    path:'/SHoppingcart',
    name:'SHoppingcart',
    component: SHoppingcart
  },
  {
    path:'/mycartLi',
    name:'mycartLi',
    component: mycartLi
  },
  {
    path:'/Manage-li',
    name:'Manage-li',
    component: ManageLi
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
