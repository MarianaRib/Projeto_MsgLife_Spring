package com.msglife.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.msglife.model.Mortalidade2016;

@Repository
public interface Repositorio extends CrudRepository<Mortalidade2016,Integer>
{

}
