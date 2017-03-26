/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodzone.crud;

import com.sun.jndi.cosnaming.IiopUrl;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

/**
 *
 * @author Kolade
 */
public interface FoodDAO {
// CREATE OPERATIONS
    @GetGeneratedKeys
    @SqlUpdate("INSERT INTO restaurants (name, address, contact_number, "
            + "description, likes, lower_limit, ratings, recommendation, "
            + "tags, upper_limit) "
            + "VALUES (:name, :address, :contact_number, "
            + ":description, :likes, :lower_limit, :ratings, :recommendation, "
            + ":tags, :upper_limit)")
            
    long createNewRestaurant (
            @Bind("name") String name, 
            @Bind("address") String address,
            @Bind("contact_number") String contact_number,
            @Bind("description") String description,
            @Bind("likes") long likes,
            @Bind("lower_limit") double lower_limit,
            @Bind("ratings") double ratings,
            @Bind("recommendation") long recommendation,
            @Bind("tags") String tags,
            @Bind("upper_limit") double upper_limit
                    );
    
    @GetGeneratedKeys
    @SqlUpdate("INSERT INTO customers (name,email_address,password) "
            + "VALUES (:name,:email_address,:password)")
    long createCustomer(
    @Bind("name") String name,
    @Bind("email_address") String email_address,
    @Bind("password") String password
    );
    
    @GetGeneratedKeys
    @SqlUpdate("INSERT INTO customer_contacts(customer_address,phone_number,"
            + "main_contact)"+  "VALUES (:customer_address,:phone_number,:main_contact)")
    long createCustomerContact(
    @Bind("customer_address") String customer_address,
    @Bind("phone_number") String phone_number,
    @Bind("main_contact") boolean main_contact
    );
    
    @GetGeneratedKeys
    @SqlUpdate("INSERT INTO menus (restaurant_id, menu_type, other_menu_items, "
            + "menu_name, menu_price, restaurant_name, description)")
          
    long createMenu(
    @Bind("restaurant_id") long restaurant_id,
    @Bind("menu_type") String menu_type,
    @Bind("other_menu_items") String other_menu_items,
    @Bind("menu_name") String menu_name,
    @Bind("menu_price") float menu_price,
    @Bind("restaurant_name") String restaurant_name,
    @Bind("description") String description);

  /**
   * close with no args is used to close the connection
   */
  void close();
}
