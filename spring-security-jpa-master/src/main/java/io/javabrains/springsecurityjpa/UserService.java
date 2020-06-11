package io.javabrains.springsecurityjpa;

import io.javabrains.springsecurityjpa.models.User;

public interface UserService 
{
   
	
	void save(User user);

    User findByUsername(String username);
}