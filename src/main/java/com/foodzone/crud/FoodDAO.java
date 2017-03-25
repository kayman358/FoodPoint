/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodzone.crud;

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

  /**
   * close with no args is used to close the connection
   */
  //void close();
}
