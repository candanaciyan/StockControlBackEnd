package com.tobeto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tobeto.repository.LoginRepository;


@Service
public class LoginService {
	
	@Autowired
	private LoginRepository loginRepository;

}
