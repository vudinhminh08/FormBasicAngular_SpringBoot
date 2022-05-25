package com.example.backenddemo;

import com.example.backenddemo.model.User;
import com.example.backenddemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BackendDemoApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Ramesh", "Fadarate", "minhvu@gmail.com"));
		this.userRepository.save(new User("LLLLLL", "MMMMM", "minhvu1@gmail.com"));
		this.userRepository.save(new User("MMMMM", "DDDDD", "minhvu3@gmail.com"));
	}
}
