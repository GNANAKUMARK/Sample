package com.ing.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.entity.SampleEntity;

@Repository
public interface SampleDao extends JpaRepository<SampleEntity, Integer>{

}
