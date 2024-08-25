package com.restaurant.rms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.rms.models.MenuItem;
import com.restaurant.rms.repositories.MenuItemRepo;

@Service
public class MenuService {
	 @Autowired
	    private MenuItemRepo menuItemRepository;

	    public List<MenuItem> getAllMenuItems() {
	        return menuItemRepository.findAll();
	    }

	    public MenuItem addMenuItem(MenuItem menuItem) {
	        return menuItemRepository.save(menuItem);
	    }
}
