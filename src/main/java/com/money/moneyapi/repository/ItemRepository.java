package com.money.moneyapi.repository;

import com.money.moneyapi.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemRepository extends JpaRepository<Integer, Item> {

    @Query(value = "SELECT COALESCE(MAX(ITEM_ID), 0) FROM ITEM", nativeQuery = true)
    Integer getLastId();

    @Query(value = "SELECT COALESCE(COUNT(CATEGORY_ID), 0) FROM CATEGORY WHERE CATEGORY_ID = :CATEGORY", nativeQuery = true)
    Integer isValidCategory(@Param("CATEGORY") Integer category);


    List<Item> findAllByCategoryId(Integer category);
}
