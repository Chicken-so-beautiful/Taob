<template>
  <div class="person">
    <el-form ref="form" :model="sizeForm" label-width="80px" size="mini">
      <el-form-item  class="two" label="用户ID：">
      </el-form-item>
    <el-form-item class="one two" label="昵称：">
      <el-input v-model="sizeForm.name"></el-input>
    </el-form-item>
    <el-form-item  class="two" label="性别：">
      <el-select v-model="sizeForm.region" placeholder="请选择性别">
        <el-option label="男" value="nan"></el-option>
        <el-option label="女" value="nv"></el-option>
      </el-select>
    </el-form-item>
    <el-form-item  class="two" label="出生时间">
      <el-col :span="11">
        <el-date-picker type="date" placeholder="选择日期" v-model="sizeForm.date1" style="width: 100%;"></el-date-picker>
      </el-col>
      <el-col class="line" :span="2"></el-col>
    </el-form-item>
      <el-form-item class="one two" label="职位：">
        <el-input v-model="sizeForm.name" placeholder="职位"></el-input>
      </el-form-item>
    <el-form-item class="two" label="标签：">
      <el-input  v-model="sizeForm.name" placeholder="写下想说的吧"></el-input>
    </el-form-item>
    <el-form-item  class="two" label="住址：">
      <el-input v-model="sizeForm.name" placeholder="地址"></el-input>
    </el-form-item>
    <el-form-item  class="two" size="large">
      <el-button type="primary" @click="onSubmit">重新编辑</el-button>
      <el-button>取消</el-button>
    </el-form-item>
    </el-form>
  </div>
</template>
<script>
export default {
  name:'Person',
  data() {
    return {
      sizeForm: {
        name: '',
        region: '',
        date1: '',
        date2: '',
        delivery: false,
        type: [],
        resource: '',
        desc: ''
      }
    };
  },
  methods: {
    onSubmit() {
      console.log('submit!');
    }
  }
};
</script>

<style scoped>

.two {
  height: 50px;
}
.one{
  width: 300px;
}
.person{
  width: 700px;
  height: 600px;
  margin: 150px auto;
  border: 1px solid #DCDFE6;
  padding: 20px;
  border-radius:5px ;
  box-shadow: 0 0 30px #DCDFE6;
}
</style>