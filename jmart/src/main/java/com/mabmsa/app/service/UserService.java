package com.mabmsa.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.mabmsa.app.controller.dto.UserRegistrationDto;
import com.mabmsa.app.model.User;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);

	Page<User> findPaginated(int pageNo, int pageSize, String sortField, String sortDir);

	void saveUser(User user);

	void updateUser(User user);

	User getUserById(long id);

	Optional<User> getUser(long id);
}
