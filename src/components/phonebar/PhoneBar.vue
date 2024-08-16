<template>
  <div class="container">
    <div class="top">
      <span>手机</span>
      <span>查看更多</span>
    </div>
    <div class="main">
      <div class="left">
        <img
          src="https://cdn.cnbj1.fds.api.mi-img.com/mi-mall/dcf9ed8c01a7c3d0bf3ecbca3f22537c.png?thumb=1&w=293&h=768&f=webp&q=90"
          alt="">
      </div>
      <div class="right">
        <div class="item">
          <img
            src="https://cdn.cnbj1.fds.api.mi-img.com/nr-pub/202407190938_6086b4a2d6895f3f00fe0cbd605239fa.png?thumb=1&w=250&h=250&f=webp&q=90"
            alt="">
          <div class="msg">
            <span>Redmi K70 至尊版</span>
            <span>性能魔王 全面进化</span>
            <span>2599元起</span>
          </div>
        </div>
        <div class="item">
          <img
            src="https://cdn.cnbj1.fds.api.mi-img.com/nr-pub/202407190938_6086b4a2d6895f3f00fe0cbd605239fa.png?thumb=1&w=250&h=250&f=webp&q=90"
            alt="">
          <div class="msg">
            <span>Redmi K70 至尊版</span>
            <span>性能魔王 全面进化</span>
            <span>2599元起</span>
          </div>
        </div>
        <div class="item">
          <img
            src="https://cdn.cnbj1.fds.api.mi-img.com/nr-pub/202407190938_6086b4a2d6895f3f00fe0cbd605239fa.png?thumb=1&w=250&h=250&f=webp&q=90"
            alt="">
          <div class="msg">
            <span>Redmi K70 至尊版</span>
            <span>性能魔王 全面进化</span>
            <span>2599元起</span>
          </div>
        </div>
        <div class="item">
          <img
            src="https://cdn.cnbj1.fds.api.mi-img.com/nr-pub/202407190938_6086b4a2d6895f3f00fe0cbd605239fa.png?thumb=1&w=250&h=250&f=webp&q=90"
            alt="">
          <div class="msg">
            <span>Redmi K70 至尊版</span>
            <span>性能魔王 全面进化</span>
            <span>2599元起</span>
          </div>
        </div>
        <div class="item">
          <img
            src="https://cdn.cnbj1.fds.api.mi-img.com/nr-pub/202407190938_6086b4a2d6895f3f00fe0cbd605239fa.png?thumb=1&w=250&h=250&f=webp&q=90"
            alt="">
          <div class="msg">
            <span>Redmi K70 至尊版</span>
            <span>性能魔王 全面进化</span>
            <span>2599元起</span>
          </div>
        </div>
        <div class="item">
          <img
            src="https://cdn.cnbj1.fds.api.mi-img.com/nr-pub/202407190938_6086b4a2d6895f3f00fe0cbd605239fa.png?thumb=1&w=250&h=250&f=webp&q=90"
            alt="">
          <div class="msg">
            <span>Redmi K70 至尊版</span>
            <span>性能魔王 全面进化</span>
            <span>2599元起</span>
          </div>
        </div>
        <div class="item">
          <img
            src="https://cdn.cnbj1.fds.api.mi-img.com/nr-pub/202407190938_6086b4a2d6895f3f00fe0cbd605239fa.png?thumb=1&w=250&h=250&f=webp&q=90"
            alt="">
          <div class="msg">
            <span>Redmi K70 至尊版</span>
            <span>性能魔王 全面进化</span>
            <span>2599元起</span>
          </div>
        </div>
        <div class="item">
          <img
            src="https://cdn.cnbj1.fds.api.mi-img.com/nr-pub/202407190938_6086b4a2d6895f3f00fe0cbd605239fa.png?thumb=1&w=250&h=250&f=webp&q=90"
            alt="">
          <div class="msg">
            <span>Redmi K70 至尊版</span>
            <span>性能魔王 全面进化</span>
            <span>2599元起</span>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>

</script>

<style lang="scss" scoped>
.container {
  width: 1200px;
  height: 700px;
  margin: 0 auto;
  margin-top: 160px;
  border: 1px solid #000;

  .top {
    display: flex;
    justify-content: space-between;
    align-items: center;
    font-size: 20px;
    padding: 5px;
    color: rgba(51, 51, 88, .8);
    margin-bottom: 10px;
  }

  .main {
    // background-color: yellowgreen;
    width: 100%;
    display: flex;
    justify-content: space-between;

    .left {
      img {
        height: 650px;
        width: 270px;
      }
    }

    .right {
      display: flex;
      flex-wrap: wrap;
      width: 930px;
      justify-content: space-between;
      align-content: space-between;

      .item {
        width: 200px;
        height: 300px;

        img {
          width: 200px;
        }

        .msg {
          width: 200px;
          display: flex;
          height: 90px;
          flex-wrap: wrap;
          justify-content: center;
          align-content: space-between;

          span:first-of-type {
            font-size: 14px;
            font-weight: 400;
            color: #333
          }

          span:nth-of-type(2) {
            color: #b0b0b0
          }

          span:nth-of-type(3) {
            color: orange;
          }
        }

      }


    }
  }
}
</style>