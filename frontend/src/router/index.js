import { createRouter, createWebHashHistory } from 'vue-router';

const router = createRouter({
  history: createWebHashHistory(),
  routes: [
    {
      path: '/',
      component: () => import('../components/pages/Index.vue'),
    },
    {
      path: '/orderAggregates',
      component: () => import('../components/ui/OrderAggregateGrid.vue'),
    },
  ],
})

export default router;
