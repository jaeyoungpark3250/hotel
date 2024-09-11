
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ReservationReservationManager from "./components/listers/ReservationReservationCards"
import ReservationReservationDetail from "./components/listers/ReservationReservationDetail"

import PointPointerManager from "./components/listers/PointPointerCards"
import PointPointerDetail from "./components/listers/PointPointerDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/reservations/reservations',
                name: 'ReservationReservationManager',
                component: ReservationReservationManager
            },
            {
                path: '/reservations/reservations/:id',
                name: 'ReservationReservationDetail',
                component: ReservationReservationDetail
            },

            {
                path: '/points/pointers',
                name: 'PointPointerManager',
                component: PointPointerManager
            },
            {
                path: '/points/pointers/:id',
                name: 'PointPointerDetail',
                component: PointPointerDetail
            },




    ]
})
