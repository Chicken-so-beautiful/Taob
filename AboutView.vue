<template>
  <div class="about">
    <div style="width: 1200px;height: 50px;">
      <div style="float: left;margin-left:10px;margin-top: 20px">
      <el-select v-model="value" placeholder="请选择">
        <el-option
            v-for="item in options"
            :key="item.value"
            :label="item.label"
            :value="item.value">
        </el-option>

      </el-select>
      </div>
      <div style="float: left;margin-left:10px;margin-top: 20px">
      <el-input v-model="input" placeholder="请输入内容"></el-input>
      </div>
      <div style="float: left;margin-top: 20px">
      <el-button type="primary" icon="el-icon-search">搜索</el-button>
      </div>
      <div style="float: left;margin-left:200px;margin-top: 20px">

        <el-select v-model="value1" placeholder="请选择">
          <el-option
              v-for="item in limits"
              :key="item.value"
              :label="item.label"
              :value="item.value">
          </el-option>

        </el-select>

      </div>
      <div style="float: left;margin-top: 20px">
        <el-button type="primary" icon="el-icon">给予权限</el-button>
      </div>
    </div>
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

      <ManageLi></ManageLi>
      </ul>
    </div>

    <div style="padding-top: 30px">
      <el-button type="success">购买所选</el-button>

    </div>
  </div>
</template>

<script>
import MycartLi from "@/views/Mycart-li";
import ManageLi from "@/views/Manage-li";

export default {
  name:'SHoppingcart',
  components: {ManageLi, MycartLi},
  data(){
    return{
      num: 1,
      checked:true,
      noChecked:false,
      input: '',
      options: [{
        value: '选项1',
        label: '按供应商搜索'
      }, {
        value: '选项2',
        label: '按商品类型搜索'
      }, {
        value: '选项3',
        label: '按商品名搜索'
      },{
        value: '选项4',
        label: '搜索用户'
      }],
      value: '',
      limits: [{
        value: '选项1',
        label: '商品专员'
      }, {
        value: '选项2',
        label: '营销经理'
      }, {
        value: '选项3',
        label: '系统管理员'
      }],
     value1:''
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
.about{
  width: 1200px;
  height: 850px;
  background-color: #c2c2c2;
  position: relative;
  left: 350px;
  border-radius: 20px;
}

</style>