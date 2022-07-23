<template>
  <div class="home">
    <router-link to="/backstages">跳转到后台页面</router-link>
  </div>
</template>

<script lang="ts">
import { Options, Vue } from "vue-class-component";

@Options({})
export default class Home extends Vue {}
</script>
<style scoped>
.home {
  position: absolute;
  inset: 0;
}
</style>
