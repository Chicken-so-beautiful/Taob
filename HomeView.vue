<template>
  <div class="home" style="float: left">

    <div class="home-one">
      <div class="search"  >
        <img style="width: 200px;height:120px" src="../assets/TaobaoLogo.png">
      </div>
      <div class="search" style="margin-top: 80px;width: 600px">
        <el-input   type="text" style="width: 500px;float: left" placeholder="输入搜索物品" >
        </el-input >
        <el-button type="primary" style="float: left" >搜索</el-button>
      </div>
      <div class="search">
      <img src="../assets/二维码logo.png">
      </div>
    </div>


    <div class="home-two">
      <ul>
        <li>
          <div><i class="el-icon-goblet-square"></i></div><div><a href="">女装 /</a></div><div><a href="">内衣 /</a></div><div><a href="">奢侈品</a></div>
        </li>

        <li>
          <div><i class="el-icon-truck"></i></div><div><a href="">女鞋 /</a></div><div><a href="">男鞋 /</a></div><div><a href="">箱包 </a></div>
        </li>

        <li>
          <div><i class="el-icon-apple"></i></div><div><a href="">美妆 /</a></div><div><a href="">饰品 /</a></div><div><a href="">洗护 </a></div>
        </li>

        <li>
          <div><i class="el-icon-ice-tea"></i></div><div><a href="">男装 /</a></div><div><a href="">运动 /</a></div><div><a href="">百货 </a></div>
        </li>

        <li>
          <div><i class="el-icon-lollipop"></i></div><div><a href="">手机 /</a></div><div><a href="">数码 /</a></div><div><a href="">企业礼品</a></div>
        </li>

        <li>
          <div><i class="el-icon-potato-strips"></i></div><div><a href="">家装 /</a></div><div><a href="">电器 /</a></div><div><a href="">车品</a></div>
        </li>

        <li>
          <div><i class="el-icon-water-cup"></i></div><div><a href="">食品 /</a></div><div><a href="">生鲜 /</a></div><div><a href="">母婴</a></div>
        </li>

        <li>
          <div><i class="el-icon-chicken"></i></div><div><a href="">医药 /</a></div><div><a href="">保健 /</a></div><div><a href="">进口</a></div>
        </li>

      </ul>
    </div>


    <div class="home-three">
      <el-carousel  style="height: 600px" :interval="5000" arrow="always">
        <el-carousel-item  style="height: 600px" v-for="item in 4" :key="item">
        </el-carousel-item>
      </el-carousel>
    </div>

    <div class="home-four" id="app" >

<!--     <div class="four-c" >-->
<!--       <div class="four-c-top">-->
<!--       </div>-->
<!--       <div  class="four-c-bottom">-->
<!--       </div>-->
<!--     </div>-->
      <FourC></FourC>

    </div>



    </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'
import Vue from "vue";
import FourC from "@/views/four-c";

export default {
  name: 'HomeView',
  components: {FourC},
  data(){
    return {

    }
  }
}


</script>

<style  scoped>
.home-three{
  width: 1200px;
  position: absolute;
  top:240px;
  left: 450px;
}

.el-carousel__item h3 {
  color: #475669;
  font-size: 18px;
  opacity: 0.75;
  line-height: 300px;
  margin: 0;
}

.el-carousel__item:nth-child(2n) {
  background-color: #99a9bf;
}

.el-carousel__item:nth-child(2n+1) {
  background-color: #d3dce6;
}

.home-two ul li div{
  float:left;
  width: 70px;
  height: 40px;
}
.home-two ul{
  padding: 0px;
  margin: 0px;
  list-style: none;

}

.home-two{
  position: relative;
  top:150px;
  left: 100px;
  width: 300px;
  height: 600px;
  background-color:#D9D9D9;
  border-radius: 10px;
}

.home{
  width: 100%;
  height: 1920px;
  background-color:#C2BE9E;
}
.home-one{
  width: 100%;

}
.search{
  margin-left: 150px;
  width: 200px;
  height: 120px;
  float: left;
  margin-right: 150px;
}

</style>