package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;


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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-21T10:24:43.114Z")
public abstract class CreateApiService {
    public abstract Response createBookmark(long customerId,long restaurantId,Bookmarks createBookmark,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createCustomer(Customers createCustomer,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createCustomerContact(CustomerContacts customerContact,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createFavorite(long customerId,long restaurantId,Favourites createFavorite,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createInvoice(Invoices invoice,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createMenu(Menus menu,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createOrder(long customerId,long restaurantId,Orders createOrder,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createRestaurant(Restaurants createRestaurant,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createReview(Reviews reviews,SecurityContext securityContext) throws NotFoundException;
}
