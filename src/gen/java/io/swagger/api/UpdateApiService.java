package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;


import io.swagger.model.CustomerContacts;
import io.swagger.model.Customers;
import io.swagger.model.ErrorModel;
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
public abstract class UpdateApiService {
    public abstract Response editCustomerContact(long id,CustomerContacts customerContact,SecurityContext securityContext) throws NotFoundException;
    public abstract Response editInvoice(long id,Invoices invoice,SecurityContext securityContext) throws NotFoundException;
    public abstract Response editMenu(long id,Menus menu,SecurityContext securityContext) throws NotFoundException;
    public abstract Response editReview(long id,Reviews review,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateCustomer(long id,Customers customer,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateOrder(long customerId,long restaurantId,long orderId,Orders order,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateRestaurant(long id,Restaurants restaurant,SecurityContext securityContext) throws NotFoundException;
}
