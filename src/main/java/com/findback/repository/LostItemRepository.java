package com.findback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.findback.entity.LostItem;

public interface LostItemRepository extends JpaRepository<LostItem,Integer> {

}
