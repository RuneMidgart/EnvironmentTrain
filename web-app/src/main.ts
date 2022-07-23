import { createApp } from "vue";
import App from "./App.vue";
import router from "./router";
import store from "./store";
import AxiosPlugin from "./plugins/axios";
import Antd from "ant-design-vue";
import "ant-design-vue/dist/antd.css";

createApp(App).use(store).use(router).use(AxiosPlugin).use(Antd).mount("#app");
