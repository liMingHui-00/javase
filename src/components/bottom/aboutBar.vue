<template>
  <div class="about_bar">
    <div class="first">
      <span>选购指南</span>
      <ul>
        <li>手机</li>
        <li>电视</li>
        <li>笔记本</li>
        <li>平板</li>
        <li>穿戴</li>
      </ul>
    </div>
    <div class="first">
      <span>服务中心</span>
      <ul>
        <li>申请售后</li>
        <li>订单查询</li>
        <li>保障服务</li>
      </ul>
    </div>
    <div class="first">
      <span>线下门店</span>
      <ul>
        <li>小米之家</li>
        <li>服务网点</li>
      </ul>
    </div>
    <div class="first">
      <span>关于小米</span>
      <ul>
        <li>了解小米</li>
        <li>加入小米</li>
        <li>可持续发展</li>
      </ul>
    </div>
    <div class="first">
      <span>关注我们</span>
      <ul>
        <li>新浪微博</li>
        <li>官方微信</li>
      </ul>
    </div>
  </div>
  <div class="right_bar">
    <div class="phone">400-100-5678</div>
    <div class="time">8:00-18:00(仅收市话费)</div>
    <div class="kefu"><i class="iconfont color-duanxin"></i> 人工客服</div>
  </div>
</template>

<script setup>

</script>

<style lang="scss" scoped>
.about_bar {
  display: flex;
  width: 800px;
  justify-content: space-between;


  .first {
    color: grey;

    span {
      padding: 5px;
      width: 70px;
      height: 50px;
      display: block;
      line-height: 50px;
      margin: 10px 0;
    }

    ul {
      display: flex;
      margin: 0;
      padding: 0;
      flex-direction: column;
      justify-content: center;

      li {
        list-style: none;
        margin: 5px;

      }
    }
  }
}

.right_bar {
  width: 395px;
  height: 500px;
  margin-left: 805px;
  margin-top: -235px;
  text-align: center;

  .phone {
    color: rgb(255, 103, 0);
    margin-top: 30px;
    margin-bottom: 15px;
    font-size: 26px;
  }

  .time {
    font-size: 16px;
    color: #616161;
  }

  .kefu {
    // width: 40px;
    border: 1px solid rgb(255, 103, 0);
    color: rgb(255, 103, 0);
    width: 100px;
    height: 28px;
    font-size: 12px;
    line-height: 28px;
    margin-top: 15px;
    margin-left: 140px;

    .iconfont {
      color: rgb(255, 103, 0);
      font-size: 16px;
    }
  }
}
</style>