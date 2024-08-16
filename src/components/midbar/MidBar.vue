<template>
  <div>
    <div class="mid-bar">
      <div class="mid-bar-left">
        <div><i class="iconfont icon-baozhangfuwu"></i><span>正品保障</span></div>
        <div><i class="iconfont icon-qiyetuangou"></i><span>企业团购</span></div>
        <div><i class="iconfont icon-Fmatongdao"></i><span>F码通道</span></div>
        <div><i class="iconfont icon-mifenka"></i><span>米粉卡</span></div>
        <div><i class="iconfont icon-yijiuhuanxin"></i><span>以旧换新</span></div>
        <div><i class="iconfont icon-iconfontshoujichongzhi"></i><span>话费充值</span></div>
      </div>
      <div class="mid-bar-right">
        <img src="https://cdn.cnbj1.fds.api.mi-img.com/mi-mall/6b67117bc92924fb2ff0e7ad2be86084.png?w=632&h=340" alt="">
        <img src="https://cdn.cnbj1.fds.api.mi-img.com/mi-mall/8dede2520f8dfff9c9b690af498cafe8.jpg?w=632&h=340" alt="">
        <img src="https://cdn.cnbj1.fds.api.mi-img.com/mi-mall/1ac77590368ff636d0b4f6a988133f55.png?w=632&h=340" alt="">
      </div>
      <hr>
      <img
        src="https://cdn.cnbj1.fds.api.mi-img.com/mi-mall/431c27bed2794603e0f917119121cd2a.png?thumb=1&w=1533&h=150&f=webp&q=90"
        alt="">
    </div>
  </div>
</template>

<script setup>

</script>

<style lang="scss" scoped>
.mid-bar {
  position: relative;
  width: 1200px;
  height: 210px;
  margin: 0 auto;

  .mid-bar-left {
    display: flex;
    width: 275px;
    height: 200px;
    justify-content: space-around;
    flex-wrap: wrap;
    border: 1px solid #000;



    div {
      width: 80px;
      height: 80px;
      display: flex;
      justify-content: space-around;
      flex-direction: column;
      align-items: center;

      &:hover {
        cursor: pointer;
      }

      .iconfont {

        color: rgb(153, 153, 153);
        font-size: 35px;
      }
    }
  }

  .mid-bar-right {
    position: absolute;
    top: 0;
    margin-left: 275px;
    display: flex;
    justify-content: space-around;
    height: 200px;
    width: 925px;

    img {
      width: 300px;
      height: 100%;

      &:hover {
        cursor: pointer;
      }
    }
  }

  img {
    // margin: 100px 0;
    width: 1200px;
    border: 1px solid #000;
  }

  hr {
    opacity: 0;
  }

}
</style>