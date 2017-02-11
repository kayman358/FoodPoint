package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ReviewsApiService;
import io.swagger.api.factories.ReviewsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


import io.swagger.model.ErrorModel;
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

@Path("/reviews")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the reviews API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-21T10:24:43.114Z")
public class ReviewsApi  {
   private final ReviewsApiService delegate = ReviewsApiServiceFactory.getReviewsApi();

    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Gets `reviews` objects. Optional pagination parameters - offset, and limit to determine the number of records to fetch ", response = Reviews.class, responseContainer = "List", tags={ "Reporting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Array of reviews that matched the search criteria", response = Reviews.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Reviews.class, responseContainer = "List") })
    public Response reviewsIdGet(@ApiParam(value = "Page limit",required=true, defaultValue="20") @DefaultValue("20") @QueryParam("limit") long limit
,@ApiParam(value = "id of the review to be fetched",required=true) @PathParam("id") long id
,@ApiParam(value = "Page offset", defaultValue="0") @DefaultValue("0") @QueryParam("offset") long offset
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.reviewsIdGet(limit,id,offset,securityContext);
    }
}
