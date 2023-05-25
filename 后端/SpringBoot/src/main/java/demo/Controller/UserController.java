package demo.Controller;
//用户处理
//增删改查
//登陆处理
//注册处理

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.Entity.User;
import demo.Mapper.UserMapper;
import demo.Service.UserService;
@RestController
@RequestMapping("/User")
public class UserController {

	@Autowired
	private UserMapper usermapper;
	@Autowired
	private UserService userservice;
//	注册
	@GetMapping("/Register")
	public boolean Register() 
	{
		
		return false;
	}
	
//	登陆
	@GetMapping("/Login")
	public Integer Login(@RequestParam String UserName,@RequestParam String PassWord) 	
	{
		System.out.println("username:"+UserName+",password:"+PassWord);
		Integer r=usermapper.Login(UserName,PassWord);
		System.out.println("result:"+r);
		return r;
	}
	
	@GetMapping
	public List<User> FindAll()
	{
		List<User> all=usermapper.FindAll();
		return all;
	}
	
	@PostMapping
	public Integer Save(@RequestBody User user) 
	{
		return userservice.Save(user);
	}
	
//	分页查询
	@GetMapping("/page")
	public Map<String,Object> FindPage(@RequestParam Integer PageNum,@RequestParam Integer PageSize)
	{
		PageNum=(PageNum-1)*PageSize;
		List<User> data=usermapper.SelectPage(PageNum,PageSize);
		Integer total=usermapper.SelectTotal();
		Map<String, Object> res=new HashMap<String, Object>();
		res.put("data",data);
		res.put("total",total);
		return res;
	}
	
//	具体查询
	@GetMapping("/find")
	public Map<String,Object> FindUser(@RequestParam String Username,@RequestParam String Email,@RequestParam String Address)
	{
		List<User> data=usermapper.SelectUser('%'+Username+'%',Email,Address);
		Map<String,Object> res=new HashMap<String, Object>();
		res.put("data",data);
		res.put("total",data.size());
		return res;
	}
	
//	删除
	@DeleteMapping("/{id}")
	public Integer Delete(@PathVariable Integer id)
	{
		return usermapper.DeletById(id);
	}
}
