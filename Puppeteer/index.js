const puppeteer = require("puppeteer");
const fs = require("fs/promises");
const { scrollPageToBottom } = require("puppeteer-autoscroll-down");

async function start() {
  const browser = await puppeteer.launch();
  const page = await browser.newPage();
  await page.goto(
    "https://www.nogizaka46.com/s/n46/diary/comment_add/100381?ima=5129"
  );
  await page.waitFor(2000);
  // const lastPosition = await scrollPageToBottom(page, {
  //   size: 500,
  //   delay: 250,
  // });
  // console.log("lastPosition: ", lastPosition);
  // await page.screenshot({ path: "seira.png", fullPage: true });

  //   const names = ["red", "orange", "yellow"];
  const names = await page.evaluate(() => {
    //   #js-cont > main > div.bd--mc.js-st > header > div > div > h1
    return Array.from(document.querySelectorAll("h1")).map(
      (x) => x.textContent
    );
  });
  await fs.writeFile("names.txt", names.join("\n"));

  /** 點擊 */
  // await page.click(".bd--hn__a");
  // await page.screenshot({ path: "seira2.png" });
  // const clickedData = await page.$eval(".bd--hn__a", (el) => {
  //   return el.textContent;
  // });
  // console.log(clickedData);

  /** 輸入 */
  await page.type(`input[name="1"]`, "王");
  await page.screenshot({ path: "seira4.png" });

  const photos = await page.$$eval("img", (imgs) => {
    return imgs.map((x) => x.src);
  });

  /** 存圖 */
  // for (const photo of photos) {
  //   console.log(photo);
  //   const imgPage = await page.goto(photo);
  //   await fs.writeFile(photo.split("/").pop(), await imgPage.buffer());
  // }

  await browser.close();
}

start();
