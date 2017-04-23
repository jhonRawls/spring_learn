package cn.ibadi.annotation;

import java.util.List;

public class PasswordUtils {
	@UseCase(id = 47,description="密码必须包含以为整数")
	public boolean validatePassword(String password){
		return (password.matches("\\w*\\d\\w*"));
	}
	
	@UseCase(id = 48)
	public String encryPassword(String password){
		return new StringBuilder(password).reverse().toString();
	}
	@UseCase(id = 49,description="新密码不能包含已经使用过的密码")
	public boolean checkForNewPassword(List<String> prePasswords,String password){
		return !prePasswords.contains(password);
	}
}
