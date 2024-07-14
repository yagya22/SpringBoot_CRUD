package com.example.Enotes.service;

import com.example.Enotes.entity.User;

public interface UserService {
	public User saveUser (User  user);
	public boolean existEmailCheck(String email);
}
