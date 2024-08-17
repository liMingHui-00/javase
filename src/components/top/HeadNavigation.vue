<template>
  <div class="main">
    <div class="head">
      <span>小米官网</span>
      <span>小米商城</span>
      <span>小米澎湃OS</span>
      <span>小米汽车</span><span>云服务</span><span>loT</span><span>有品</span><span>小艾开放平台</span><span>资质证照</span><span>协议规则</span><span>下载app</span><span>Select
        Location</span><span>登录</span><span>注册</span><span>消息通知</span><span>购物车</span>
    </div>
    <div class="nav">
      <i class="iconfont color-xiaomi"></i>
      <div class="navbar">
        <div>xiaomi手机</div>
        <div>redmi手机</div>
        <div>电视</div>
        <div>笔记本</div>
        <div>平板</div>
        <div>家电</div>
        <div>路由器</div>
        <div>服务中心</div>
        <div>社区</div>
        <div><input type="text" placeholder="笔记本"><i class="iconfont icon-sousuokuang"></i></div>
      </div>
    </div>
  </div>
</template>

<script setup>

</script>

<style lang="scss" scoped>
.main {
  width: 100%;
  height: 40px;
  background-color: #424242;
  margin-bottom: 100px;

  .head {
    color: #b0b0b0;
    line-height: 40px;
    display: flex;
    justify-content: space-around;

    :hover {
      color: aliceblue;
      cursor: pointer;
    }
  }

  .nav {
    width: 1200px;
    height: 88px;
    display: flex;
    align-items: center;
    margin: 0 auto;

    .color-xiaomi {
      width: 56px;
      height: 56px;
      font-size: 56px;
    }

    .navbar {
      display: flex;
      justify-content: space-between;
      align-items: center;
      flex: 1;
      margin-left: 30px;
      // background-color: blueviolet;
      height: 56px;

      :hover {
        color: rgb(255, 103, 0);
        cursor: pointer;
      }

      div {
        color: #333;
        font-size: 18px;
        height: 100%;
        line-height: 56px;

        input {
          width: 60px;
          height: 80%;
          border-radius: 10px;
          padding: 10px;
          border: 1px solid rgba($color: #000000, $alpha: 0.1);
          outline: none;
        }

        .icon-sousuokuang {
          width: 50px;
          height: 80%;
          font-size: 18px;
          text-align: center;
          display: inline-block;
        }
      }
    }
  }

}
</style>