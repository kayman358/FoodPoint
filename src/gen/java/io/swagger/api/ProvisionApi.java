package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ProvisionApiService;
import io.swagger.api.factories.ProvisionApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


import io.swagger.model.ErrorModel;
import io.swagger.model.Payments;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/provision")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the provision API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-21T10:24:43.114Z")
public class ProvisionApi  {
   private final ProvisionApiService delegate = ProvisionApiServiceFactory.getProvisionApi();

    @POST
    @Path("/customers/{customer_id}/orders/{order_id}/payments")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "create new payment for an order", response = void.class, tags={ "Event", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Payment record created", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = void.class) })
    public Response createPayment(@ApiParam(value = "id of the customer making the payment",required=true) @PathParam("customer_id") long customerId
,@ApiParam(value = "id of the order payment is being created for",required=true) @PathParam("order_id") long orderId
,@ApiParam(value = "payment information" ,required=true) Payments payment
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createPayment(customerId,orderId,payment,securityContext);
    }
    @DELETE
    @Path("/customers/{customer_id}/orders/{order_id}/payments/{payment_id}")
    @Consumes({ "application/json" })
    @Produces({ "applications/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Delete a payment by customer/order/payment id", response = void.class, tags={ "Operation", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "payment deleted successfully", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = void.class) })
    public Response deletePayment(@ApiParam(value = "",required=true) @PathParam("customer_id") long customerId
,@ApiParam(value = "",required=true) @PathParam("order_id") long orderId
,@ApiParam(value = "id of order to be deleted",required=true) @PathParam("payment_id") long paymentId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deletePayment(customerId,orderId,paymentId,securityContext);
    }
    @GET
    @Path("/customers/{customer_id}/orders/{order_id}/payments/{payment_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Get payment by customer/order/payment id", response = Payments.class, responseContainer = "List", tags={ "Reporting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "payment fetched by customer/order/payment id", response = Payments.class, responseContainer = "List") })
    public Response getPayment(@ApiParam(value = "Page limit",required=true, defaultValue="20") @DefaultValue("20") @QueryParam("limit") Long limit
,@ApiParam(value = "id of order to be fetched",required=true) @PathParam("order_id") long orderId
,@ApiParam(value = "",required=true) @PathParam("customer_id") long customerId
,@ApiParam(value = "",required=true) @PathParam("payment_id") long paymentId
,@ApiParam(value = "Page offset", defaultValue="0") @DefaultValue("0") @QueryParam("offset") Long offset
,@ApiParam(value = "", defaultValue="0") @DefaultValue("0") @QueryParam("order_id") long orderId2
,@ApiParam(value = "", defaultValue="0") @DefaultValue("0") @QueryParam("customer_id") long customerId2
,@ApiParam(value = "", defaultValue="0") @DefaultValue("0") @QueryParam("payment_id") long paymentId2
,@ApiParam(value = "", defaultValue="0") @DefaultValue("0") @QueryParam("invoice_id") long invoiceId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPayment(limit,orderId,customerId,paymentId,offset,orderId2,customerId2,paymentId2,invoiceId,securityContext);
    }
    @PUT
    @Path("/customers/{customer_id}/orders/{order_id}/payments/{payment_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "update payment for an order using customer/order/payment id", response = void.class, tags={ "Operation", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "payment information updated", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = void.class) })
    public Response updatePayment(@ApiParam(value = "id of the customer that made the order",required=true) @PathParam("customer_id") long customerId
,@ApiParam(value = "id of the order that is payment is being updated for",required=true) @PathParam("order_id") long orderId
,@ApiParam(value = "id of the payment that is being updated",required=true) @PathParam("payment_id") long paymentId
,@ApiParam(value = "payment information to be updated" ) Payments payment
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updatePayment(customerId,orderId,paymentId,payment,securityContext);
    }
}
