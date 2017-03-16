/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodzone.crud;

import org.jdbi.v3.sqlobject.Bind;
import org.jdbi.v3.sqlobject.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.SqlQuery;
import org.jdbi.v3.sqlobject.SqlUpdate;

/**
 *
 * @author Kolade
 */
public interface FoodDAO {
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
            @Bind("contact_umber") String contact_number,
            @Bind("description") String description,
            @Bind("likes") long likes,
            @Bind("lower_limit") long lower_limit,
            @Bind("ratings") long ratings,
            @Bind("recommendation") long recommendation,
            @Bind("tags") String tags,
            @Bind("upper_limit") long upper_limit
                    );
    
    @SqlQuery 

  /**
   * close with no args is used to close the connection
   */
  void close();
}
