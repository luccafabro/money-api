package com.money.moneyapi.repository;

import com.money.moneyapi.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategoryRepository extends JpaRepository<Integer, Category> {

    @Query(value = "SELECT COALESCE(MAX(CATEGORY_ID), 1) FROM CATEGORY", nativeQuery = true)
    Integer getLastId();
}
