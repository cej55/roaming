
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ReservationManager from "./components/ReservationManager"

import RomrentalManager from "./components/RomrentalManager"

import PaymentManager from "./components/PaymentManager"

import StatechangedManager from "./components/StatechangedManager"

import Mypage from "./components/Mypage"
export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/reservations',
                name: 'ReservationManager',
                component: ReservationManager
            },

            {
                path: '/romrentals',
                name: 'RomrentalManager',
                component: RomrentalManager
            },

            {
                path: '/payments',
                name: 'PaymentManager',
                component: PaymentManager
            },

            {
                path: '/statechangeds',
                name: 'StatechangedManager',
                component: StatechangedManager
            },

            {
                path: '/mypages',
                name: 'Mypage',
                component: Mypage
            },


    ]
})
