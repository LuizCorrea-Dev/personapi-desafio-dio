package com.luizcorrea.personapi.repository;

import com.luizcorrea.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
