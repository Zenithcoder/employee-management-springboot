package com.zenithcoder.employee.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.zenithcoder.employee.dto.UserRegistrationDto;
import com.zenithcoder.employee.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}

