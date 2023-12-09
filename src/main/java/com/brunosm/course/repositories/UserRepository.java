package com.brunosm.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunosm.course.entities.User;

//JPA repository já traz a @Repository
public interface UserRepository extends JpaRepository <User, Long> {

}
