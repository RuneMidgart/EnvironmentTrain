const { codegen } = require("swagger-axios-codegen");
const axios = require("axios");

axios.default.get("http://localhost:8888/v3/api-docs").then((resp) => {
  codegen({
    source: resp.data,
    useStaticMethod: true,
    outputDir: "./src/api",
    modelMode: "class",
  });
});
