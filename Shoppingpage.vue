<template>
  <div class="Shoppingpage">
    <div class="img-frame">
        <img style="width: 500px;height: 500px" src="">
    </div>
    <div class="content">

    </div>

    <div class="shopcart">
      <div style="height: 100px;width: 400px;background-color: #0000FF;font-family:Helvetica Neue ;line-height: 80px">{{Price}}元</div>
      <el-input-number v-model="num" @change="handleChange" :min="1" :max="10" label="描述文字"></el-input-number>
      <el-button type="primary">立即购买</el-button>
      <el-button type="success">加入购物车</el-button>
    </div>
    <footer>
      <img src="../assets/shoppingpage.png">
    </footer>

  </div>


</template>

<script>

export default {
  name:'Shoppingpage',
  data() {
    return {
      num: 1
    };
  },
  methods: {
    handleChange(value) {
      console.log(value);
    }
  }
}
</script>

<style scoped>
.shopcart{
  width: 400px;
  height: 200px;
  background-color: #00FF00;
  position: relative;
  left: 900px;
}
.content{
  position: relative;
  left: 950px;
  width: 550px;
  height: 500px;
  background-color: #5FB878;
}
.img-frame{
  float: left;
  position: relative;
  left:400px;
  width: 500px;
  height: 500px;
  background-color: #5FB878;
}
</style>