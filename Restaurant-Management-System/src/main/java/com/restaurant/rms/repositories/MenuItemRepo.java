package com.restaurant.rms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.rms.models.MenuItem;

public interface MenuItemRepo extends JpaRepository<MenuItem, Long>{

}
