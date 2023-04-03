package com.example.AppSysem.Repository;

import com.example.AppSysem.Entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends JpaRepository<Application,Integer> {
}
