package com.project.Thirdpartyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Thirdpartyapi.model.Dummy;

public interface Dummyrepository extends JpaRepository<Dummy, Long> {

}
