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
    @SqlUpdate("insert into restaurants (name, address, contact-number, "
            + "description, likes, lower-limit, ratings, recommendation, "
            + "tags, upper-limit) "
            + "values (:name, :address, :contact-number, "
            + ":description, :likes, :lower-limit, :ratings, :recommendation, "
            + ":tags, :upper-limit)")
            
    int createNewRestaurant (
            @Bind("name") String name, 
            @Bind("address") String address,
            @Bind("contact-number") String contact_number,
            @Bind("description") String description,
            @Bind("likes") long likes,
            @Bind("lower-limit") long lower_limit,
            @Bind("ratings") long ratings,
            @Bind("recommendation") long recommendation,
            @Bind("tags") String tags,
            @Bind("upper-limit") long upper_limit
                    );
    
    @SqlQuery 

  /**
   * close with no args is used to close the connection
   */
  void close();
}
