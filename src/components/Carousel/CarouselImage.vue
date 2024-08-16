<template>
  <div class="carousel-image">
    <div class="left">
      <ul>
        <li>
          <div>手机</div>
          <div>></div>
          <div class="show">
            <div>苹果手机</div>
            <div>华为手机</div>
            <div>小米手机</div>
            <div>三星手机</div>
          </div>
        </li>
        <li>
          <div>电视</div>
          <div>></div>
          <div class="show">
            <div>苹果电视</div>
            <div>华为电视</div>
            <div>小米电视</div>
            <div>三星电视</div>
          </div>
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
    <div class="right">
      <img
        src="https://cdn.cnbj1.fds.api.mi-img.com/mi-mall/cd9d2fee6a631e17fed49543e57f5f75.jpg?thumb=1&w=1533&h=575&f=webp&q=90"
        alt="">
      <i class="iconfont icon-xiangyou1"></i>
    </div>
  </div>
</template>

<script setup>

</script>

<style lang="scss" scoped>
.carousel-image {
  display: flex;
  width: 1200px;
  height: 436px;
  background-color: yellowgreen;
  margin: 0 auto;


  .left {
    width: 300px;
    background-color: rgb(120, 127, 135);

    ul {
      list-style: none;
      width: 235px;
      height: 436px;

      li {
        height: 42px;
        display: flex;
        justify-content: space-between;
        align-items: center;
        padding: 0 10px;
        margin: 10px;
        cursor: pointer;
        color: aliceblue;
        font-size: 14px;
        position: relative;

        .show {
          position: absolute;
          top: -15px;
          left: 237px;
          width: 300px;
          display: flex;
          flex-direction: column;
          flex-wrap: wrap;
          // display: block;
          border: 1px solid #000;
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

  .right {
    position: relative;
    width: 1000px;
    height: 436px;
    background-color: tomato;

    img {
      width: 100%;
      height: 100%;
    }

    .icon-xiangyou1 {
      position: absolute;
      top: 50%;
      left: 100%;
      transform: translate(-50%, -50%);
      font-size: 25px;
      color: rgb(238, 236, 236);
      z-index: 5;
      margin-left: -15px;
      cursor: pointer;

      &:hover {
        background-color: rgb(113, 106, 99);
        color: rgb(238, 236, 236);

      }
    }
  }
}
</style>