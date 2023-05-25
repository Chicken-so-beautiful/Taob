<template>
        <div id="register">
        <form class="layui-form">
            <div class="demo-reg-container">                

                <div class="layui-form-item">
                    <div class="layui-input-wrap">
                        <div class="layui-input-prefix">
                        <i class="layui-icon layui-icon-username"></i>
                        </div>
                        <input type="text" name="nickname" value="" placeholder="昵称" lay-reqtext="请填写昵称" autocomplete="off" class="layui-input" id="nickname">
                    </div>
                </div>

                <div class="layui-form-item">
                  <div class="layui-input-wrap">
                      <div class="layui-input-prefix">
                      <i class="layui-icon layui-icon-password"></i>
                      </div>
                      <input type="password" name="password" value="" lay-verify="required" placeholder="密码" autocomplete="off" class="layui-input" id="reg-password" lay-affix="eye">
                  </div>
                </div>

                <div class="layui-form-item">
                  <div class="layui-input-wrap">
                      <div class="layui-input-prefix">
                      <i class="layui-icon layui-icon-password"></i>
                      </div>
                      <input type="password" name="confirmPassword" value="" lay-verify="required|confirmPassword" placeholder="确认密码" autocomplete="off" class="layui-input" lay-affix="eye">
                  </div>
                </div>
                <!-- 默认头像 -->
                <div class="layui-form-item">
                <button class="layui-btn layui-btn-fluid" lay-submit lay-filter="demo-reg">注册</button>
                </div>

                <div class="layui-form-item demo-reg-other">                
                    <a href="/Login">登录已有帐号</a>
                </div>
            </div>
        </form>
    </div>  
</template>

<style src="../assets/注册页面.css"></style>

<script>
// vue使用
export default{
    data(){

    },
    methods(){

    },
}

    layui.use(function(){
    var $ = layui.$;
    var form = layui.form;
    var layer = layui.layer;
    
    // 自定义验证规则
    form.verify({
        // 确认密码
        confirmPassword: function(value, item){
        var passwordValue = $('#reg-password').val();
        if(value !== passwordValue){
            return '两次密码输入不一致';
        }
        }
    });
    
    // 提交事件
    form.on('submit(demo-reg)', function(data){
        var field = data.field; // 获取表单字段值
            
        
        // 显示填写结果，仅作演示用
        layer.alert(JSON.stringify(field), {
        title: '当前填写的字段值'
        });
        
        // 此处可执行 Ajax 等操作
        // …
        
        return false; // 阻止默认 form 跳转
    });
    
    });
</script>