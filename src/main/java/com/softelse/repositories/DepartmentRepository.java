package com.softelse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softelse.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
