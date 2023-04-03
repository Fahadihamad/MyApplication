package com.example.AppSysem.Repository;

import com.example.AppSysem.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users,String> {
    public User findByUserName(String userName);

}
