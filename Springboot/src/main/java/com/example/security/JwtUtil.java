package com.example.security;

import java.util.Optional;

import javax.crypto.SecretKey;
import javax.swing.JComboBox.KeySelectionManager;
import javax.xml.crypto.KeySelector;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.query.KeysetScrollDelegate;
import org.springframework.stereotype.Component;

import com.example.repository.UserRepository;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {
   
//	private static final SecretKey secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS512);
//	
//	private final int jwtExpirationMS = 86400000;
//	
//	private UserRepository userRespository;
//	
//	public JwtUtil(UserRepository userRespository) {
//		this.userRespository = userRespository;
//	}
//	
//	public String generateToken(String username) {
//		Optional<User> user = userRespository.findByUserName(username);
//		
//		return "null";
//		
//		
//	}
	
}
