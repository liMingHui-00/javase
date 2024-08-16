<template>
  <div class="side-bar">
    <div>
      <i class="iconfont icon-shouji"></i>
      <span>手机APP</span>
    </div>
    <div>
      <i class="iconfont icon-wode"></i>
      <span>个人中心</span>
    </div>
    <div>
      <i class="iconfont icon-shouhoufuwu"></i>
      <span>售后服务</span>
    </div>
    <div>
      <i class="iconfont icon-rengongkefu"></i>
      <span>人工客服</span>
    </div>
    <div>
      <i class="iconfont icon-gouwuche"></i>
      <span>购物车</span>
    </div>
  </div>
</template>

<script setup>

</script>

<style lang="scss" scoped>
.side-bar {
  display: flex;
  flex-direction: column;
  position: fixed;
  top: 50%;
  right: 0;
  width: 80px;
  transform: translateY(-50%);
  height: 450px;

  div {
    width: 100%;
    display: flex;
    flex-direction: column;
    justify-content: center;
    height: 85px;
    align-items: center;
    color: rgb(153, 153, 153);

    .iconfont {
      font-size: 30px;
      margin-bottom: 10px;
    }

    &:hover,
    &:hover .iconfont {
      color: rgb(255, 103, 0);
    }
  }
}
</style>