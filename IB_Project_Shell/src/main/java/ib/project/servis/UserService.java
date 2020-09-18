package ib.project.servis;

import java.util.List;

import ib.project.model.User;
import ib.project.model.UserRequest;



public interface UserService {
    User findById(Long id);
    User findByUsername(String username);
    List<User> findAll ();
	User save(UserRequest userRequest);
}
