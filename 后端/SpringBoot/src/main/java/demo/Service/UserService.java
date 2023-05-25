package demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.Entity.User;
import demo.Mapper.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper usermapper;
	
	public int Save(User user)
	{
		if(user.getId()!=null)
		{//为空插入
			return usermapper.Insert(user);
		}
		else
		{//不为空更新
			return usermapper.Update(user);
		}
	}
	
}
