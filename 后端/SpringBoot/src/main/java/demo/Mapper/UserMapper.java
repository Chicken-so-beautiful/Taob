package demo.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import demo.Entity.User;
@Repository
@Mapper
public interface UserMapper {
	@Select("select * from user")
	List<User> FindAll();
	
	@Insert("insert into user(username,password,email,phone,address) "
			+ "values(#{username},#{password},#{email},#{phone},#{address})")
	int Insert(User user);
	
	@Update("update user set username=#{username},password=#{password},email=#{email},phone=#{phone},address=#{address} where id=#{id}")
	int Update(User user);
	
	@Select("select * from user limit #{PageNum}, #{PageSize}")
	List<User> SelectPage(Integer PageNum,Integer PageSize);
	
	@Select("select * from user where username like #{UserName} and email=#{Email} and address=#{Address}")
	List<User> SelectUser(String UserName,String Email,String Address);
	
	@Delete("delete from user where id=#{id}")
	Integer DeletById(@Param("id") Integer id);
	
	@Select("select count(*) from user")
	Integer SelectTotal();

	@Select("select * from user where username =#{userName} and password=#{passWord}")
	Integer Login(String userName, String passWord);
}
