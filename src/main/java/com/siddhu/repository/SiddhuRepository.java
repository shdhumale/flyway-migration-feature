package com.siddhu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.siddhu.model.TableData;

@Repository
public interface SiddhuRepository extends JpaRepository<TableData, Long> {

}