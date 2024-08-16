<template>
  <div class="container">
    <img
      src="https://cdn.cnbj1.fds.api.mi-img.com/mi-mall/88e35cffc82cd98cd53172460067af17.jpg?thumb=1&w=1533&h=150&f=webp&q=90"
      alt="">
    <div class="tubiao">
      <div><i class="iconfont icon-shouhoufuwu"></i><span>预约维修服务</span></div>
      <div><i class="iconfont icon-qitianwuliyoutuihuan"></i><span>7天无理由退货</span></div>
      <div><i class="iconfont icon-15tianmianfeihuanhuo24px"></i><span>15天免费换货</span></div>
      <div><i class="iconfont icon-baobei"></i><span>满69包邮</span></div>
      <div><i class="iconfont icon-dizhi"></i><span>1100家售后网点</span></div>
    </div>
    <aboutBar></aboutBar>
  </div>
</template>

<script setup>
import aboutBar from './aboutBar.vue';

</script>

<style lang="scss" scoped>
.container {
  width: 1200px;
  margin: 0 auto;

  img {
    margin: 20px 0;
    height: 150px;
    width: 100%;
  }

  .tubiao {
    display: flex;
    justify-content: space-around;
    align-items: center;
    height: 60px;
    line-height: 60px;
    font-size: 16px;

    .iconfont {
      font-size: 25px;
      color: gray
    }

    span {
      font-size: 25px;
      color: gray;
    }
  }
}
</style>