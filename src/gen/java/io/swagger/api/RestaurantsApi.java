package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.RestaurantsApiService;
import io.swagger.api.factories.RestaurantsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


import io.swagger.model.Restaurants;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/restaurants")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the restaurants API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-21T10:24:43.114Z")
public class RestaurantsApi  {
   private final RestaurantsApiService delegate = RestaurantsApiServiceFactory.getRestaurantsApi();

    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Get restaurant by restaurant id", response = Restaurants.class, responseContainer = "List", tags={ "Reporting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Restaurants fetched by id", response = Restaurants.class, responseContainer = "List") })
    public Response getRestaurant(@ApiParam(value = "Page limit",required=true, defaultValue="20") @DefaultValue("20") @QueryParam("limit") Long limit
,@ApiParam(value = "id of restaurant to be fetched",required=true) @PathParam("id") long id
,@ApiParam(value = "Page offset", defaultValue="0") @DefaultValue("0") @QueryParam("offset") Long offset
,@ApiParam(value = "") @QueryParam("name") String name
,@ApiParam(value = "") @QueryParam("tags") String tags
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getRestaurant(limit,id,offset,name,tags,securityContext);
    }
}
