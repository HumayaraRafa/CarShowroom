package interfaces;

import java.lang.*;

import entity.*;

public interface IUserRepo
{
	User getUser(String userId, String password);
	void insertUser(User u);
	//void updateUserPassword(User u);
	
	void updateUserPassword(User u);
	void deleteUser(String userId);
}