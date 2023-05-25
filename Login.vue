<template>
  <div class="login" style="width:100%;height:100%;">

  <div class="loginp">
    <h3 class="login-title">{{message}}</h3>
    <el-form ref="form" :model="form">
      <el-form-item label="账号">
        <el-input type="text" placeholder="请输入用户名" v-model="form.name"></el-input>
      </el-form-item>

      <el-form-item label="密码">
        <el-input type="password" placeholder="请输入密码" v-model="form.password"></el-input>
      </el-form-item>

      <el-form-item>
        <el-button type="primary" @click="onsubmit">{{loginorenrol}}</el-button>
      </el-form-item>

      <el-form-item>
          <span  v-show="isshow" style="color: #0000FF ;cursor:pointer" @click="onenrol">没有密码，立即注册</span>
      </el-form-item>
    </el-form>
  </div>
  </div>
</template>

<script>
export default {
  name: "Login",
  data(){
    return{
      message:"欢迎登陆",
      loginorenrol:"登录",
      isshow:true,
      form:{
        name:'',
        password:''
      }
    }
  },
  methods:{
    onsubmit(){
      alert("hello");
      if(this.loginorenrol=="登录") {
        this.$router.push("/ HomeView ");
      }else {
        alert("注册成功")
        this.loginorenrol = "登录";
        this.message = "欢迎登录";
        this.isshow=!this.isshow;
      }

    },
    onenrol(){
      alert("enrol");
      this.message="注册";
      this.loginorenrol='注册';
      this.isshow=!this.isshow;
    }
  }
}
</script>

<style  scoped>
  .loginp{
    width: 300px;
    margin: 150px auto;
    border: 1px solid #DCDFE6;
    padding: 20px;
    border-radius:5px ;
    box-shadow: 0 0 30px #DCDFE6;
  }
  .login-title{
    text-align: center;
  }
</style>