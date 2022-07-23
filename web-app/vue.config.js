module.exports = {
  publicPath: "",
  outputDir: "dist",
  runtimeCompiler: true,
  devServer: {
    proxy: {
      "/api": {
        target: "http://localhost:8888",
      },
    },
    port: 8080,
  },
};
