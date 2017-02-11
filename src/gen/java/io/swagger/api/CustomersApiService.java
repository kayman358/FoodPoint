package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;


import io.swagger.model.Bookmarks;
import io.swagger.model.Customers;
import io.swagger.model.Favourites;
import io.swagger.model.Orders;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-21T10:24:43.114Z")
public abstract class CustomersApiService {
    public abstract Response getBookmark(Long limit,long customerId,long customerId2,Long offset,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getCustomer(Long limit,long id,Long offset,String name,String email,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getFavorite(Long limit,long customerId,Long offset,long customerId2,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getOrder(Long limit,long orderId,long customerId,long restaurantId,Long offset,long orderId2,long customerId2,long restaurantId2,String restaurantName,SecurityContext securityContext) throws NotFoundException;
}
