package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.UpdateApiService;
import io.swagger.api.factories.UpdateApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


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

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/update")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the update API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-21T10:24:43.114Z")
public class UpdateApi  {
   private final UpdateApiService delegate = UpdateApiServiceFactory.getUpdateApi();

    @PUT
    @Path("/customer-contact/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Update an existing customerContact", response = void.class, tags={ "Operations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "customerContact edited successfully", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = void.class) })
    public Response editCustomerContact(@ApiParam(value = "Id of customerContact to update",required=true) @PathParam("id") long id
,@ApiParam(value = "customerContact information" ,required=true) CustomerContacts customerContact
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.editCustomerContact(id,customerContact,securityContext);
    }
    @PUT
    @Path("/invoices/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Update an existing invoice", response = void.class, tags={ "Operations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Invoice edited successfully", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = void.class) })
    public Response editInvoice(@ApiParam(value = "Id of invoice to update",required=true) @PathParam("id") long id
,@ApiParam(value = "invoice information" ,required=true) Invoices invoice
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.editInvoice(id,invoice,securityContext);
    }
    @PUT
    @Path("/menu/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Update an existing menu", response = void.class, tags={ "Operations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Menu edited successfully", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = void.class) })
    public Response editMenu(@ApiParam(value = "Id of menu to update",required=true) @PathParam("id") long id
,@ApiParam(value = "Menu information" ,required=true) Menus menu
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.editMenu(id,menu,securityContext);
    }
    @PUT
    @Path("/review/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Update an existing review", response = void.class, tags={ "Operations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Review edited successfully", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = void.class) })
    public Response editReview(@ApiParam(value = "Id of contract to update",required=true) @PathParam("id") long id
,@ApiParam(value = "review information" ,required=true) Reviews review
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.editReview(id,review,securityContext);
    }
    @PUT
    @Path("/customers/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Update customer with customer id", response = void.class, tags={ "Operation", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Customer information updated", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Error updating customer", response = void.class) })
    public Response updateCustomer(@ApiParam(value = "id of the customer to be updated",required=true) @PathParam("id") long id
,@ApiParam(value = "" ,required=true) Customers customer
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateCustomer(id,customer,securityContext);
    }
    @PUT
    @Path("/customers/{customer_id}/restaurants/{restaurant_id}/orders/{order_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Update order with order id", response = void.class, tags={ "Operation", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Order information updated", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Error updating order", response = void.class) })
    public Response updateOrder(@ApiParam(value = "",required=true) @PathParam("customer_id") long customerId
,@ApiParam(value = "",required=true) @PathParam("restaurant_id") long restaurantId
,@ApiParam(value = "id of the order to be updated",required=true) @PathParam("order_id") long orderId
,@ApiParam(value = "" ,required=true) Orders order
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateOrder(customerId,restaurantId,orderId,order,securityContext);
    }
    @PUT
    @Path("/restaurants/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Update restaurant with restaurant id", response = void.class, tags={ "Operation", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Restaurant information updated", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Error updating restaurant", response = void.class) })
    public Response updateRestaurant(@ApiParam(value = "id of the restaurant to be updated",required=true) @PathParam("id") long id
,@ApiParam(value = "" ,required=true) Restaurants restaurant
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateRestaurant(id,restaurant,securityContext);
    }
}
