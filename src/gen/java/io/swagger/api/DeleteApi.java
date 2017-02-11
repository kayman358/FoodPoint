package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.DeleteApiService;
import io.swagger.api.factories.DeleteApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


import io.swagger.model.ErrorModel;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/delete")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the delete API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-21T10:24:43.114Z")
public class DeleteApi  {
   private final DeleteApiService delegate = DeleteApiServiceFactory.getDeleteApi();

    @DELETE
    @Path("/customers/{customer_id}/bookmarks/{bookmark_id}")
    @Consumes({ "application/json" })
    @Produces({ "applications/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Delete a bookmark by customer/bookmark id", response = void.class, tags={ "Operation", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Bookmark deleted successfully", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = void.class) })
    public Response deleteBookmark(@ApiParam(value = "id of customer to be deleted",required=true) @PathParam("customer_id") long customerId
,@ApiParam(value = "id of bookmark to be deleted",required=true) @PathParam("bookmark_id") long bookmarkId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteBookmark(customerId,bookmarkId,securityContext);
    }
    @DELETE
    @Path("/customers/{id}")
    @Consumes({ "application/json" })
    @Produces({ "applications/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Delete a customer by id", response = void.class, tags={ "Operation", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Customer deleted successfully", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = void.class) })
    public Response deleteCustomer(@ApiParam(value = "id of customer to be deleted",required=true) @PathParam("id") long id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteCustomer(id,securityContext);
    }
    @DELETE
    @Path("/customers/{customer_id}/favourites/{favorite_id}")
    @Consumes({ "application/json" })
    @Produces({ "applications/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Delete a favorite by customer/favorite id", response = void.class, tags={ "Operation", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Bookmark deleted successfully", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = void.class) })
    public Response deleteFavorite(@ApiParam(value = "id of customer",required=true) @PathParam("customer_id") long customerId
,@ApiParam(value = "id of favorite to be deleted",required=true) @PathParam("favorite_id") long favoriteId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteFavorite(customerId,favoriteId,securityContext);
    }
    @DELETE
    @Path("/invoices/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Delete an invoice", response = void.class, tags={ "Operations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "invoice deleted", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = void.class) })
    public Response deleteInvoice(@ApiParam(value = "invoice id to delete",required=true) @PathParam("id") long id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteInvoice(id,securityContext);
    }
    @DELETE
    @Path("/menu/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Delete a menu", response = void.class, tags={ "Operations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "menu deleted", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = void.class) })
    public Response deleteMenu(@ApiParam(value = "menu id to delete",required=true) @PathParam("id") long id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteMenu(id,securityContext);
    }
    @DELETE
    @Path("/customers/{customer_id}/restaurants/{restaurant_id}/orders/{order_id}")
    @Consumes({ "application/json" })
    @Produces({ "applications/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Delete a order by id", response = void.class, tags={ "Operation", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "order deleted successfully", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = void.class) })
    public Response deleteOrder(@ApiParam(value = "",required=true) @PathParam("customer_id") long customerId
,@ApiParam(value = "",required=true) @PathParam("restaurant_id") long restaurantId
,@ApiParam(value = "id of order to be deleted",required=true) @PathParam("order_id") long orderId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteOrder(customerId,restaurantId,orderId,securityContext);
    }
    @DELETE
    @Path("/restaurants/{id}")
    @Consumes({ "application/json" })
    @Produces({ "applications/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Delete a restaurant by id", response = void.class, tags={ "Operation", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Restaurant deleted successfully", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = void.class) })
    public Response deleteRestaurant(@ApiParam(value = "id of restaurant to be deleted",required=true) @PathParam("id") long id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteRestaurant(id,securityContext);
    }
    @DELETE
    @Path("/review/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Delete a review", response = void.class, tags={ "Operations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "review deleted", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = void.class) })
    public Response deleteReview(@ApiParam(value = "review id to delete",required=true) @PathParam("id") long id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteReview(id,securityContext);
    }
    @DELETE
    @Path("/customer-contact/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Delete an customerContact", response = void.class, tags={ "Operations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "customerContact deleted", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = void.class) })
    public Response deletecustomerContact(@ApiParam(value = "customerContact id to delete",required=true) @PathParam("id") long id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deletecustomerContact(id,securityContext);
    }
}
