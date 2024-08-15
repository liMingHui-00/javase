<template>
  <div>
    <div class="left">
      <ul>
        <li>
          <div>手机</div>
          <div>></div>
          <div class="show">
            <p>苹果手机</p>
            <p>华为手机</p>
            <p>小米手机</p>
            <p>三星手机</p>
          </div>
        </li>
        <li>
          <div>电视</div>
          <div>></div>
          <!-- <div class="show">
            <p>苹果电视</p>
            <p>华为电视</p>
            <p>小米电视</p>
            <p>三星电视</p>
          </div> -->
        </li>
        <li>
          <div>家电</div>
          <div>></div>
          <!-- <div class="show">
            <p>苹果家电</p>
            <p>华为电视</p>
            <p>小米电视</p>
            <p>三星电视</p>
          </div> -->
        </li>
        <li>
          <div>笔记本 平板 显示器</div>
          <div>></div>
          <!-- <div class="show">
            <p>苹果家电</p>
            <p>华为电视</p>
            <p>小米电视</p>
            <p>三星电视</p>
          </div> -->
        </li>
        <li>
          <div>出行 穿戴</div>
          <div>></div>
          <!-- <div class="show">
            <p>苹果家电</p>
            <p>华为电视</p>
            <p>小米电视</p>
            <p>三星电视</p>
          </div> -->
        </li>
        <li>
          <div>耳机 音箱</div>
          <div>></div>
          <!-- <div class="show">
            <p>苹果家电</p>
            <p>华为电视</p>
            <p>小米电视</p>
            <p>三星电视</p>
          </div> -->
        </li>
        <li>
          <div>健康 儿童</div>
          <div>></div>
          <!-- <div class="show">
            <p>苹果家电</p>
            <p>华为电视</p>
            <p>小米电视</p>
            <p>三星电视</p>
          </div> -->
        </li>
        <li>
          <div>生活 箱包</div>
          <div>></div>
          <!-- <div class="show">
            <p>苹果家电</p>
            <p>华为电视</p>
            <p>小米电视</p>
            <p>三星电视</p>
          </div> -->
        </li>
        <li>
          <div>智能路由器</div>
          <div>></div>
          <!-- <div class="show">
            <p>苹果家电</p>
            <p>华为电视</p>
            <p>小米电视</p>
            <p>三星电视</p>
          </div> -->
        </li>
        <li>
          <div>电源 配件</div>
          <div>></div>
          <!-- <div class="show">
            <p>苹果家电</p>
            <p>华为电视</p>
            <p>小米电视</p>
            <p>三星电视</p>
          </div> -->
        </li>
      </ul>

    </div>
    <div class="right"></div>
  </div>
</template>

<script setup>

</script>

<style lang="scss" scoped>
// .left {

//   ul {
//     list-style: none;
//     width: 200px;
//     background-color: rgb(120, 127, 135);

//     :hover {
//       background-color: rgb(255, 103, 0);
//     }

//     li {
//       height: 42px;
//       border: 1px solid #000;
//       display: flex;
//       justify-content: space-between;
//       align-items: center;
//       padding: 0 10px;
//       cursor: pointer;
//       color: aliceblue;
//       font-size: 14px;
//       position: relative;

//       .show {
//         position: absolute;
//         top: 0;
//         left: 200px;
//         width: 300px;
//         display: none;
//         color: #000;
//         background-color: azure;
//       }

//       :hover .show {
//         display: block;
//         z-index: 5;
//       }

//     }
//   }
// }
.left {
  ul {
    list-style: none;
    width: 200px;
    background-color: rgb(120, 127, 135);

    li {
      height: 42px;
      border: 1px solid #000;
      display: flex;
      justify-content: space-between;
      align-items: center;
      padding: 0 10px;
      cursor: pointer;
      color: aliceblue;
      font-size: 14px;
      position: relative;

      .show {
        position: absolute;
        top: 0;
        left: 200px;
        width: 300px;
        display: none;
        color: #000;
        background-color: azure;
      }

      &:hover {
        background-color: rgb(255, 103, 0);

        .show {
          display: block;
          z-index: 5;
        }
      }
    }
  }
}
</style>