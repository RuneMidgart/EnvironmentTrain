import {
  createRouter,
  createWebHashHistory,
  RouteRecordRaw,
} from "vue-router";

const routes: Array<RouteRecordRaw> = [
  {
    path: "/",
    redirect: "/home",
  },
  {
    path: "/home",
    name: "主页",
    component: () => import("../views/Home.vue"),
  },
  {
    path: "/backstages",
    name: "后台",
    component: () => import("../views/backstages/Backstage.vue"),
    children: [
      {
        path: "zones",
        name: "空间区域配置",
        component: () => import("../views/backstages/ZoneBackstage.vue"),
      },
    ],
  },
];

const router = createRouter({
  history: createWebHashHistory(),
  routes,
});

export default router;
