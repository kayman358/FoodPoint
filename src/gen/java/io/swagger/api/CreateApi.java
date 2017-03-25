package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.CreateApiService;
import io.swagger.api.factories.CreateApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


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
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/create")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the create API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-21T10:24:43.114Z")
public class CreateApi  {
   private final CreateApiService delegate = CreateApiServiceFactory.getCreateApi();

    @POST
    @Path("/customers/{customer_id}/restaurants/{restaurant_id}/bookmarks")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Create a new bookmark with the customer/restaurant id", response = void.class, tags={ "Event", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "New bookmark added", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Error creating customer", response = void.class) })
    public Response createBookmark(@ApiParam(value = "id of customer adding new bookmark",required=true) @PathParam("customer_id") long customerId
,@ApiParam(value = "id of restaurant being added to bookmark",required=true) @PathParam("restaurant_id") long restaurantId
,@ApiParam(value = "bookmark creation information" ,required=true) Bookmarks createBookmark
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createBookmark(customerId,restaurantId,createBookmark,securityContext);
    }
    @POST
    @Path("/customers")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Create a new foodzone customer", response = void.class, tags={ "Event", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "New customer created", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Error creating customer", response = void.class) })
    public Response createCustomer(@ApiParam(value = "customer creation information" ,required=true) Customers createCustomer
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createCustomer(createCustomer,securityContext);
    }
    @POST
    @Path("/customer-contact/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "create a new customer-contact", response = String.class, tags={ "Provisioning", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "New customerContact created", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = String.class) })
    public Response createCustomerContact(@ApiParam(value = "customerContact information" ,required=true) CustomerContacts customerContact
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createCustomerContact(customerContact,securityContext);
    }
    @POST
    @Path("/customers/{customer_id}/restaurants/{restaurant_id}/favourites")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Create a new favorite with the customer/restaurant id", response = void.class, tags={ "Event", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "New bookmark added", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Error creating customer", response = void.class) })
    public Response createFavorite(@ApiParam(value = "id of customer adding new favorite",required=true) @PathParam("customer_id") long customerId
,@ApiParam(value = "id of restaurant being added to favorite",required=true) @PathParam("restaurant_id") long restaurantId
,@ApiParam(value = "bookmark creation information" ,required=true) Favourites createFavorite
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createFavorite(customerId,restaurantId,createFavorite,securityContext);
    }
    @POST
    @Path("/invoice/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "create a new invoice", response = String.class, tags={ "Provisioning", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "New invoice created", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = String.class) })
    public Response createInvoice(@ApiParam(value = "invoice information" ,required=true) Invoices invoice
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createInvoice(invoice,securityContext);
    }
    @POST
    @Path("/menu/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "create a new menu", response = String.class, tags={ "Provisioning", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "New menu created", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = String.class) })
    public Response createMenu(@ApiParam(value = "menu information" ,required=true) Menus menu
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createMenu(menu,securityContext);
    }
    @POST
    @Path("/customers/{customer_id}/restaurants/{restaurant_id}/order")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Create new order", response = void.class, tags={ "Event", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "New order created", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Error creating order", response = void.class) })
    public Response createOrder(@ApiParam(value = "id of the customer placing order",required=true) @PathParam("customer_id") long customerId
,@ApiParam(value = "id of the restaurant order is being placed from",required=true) @PathParam("restaurant_id") long restaurantId
,@ApiParam(value = "order creation information" ,required=true) Orders createOrder
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createOrder(customerId,restaurantId,createOrder,securityContext);
    }
    @POST
    @Path("/restaurants")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "", notes = "create new customer", response = void.class, tags={ "Event", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "New restaurant created", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Error creating restaurant", response = void.class) })
    public Response createRestaurant(@ApiParam(value = "restaurant creation information" ,required=true) Restaurants createRestaurant
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createRestaurant(createRestaurant,securityContext);
    }
    @POST
    @Path("/review/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "create a new review", response = String.class, tags={ "Provisioning", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "New review created", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = String.class) })
    public Response createReview(@ApiParam(value = "review information" ,required=true) Reviews reviews
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createReview(reviews,securityContext);
    }
}
