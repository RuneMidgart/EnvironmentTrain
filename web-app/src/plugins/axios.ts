import axios from "axios";
import { serviceOptions as api } from "@/api";

const config = {
  baseUrl: process.env.baseUrl,
  timeout: 60 * 1000,
};

const _axios = axios.create(config);

_axios.interceptors.request.use(
  (cfg) => {
    return cfg;
  },
  (err) => {
    return Promise.reject(err);
  }
);

_axios.interceptors.response.use(
  (res) => {
    return res;
  },
  (err) => {
    return Promise.reject(err);
  }
);

const Plugin = {
  install: (Vue: any) => {
    Vue.$axios = _axios;
  },
};
Plugin.install = (Vue) => {
  Vue.$axios = _axios;
  window.axios = _axios;
};

api.axios = _axios;

export default Plugin;
