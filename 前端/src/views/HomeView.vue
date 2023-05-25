<script setup>
import TheWelcome from '../components/TheWelcome.vue'
</script>

<template>
  <div style="height:100%">
    <el-container style="height: 100%;">
      <el-aside width="200px" style="background-color: rgb(238, 241, 246); height: 100%;" >
        <el-menu :default-openeds="['1', '3']" style="background-color: aqua;">
          <el-submenu index="1">
            <template slot="title"><i class="el-icon-message"></i>导航一</template>
            <el-menu-item-group>
              <template slot="title">分组一</template>
              <el-menu-item index="1-1">选项1</el-menu-item>
              <el-menu-item index="1-2">选项2</el-menu-item>
            </el-menu-item-group>
            <el-menu-item-group title="分组2">
              <el-menu-item index="1-3">选项3</el-menu-item>
            </el-menu-item-group>
            <el-submenu index="1-4">
              <template slot="title">选项4</template>
              <el-menu-item index="1-4-1">选项4-1</el-menu-item>
            </el-submenu>
          </el-submenu>
          <el-submenu index="2">
            <template slot="title"><i class="el-icon-menu"></i>导航二</template>
            <el-menu-item-group>
              <template slot="title">分组一</template>
              <el-menu-item index="2-1">选项1</el-menu-item>
              <el-menu-item index="2-2">选项2</el-menu-item>
            </el-menu-item-group>
            <el-menu-item-group title="分组2">
              <el-menu-item index="2-3">选项3</el-menu-item>
            </el-menu-item-group>
            <el-submenu index="2-4">
              <template slot="title">选项4</template>
              <el-menu-item index="2-4-1">选项4-1</el-menu-item>
            </el-submenu>
          </el-submenu>
          <el-submenu index="3">
            <template slot="title"><i class="el-icon-setting"></i>导航三</template>
            <el-menu-item-group>
              <template slot="title">分组一</template>
              <el-menu-item index="3-1">选项1</el-menu-item>
              <el-menu-item index="3-2">选项2</el-menu-item>
            </el-menu-item-group>
            <el-menu-item-group title="分组2">
              <el-menu-item index="3-3">选项3</el-menu-item>
            </el-menu-item-group>
            <el-submenu index="3-4">
              <template slot="title">选项4</template>
              <el-menu-item index="3-4-1">选项4-1</el-menu-item>
            </el-submenu>
          </el-submenu>
        </el-menu>
      </el-aside>
      
      <el-container>
         
        
        <el-header style="font-size: 10px; right: 10px; position: absolute;">
        
          <span>
              <el-col :span="20">
              <div class="sub-title">用户名</div>
              <div class="demo-basic--circle">
                <div class="block"><el-avatar :size="50" :src="circleUrl"></el-avatar></div>           
              </div>
            </el-col> 
          </span>
        </el-header>
        
        <el-main style="width:1024px">
          <div style="margin-bottom: 30px">
            <el-breadcrumb separator="/">
              <el-breadcrumb-item :to="{path:'/'}">首页</el-breadcrumb-item>
              <el-breadcrumb-item>用户管理</el-breadcrumb-item>
            </el-breadcrumb>
          </div>


          <div style="margin:10px 10px;display: inline-flex;">
            <el-input style="width:200px" v-model="username" placeholder="请输入内容"></el-input>
            <el-input style="width:200px" v-model="email" placeholder="请输入邮箱"></el-input>
            <el-input style="width:200px" v-model="address" placeholder="请输入地址"></el-input>

            <el-button class="ml-5" type="primary" @click="load">搜索<i class="el-icon-search"></i></el-button>
          </div>

          <div style="margin:10px 0">
            <el-button type="primary">新增<i class="el-icon-circle-plus-outline"></i></el-button>
            <el-button type="danger">批量删除<i class="el-icon-remove-outline"></i></el-button>
            <el-button type="primary">导入<i class="el-icon-bottom-right"></i></el-button>
            <el-button type="primary">导出<i class="el-icon-top-right"></i></el-button>
          </div>


          <el-table :data="tableData">
            <el-table-column prop="id" label="ID" width="140">
            </el-table-column>

            <el-table-column prop="username" label="用户名" width="140">
            </el-table-column>

            <el-table-column prop="email" label="邮箱" width="120">
            </el-table-column>

            <el-table-column prop="phone" label="电话" width="140">
            </el-table-column>

            <el-table-column prop="address" label="地址" width="120">
            </el-table-column>

            <el-table-column label="操作">              
                <el-button type="warning">编辑</el-button>
                <el-button type="danger" @click="handleDel">删除</el-button>
            </el-table-column>

          </el-table>

          <div class="block">          
            <el-pagination
              @size-change="handleSizeChange"
              @current-change="handleCurrentChange"
              :current-page="PageNum"
              :page-sizes="[5, 10, 15, 20]"
              :page-size="PageSize"
              layout="total, sizes, prev, pager, next, jumper"
              :total="total">
            </el-pagination>
          </div>



          <el-dialog title="用户信息" v-bind:style="dialogFormVisible">
            <el-form label-width="100px">

              <el-form-item label="用户名">
                <el-input v-model="Form.username" autocomplete="off"></el-input>
              </el-form-item>

              <el-form-item label="用户名">
                <el-input v-model="Form.username" autocomplete="off"></el-input>
              </el-form-item>              

              <el-form-item label="邮箱" >
                <el-input type="Form.email" autocomplete="off"></el-input>
              </el-form-item>

              <el-form-item label="电话">
                <el-input v-model="Form.phone"></el-input>
              </el-form-item>
              
              <el-form-item label="地址">
                <el-input v-model="Form.address" autocomplete="off"></el-input>
              </el-form-item>
              
              <el-form-item>
                <el-button type="primary">提交</el-button>
                <el-button >取消</el-button>
              </el-form-item>

            </el-form>
          </el-dialog>

        </el-main>
      </el-container>
    </el-container>
  </div>

</template>



<script>

  export default {
    data() {      
      return {
        tableData: [],
        total:0,
        PageNum:1,
        PageSize:2,
        username:'',
        email:'',
        address:'',

        circleUrl: "https://cube.elemecdn.com/3/7c/3ea6beec64369c2642b92c6726f1epng.png",
        squareUrl: "https://cube.elemecdn.com/9/c2/f0ee8a3c7c9638a54940382568c9dpng.png",
        sizeList: ["large", "medium", "small"]
      }
    },
   

    methods: {
      load(){
        // request.get("http://localhost:9090/User/page?PageNum="+this.PageNum+"&PageSize="+this.PageSize+"&UserName").then(res=>{
        //   console.log(res);
        //   this.tableData=res.records
        //   this.total=res.total

        // })
        fetch("http://localhost:9090/User/page?PageNum="+this.PageNum+"&PageSize="+this.PageSize).then(res=>res.json()).then(res=>{
          this.tableData=res.data;
          console.log(res.data);
          this.total=res.total;
          })      
      },      

      find(){
        fetch("http://localhost:9090/User/page?UserName="+this.username+"&Email="+this.email+"&Address="+this.email).then(res=>res.json()).then(res=>{
          this.tableData=res.data;
          console.log(res.data);
          this.total=res.total;
          })  
      },
      delete()
      {
        fetch("http://localhost:9090/User/page?&UserName="+this.username+"&Email="+this.email+"&Address="+this.email).then(res=>res.json()).then(res=>{
          this.tableData=res.data;
          console.log(res.data);
          this.total=res.total;
          })  
      },

      handleOpen(key, keyPath) {
        console.log(key, keyPath);
      },
      handleClose(key, keyPath) {
        console.log(key, keyPath);
      },

      handleDel(event){
        console.log(event)
      },

      handleSizeChange(PageSize) {
        console.log(`每页 ${PageSize} 条`);
        this.PageSize=PageSize;
        this.load();
      },
      handleCurrentChange(PageNum) {
        console.log(`当前页: ${PageNum}`);
        this.PageNum=PageNum;
        this.load();
      }
    }
 
  };

</script>