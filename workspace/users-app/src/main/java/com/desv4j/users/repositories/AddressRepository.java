package com.desv4j.users.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.desv4j.users.entities.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {

}