package com.project.shopapp.services;

import com.project.shopapp.models.Category;
import com.project.shopapp.models.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IRoleService {
    List<Role> getAllRoles();
}
