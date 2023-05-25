<template>
  <div class="four-c">
    <div class="four-c-top"></div>
    <div class="four-c-bottom"></div>
  </div>
</template>

<script>
  export default {
    name:'four-c',
    data(){
      return{
        items:["dklajkl","daklklm","dpqfk;lqfk;l"]
      }
    }
  }
</script>

<style scoped>
.four-c-bottom{
  margin: 10px;
  width: 280px;
  height: 190px;
  background-color: #5FB878;
}

.four-c-top{
  margin: 10px;
  width: 280px;
  height: 280px;
  background-color: #00FF00;
}
.four-c{
  margin-left: 30px;
  margin-right: 30px;
  margin-top: 10px;
  margin-bottom: 5px;
  width: 300px;
  float: left;
  height: 500px;
  border-radius: 20px;
  background-color: #0000FF;
}

.home-four{
  width: 1500px;
  background-color: #D9D9D9;
  position: absolute;
  top:870px;
  left: 150px;
}
</style>