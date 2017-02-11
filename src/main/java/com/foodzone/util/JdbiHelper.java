/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodzone.util;

/**
 *
 * @author Kolade
 */
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLException;
import org.skife.jdbi.v2.DBI;


public class JdbiHelper {

    /**
     *
     */
    public JdbiHelper() {

    }

    private static DBI dbi = null;

    /**
     *
     * @return dbi instance
     */
    public final static DBI getDBI() {
        try {
            if (JdbiHelper.dbi == null) {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                String url = "jdbc:mysql://localhost:3306/foodzone";
                String uName = "root";
                String pass = "";
                JdbiHelper.dbi = new DBI(url, uName, pass);
            }
        } catch (SQLException e) {
           
        }

        return JdbiHelper.dbi;
    }
}
