<template>
  <li style="margin-bottom: 5px">
    <div style="height: 54px;width:100%;border-radius: 20px;background-color:#D3D4D3">
      <div class="" style="float: left;padding-left: 10px"><img style="width: 50px;height: 50px;float: left" src="src/assets/login.webp"><div style="margin-right: 2px; width: 300px;height: 50px;float: left"></div></div>
      <div style=" width: 50px;height: 50px ;float: left;margin-right: 2px;line-height: 50px;margin-left: 30px">79.9</div>
      <div style=" width: 150px;height: 40px;float: left;margin-left:100px;margin-right: 2px;padding-top: 10px"><el-input-number v-model="num" @change="handleChange" :min="1" :max="10" label="描述文字"></el-input-number></div>
      <div style="width: 50px;height: 50px;float: left;margin-left:100px;margin-right: 2px;line-height: 50px;">10000</div>
      <div style="width: 200px;height: 40px;float: left;margin-left:100px;padding-top:10px;margin-right: 2px"> <el-button type="danger">删除</el-button></div>
      <div style="width: 20px;height: 40px;float: left;margin-right: 2px;padding-top: 10px"><input  type="checkbox"></div>
    </div>
  </li>
</template>
<script>
export default {
  name:'Manage-li',
  data(){
    return{
      num:1,
    }

  },
  methods: {
    handleChange(value) {
      console.log(value);
    }
  }
}
</script>
