package io.swagger.api.impl;

import com.foodzone.crud.FoodDAO;
import com.foodzone.util.JdbiHelper;
import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.Bookmarks;
import io.swagger.model.CustomerContacts;
import io.swagger.model.Customers;
import io.swagger.model.ErrorModel;
import io.swagger.model.Favourites;
import io.swagger.model.Invoices;
import io.swagger.model.Menus;
import io.swagger.model.Orders;
import io.swagger.model.Restaurants;
import io.swagger.model.Reviews;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-21T10:24:43.114Z")
public class CreateApiServiceImpl extends CreateApiService {
    @Override
    public Response createBookmark(long customerId, long restaurantId, Bookmarks createBookmark, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response createCustomer(Customers createCustomer, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response createCustomerContact(CustomerContacts customerContact, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response createFavorite(long customerId, long restaurantId, Favourites createFavorite, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response createInvoice(Invoices invoice, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response createMenu(Menus menu, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response createOrder(long customerId, long restaurantId, Orders createOrder, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response createRestaurant(Restaurants createRestaurant, SecurityContext securityContext) throws NotFoundException {
        FoodDAO foods = null;
        
        try{
         foods = JdbiHelper.getDBI().open(FoodDAO.class);
         long a = foods.createNewRestaurant(createRestaurant.getName(), 
            createRestaurant.getAddress(), createRestaurant.getContactNumber(), 
            createRestaurant.getDescription(), createRestaurant.getLikes(), 
            createRestaurant.getLowerLimit(), createRestaurant.getRatings(),
            createRestaurant.getRecommendation(), createRestaurant.getTags(),
            createRestaurant.getUpperLimit());
            createRestaurant.setId(a);
            return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "Successfully created!")).build();
       //return Response.ok().entity(createRestaurant).build();
        } catch(Exception ex){
               return Response.serverError().entity(new ApiResponseMessage(ApiResponseMessage.ERROR, ex.getMessage())).build();
                }
       
    }
    @Override
    public Response createReview(Reviews reviews, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
