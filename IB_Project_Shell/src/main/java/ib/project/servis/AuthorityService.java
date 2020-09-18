package ib.project.servis;

import java.util.List;

import ib.project.model.Authority;



public interface AuthorityService {
	List<Authority> findById(Long id);
	List<Authority> findByname(String name);
}
