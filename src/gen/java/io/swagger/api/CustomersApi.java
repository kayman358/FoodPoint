package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.CustomersApiService;
import io.swagger.api.factories.CustomersApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


import io.swagger.model.Bookmarks;
import io.swagger.model.Customers;
import io.swagger.model.Favourites;
import io.swagger.model.Orders;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/customers")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the customers API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-21T10:24:43.114Z")
public class CustomersApi  {
   private final CustomersApiService delegate = CustomersApiServiceFactory.getCustomersApi();

    @GET
    @Path("/{customer_id}/bookmarks")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Get bookmark by customer id", response = Bookmarks.class, responseContainer = "List", tags={ "Reporting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Bookmark fetched by customer id", response = Bookmarks.class, responseContainer = "List") })
    public Response getBookmark(@ApiParam(value = "Page limit",required=true, defaultValue="20") @DefaultValue("20") @QueryParam("limit") Long limit
,@ApiParam(value = "",required=true) @PathParam("customer_id") long customerId
,@ApiParam(value = "",required=true, defaultValue="0") @DefaultValue("0") @QueryParam("customer_id") long customerId2
,@ApiParam(value = "Page offset", defaultValue="0") @DefaultValue("0") @QueryParam("offset") Long offset
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getBookmark(limit,customerId,customerId2,offset,securityContext);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Get customer by customer id", response = Customers.class, responseContainer = "List", tags={ "Reporting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "customer fetched by id", response = Customers.class, responseContainer = "List") })
    public Response getCustomer(@ApiParam(value = "Page limit",required=true, defaultValue="20") @DefaultValue("20") @QueryParam("limit") Long limit
,@ApiParam(value = "id of customer to be fetched",required=true) @PathParam("id") long id
,@ApiParam(value = "Page offset", defaultValue="0") @DefaultValue("0") @QueryParam("offset") Long offset
,@ApiParam(value = "") @QueryParam("name") String name
,@ApiParam(value = "") @QueryParam("email") String email
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCustomer(limit,id,offset,name,email,securityContext);
    }
    @GET
    @Path("/{customer_id}/favourites")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Get favorite by customer id", response = Favourites.class, responseContainer = "List", tags={ "Reporting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Favorite fetched by customer id", response = Favourites.class, responseContainer = "List") })
    public Response getFavorite(@ApiParam(value = "Page limit",required=true, defaultValue="20") @DefaultValue("20") @QueryParam("limit") Long limit
,@ApiParam(value = "",required=true) @PathParam("customer_id") long customerId
,@ApiParam(value = "Page offset", defaultValue="0") @DefaultValue("0") @QueryParam("offset") Long offset
,@ApiParam(value = "", defaultValue="0") @DefaultValue("0") @QueryParam("customer_id") long customerId2
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getFavorite(limit,customerId,offset,customerId2,securityContext);
    }
    @GET
    @Path("/{customer_id}/restaurants/{restaurant_id}/orders/{order_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Get order by order id", response = Orders.class, responseContainer = "List", tags={ "Reporting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Order fetched by id", response = Orders.class, responseContainer = "List") })
    public Response getOrder(@ApiParam(value = "Page limit",required=true, defaultValue="20") @DefaultValue("20") @QueryParam("limit") Long limit
,@ApiParam(value = "id of order to be fetched",required=true) @PathParam("order_id") long orderId
,@ApiParam(value = "",required=true) @PathParam("customer_id") long customerId
,@ApiParam(value = "",required=true) @PathParam("restaurant_id") long restaurantId
,@ApiParam(value = "Page offset", defaultValue="0") @DefaultValue("0") @QueryParam("offset") Long offset
,@ApiParam(value = "", defaultValue="0") @DefaultValue("0") @QueryParam("order_id") long orderId2
,@ApiParam(value = "", defaultValue="0") @DefaultValue("0") @QueryParam("customer_id") long customerId2
,@ApiParam(value = "", defaultValue="0") @DefaultValue("0") @QueryParam("restaurant_id") long restaurantId2
,@ApiParam(value = "") @QueryParam("restaurant_name") String restaurantName
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getOrder(limit,orderId,customerId,restaurantId,offset,orderId2,customerId2,restaurantId2,restaurantName,securityContext);
    }
}
