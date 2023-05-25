<template>
      <div id="login">
    <form class="layui-form">
      <div class="demo-login-container">
        <div class="layui-form-item">
          <div class="layui-input-wrap">
            <div class="layui-input-prefix">
              <i class="layui-icon layui-icon-username"></i>
            </div>
            <input type="text" name="username" value="" lay-verify="required" placeholder="用户名" lay-reqtext="请填写用户名" autocomplete="off" class="layui-input" lay-affix="clear">
          </div>
        </div>
        <div class="layui-form-item">
          <div class="layui-input-wrap">
            <div class="layui-input-prefix">
              <i class="layui-icon layui-icon-password"></i>
            </div>
            <input type="password" name="password" value="" lay-verify="required" placeholder="密   码" lay-reqtext="请填写密码" autocomplete="off" class="layui-input" lay-affix="eye">
          </div>
        </div>


        <div class="layui-form-item">
          <input type="checkbox" name="remember" lay-skin="primary" title="记住密码">          
        </div>

        <div class="layui-form-item">
          <button class="layui-btn layui-btn-fluid" lay-submit lay-filter="demo-login" >登录</button>
        </div>

        <div class="layui-form-item demo-login-other">
          <a href="/Register">注册帐号</a>
        </div>
      
      </div>
    </form>
  </div>
</template>

<style src="../assets/登陆页面.css"></style>
<script>
  layui.use(function(){
    var form = layui.form;

    // var layer = layui.layer;
    
    // 提交事件
    form.on('submit(demo-login)', function(data){
      var field = data.field; // 获取表单字段值
      // 显示填写结果，仅作演示用
      // layer.alert(JSON.stringify(field), {
      //   title: '当前填写的字段值'
      // });
      // 此处可执行 Ajax 等操作
      axios({
        // 方式
        method:"get",
        // 地址
        url:"http://localhost:9090/User/Login/",
        // // 参数 Get方法
        // params:{},
        // 请求参数  Post方法
        params:{
          UserName:field.username,
          PassWord:field.password
        }
      }).then(res=>{
        console.log(res)
        if(res.data!=null)
        {
          window.location.href="/head";
        }
        else{
          alert("密码错误!");
        }
      });

      // axios.get('http://localhost:9090/User/Login/',data{username,password})
      // axios.get("",{
      //   // get参数
      //   params:{}
      // })
      // axios.post("",{
      //   //post参数
      //   data:{}
      // })
      return false; // 阻止默认 form 跳转
    });


    var util = layui.util;
    // 事件
    util.on('lay-on', {
      "test-msg-dark": function(){
        layer.msg('深色提示框的示例');
      },
    });

  });  
</script>