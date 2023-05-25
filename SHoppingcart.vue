<template>
  <div class="SHopingcart">
    <div style="padding-top: 20px; padding-bottom:20px;border-bottom:1px solid black"><!-- `checked` 为 true 或 false -->
      <el-checkbox v-model="checked">全选项</el-checkbox>
      <el-checkbox v-model="nochecked">取消选项</el-checkbox>
    </div>
    <div style="height:650px;width: 100%; overflow: scroll">
      <ul style="padding: 0px;margin: 0px;list-style: none">
        <li style="width: 1200px;height: 40px ;border-bottom: 1px solid black">
          <div class="Sele" style="margin-left:20px;margin-right: 250px">商品信息</div>
          <div class="Sele">单价</div>
          <div class="Sele" style="margin-left:100px;margin-right: 100px; ">数量</div>
          <div class="Sele">总额</div>
          <div class="Sele" style="margin-left: 130px">操作</div>
        </li>
        <li style="margin: 15px"></li>

      <mycart-li></mycart-li>
      </ul>
    </div>

    <div style="padding-top: 30px">
      <el-button type="success">购买所选</el-button>
    </div>

  </div>

</template>

<script>

  import MycartLi from "@/views/Mycart-li";

  export default {
    name:'SHoppingcart',
    components: {MycartLi},
    data(){
      return{
          num: 1,
          checked:true,
          noChecked:false
      }
    },
    methods: {
      handleChange(value) {
        console.log(value);
      }
    }
  }
</script>

<style scoped>
.Sele{
  margin-top: 8px;
  width: 100px;
  height: 50px;
  float: left;
}
.SHopingcart{
  width: 1200px;
  height: 800px;
  background-color: #c2c2c2;
  position: relative;
  left: 350px;
  border-radius: 20px;
}

</style>