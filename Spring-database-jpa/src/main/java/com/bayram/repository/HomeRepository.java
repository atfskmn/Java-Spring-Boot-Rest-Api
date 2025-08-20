package com.bayram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bayram.entities.Home;

@Repository
public interface HomeRepository extends JpaRepository<Home,Long>{

}
