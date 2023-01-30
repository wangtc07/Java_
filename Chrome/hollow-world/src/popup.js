import axios from "axios";

import "./popup.css";

(function () {
  let url = "";

  // get tabs url
  chrome.tabs.query({ active: true, currentWindow: true }, (e) => {
    console.log("e: ", e);
    url = e[0].url;
    console.log(url);
  });

  document
    .getElementById("decrementBtn")
    .addEventListener("click", async () => {
      console.log("popup.js");
      let body = {
        url: url,
      };
      console.log("body: ", body);

      const re = /https:\/\/www\.nogizaka46\.com\/s\/n46\/diary\/detail\/.*/;
      if (!re.test(url)) {
        alert("is not nogizaka blog page");
        return;
      }

      axios
        .request("http://127.0.0.1:5000/blog_single/photo", {
          method: "GET",
          params: body,
          responseType: "blob", // important
        })
        .then(function (response) {
          console.log(response);
          const url = window.URL.createObjectURL(new Blob([response.data]));
          const link = document.createElement("a");
          link.href = url;
          link.setAttribute("download", "file.zip");
          document.body.appendChild(link);
          link.click();
        })
        .catch(function (error) {
          console.log(error);
        });
    });
})();
