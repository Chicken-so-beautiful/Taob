<template>
    <div id="app">
    
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

          <!-- 商品内容 -->
          <div class="context">
            <div class="contexthead">
                <div class="lunbotu">
                    <!-- 轮播图 -->
                    <div class="layui-carousel" id="ID-carousel-demo-image">
                        <div carousel-item>
                            <div v-for="image in images"><img v-bind:src="image"></div>
                        </div>    
                    </div>

                    <div class="user">
                        <img src="/src/image/1920x1080 (1).jpg">
                        <div class="user-choice">
                            <button type="button" @click="login" class="layui-btn layui-btn-warm layui-btn-radius">登录</button>
                            <button type="button" @click="register" class="layui-btn layui-btn-danger layui-btn-radius">注册</button>
                        </div>                        
                    </div>

                </div>               
            </div>
           
                
            
            <ul id="flow" class="layui-row">
                <!-- 自动加载 -->
            </ul>
          </div>     
    </div>
</template>

<style src="@/assets/前端.css"></style>

<script>
export default{
    el:'#app',
    methods:{
        login(){
            window.location.href='/Login'
        },
        register(){
            window.location.href="/Register"
        },        
    },
    data(){
        return{
            images:[["/src/image/1920x1080 (1).jpg"],["/src/image/1920x1080 (2).jpg"],["/src/image/1920x1080 (3).jpg"],["/src/image/1920x1080 (4).jpg"]],
            info:{
                name:null,
                url:null,
                address:null,
                sex:null,
                country:null
            }
        }
    },

    mounted(){
        // 联网请求
        // 本地请求失败                
        // axios.get('./data.json').then(response=>(this.info=response.data));
        
        layui.use(function(){
            var flow = layui.flow;
            // 流加载实例
            flow.load({
            elem: '#flow', // 流加载容器
            scrollElem: '#flow', // 滚动条所在元素，一般不用填，此处只是演示需要。
            isAuto:false,
            done: function(page, next){ // 执行下一页的回调
                // 模拟数据插入
                setTimeout(function(){
                var lis = [];
                for(var i = 0; i < 8; i++){
                    lis.push('<div class=\"layui-col-sm3\"><li> <a href=\"#\">'+( (page-1)*8 + i + 1 )+ "<img src="+"\"../src/image/1920x1080 ("+((page-1)*8+i+1)+").jpg\">"+'</a> </li></div>')
                    console.log(lis[i]);
                }                
                console.log(page)
                // 执行下一页渲染，第二参数为：满足“加载更多”的条件，即后面仍有分页
                // pages 为 Ajax返回的总页数，只有当前页小于总页数的情况下，才会继续出现加载更多
                next(lis.join(''), page < 10); // 此处假设总页数为 10
                }, 520);
            }
            
            });


            var carousel = layui.carousel;
            // 渲染 - 图片轮播
            carousel.render({
                elem: '#ID-carousel-demo-image',
                // width: '720px',
                // height: '360px',
                interval: 3000
            });

            var util = layui.util;
            // 自定义固定条
            util.fixbar({
                bars: [{ // 定义可显示的 bar 列表信息 -- v2.8.0 新增                                 
                type: 'cart',
                icon: 'layui-icon-cart',
                style: 'background-color: #FF5722;'
                },],
                // bar1: true,
                // bar2: true,
                // default: false, // 是否显示默认的 bar 列表 --  v2.8.0 新增
                // bgcolor: '#393D52', // bar 的默认背景色
                // css: {right: 100, bottom: 100},
                // target: '#target-test', // 插入 fixbar 节点的目标元素选择器
                // duration: 300, // top bar 等动画时长（毫秒）
                on: { // 任意事件 --  v2.8.0 新增
                mouseenter: function(type){
                    layer.tips(type, this, {
                    tips: 4, 
                    fixed: true
                    });
                },
                mouseleave: function(type){
                    layer.closeAll('tips');
                }
                },
                // 点击事件
                click: function(type){
                console.log(this, type);
                }
            });
        });
    },
}
</script>
        
