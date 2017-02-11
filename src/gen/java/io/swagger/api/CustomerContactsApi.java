package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.CustomerContactsApiService;
import io.swagger.api.factories.CustomerContactsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


import io.swagger.model.CustomerContacts;
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

@Path("/customer-contacts")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the customer-contacts API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-21T10:24:43.114Z")
public class CustomerContactsApi  {
   private final CustomerContactsApiService delegate = CustomerContactsApiServiceFactory.getCustomerContactsApi();

    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Gets `reviews` objects. Optional pagination parameters - offset, and limit to determine the number of records to fetch ", response = CustomerContacts.class, responseContainer = "List", tags={ "Reporting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Array of customerContacts that matched the search criteria", response = CustomerContacts.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = CustomerContacts.class, responseContainer = "List") })
    public Response customerContactsIdGet(@ApiParam(value = "Page limit",required=true, defaultValue="20") @DefaultValue("20") @QueryParam("limit") long limit
,@ApiParam(value = "id of the customerContact to be fetched",required=true) @PathParam("id") long id
,@ApiParam(value = "Page offset", defaultValue="0") @DefaultValue("0") @QueryParam("offset") long offset
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.customerContactsIdGet(limit,id,offset,securityContext);
    }
}
