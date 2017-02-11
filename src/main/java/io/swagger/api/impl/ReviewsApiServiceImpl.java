package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.ErrorModel;
import io.swagger.model.Reviews;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-21T10:24:43.114Z")
public class ReviewsApiServiceImpl extends ReviewsApiService {
    @Override
    public Response reviewsIdGet(long limit, long id, long offset, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
