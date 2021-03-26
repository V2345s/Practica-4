package com.springboot.web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String userid, String password) {
		// Slt, dummy
		return userid.equalsIgnoreCase("Slt")
				&& password.equalsIgnoreCase("dummy");
	}

}
