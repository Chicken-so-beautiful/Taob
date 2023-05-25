<template>
    <div class="layui-row">
            <div class="layui-col-xs6 layui-col-sm6 layui-col-md4">
                <a href="#">
                    <img class="icon" src="../image/淘宝.png">
                </a>
            </div>

            <div class="layui-col-xs6 layui-col-sm6 layui-col-md4">
              
                <!-- 搜索栏 -->
                <div class="search">
                    <div class="layui-form-item">
                        <div class="layui-input-group">
                            <div class="layui-input-prefix">
                                寻找宝贝
                            </div>
                            
                            <input type="text" placeholder="请输入搜索内容" class="layui-input">

                            <div class="layui-input-split layui-input-suffix" style="cursor: pointer;">
                                <i class="layui-icon layui-icon-search"></i>
                            </div>                            
                        </div>
                    </div>
                </div>

            </div>

            <div class="layui-col-xs4 layui-col-sm12 layui-col-md4">              
                <a href="#">
                    <img class="download" src="../image/下载.png"> 
                </a>                              
            </div>           
          </div>

          <div class="layui-row">
            <div class="layui-col-xs4 layui-col-sm5 layui-col-md4">
                <div class="shangpin-img">
                    <!-- 商品页面 -->
                    <img src="../image/1920x1080 (1).jpg">
                </div>
            </div>
            
            <div class="layui-col-xs4 layui-col-sm7 layui-col-md8">
                <div class="shangpin-detail">
                    <!-- 商品详情 -->
                    <h1>商品名称</h1>
                    <h3>商品价格</h3>
                    <span class="layui-text" style="padding: 16px;">
                        <p>商品介绍</p>
                        <p>段落1段落1段落1段落1段落1段落1段落1段落1段落1
                            段落1段落1段落1段落1段落1段落1段落1段落1段落1
                            段落1段落1段落1段落1段落1段落1段落1段落1段落1
                            段落1段落1段落1段落1段落1段落1段落1</p>
                        <p>段落2段落2段落2段落2段落2段落2段落2段落2段落2
                            段落2段落2段落2段落2段落2段落2段落2段落2段落2段落2
                            段落2段落2段落2段落2段落2段落2段落2段落2段落2段落2
                            段落2段落2段落2段落2段落2</p>
                    </span>
                    <div class="shapping">
                        <button type="button" @click="bug" class="layui-btn layui-btn-warm layui-btn-radius">立即购买</button>
                        <button type="button" @click="cart" class="layui-btn layui-btn-danger layui-btn-radius">加入购物车</button>

                    </div>
                </div>             
            </div>
                    
        </div>
</template>
<style src="../assets/商品页面.css"></style>

<script>
export default{
    data(){},
    methods:{
        // 跳转至购买页面
        bug(){

        },
        // 跳转至购物车页面
        cart(){

        }
    },
}

</script>