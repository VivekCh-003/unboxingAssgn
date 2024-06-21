package com.example.unboxingAssgn.service;

import com.example.unboxingAssgn.entity.Employee;
import com.example.unboxingAssgn.entity.Role;
import com.example.unboxingAssgn.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Employee employee = employeeRepository.findByUsername(username);

        if(employee == null){
            throw new UsernameNotFoundException("Invalid username or password");
        }

        Role role = employee.getRole();
        String roleName = role.getRole(); // Fetch role name from the Role entity

        return User.builder()
                .username(employee.getUsername())
                .password(employee.getPassword())
                .roles(roleName)
                .build();
    }
}
