package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.ErrorModel;
import io.swagger.model.Payments;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-21T10:24:43.114Z")
public class ProvisionApiServiceImpl extends ProvisionApiService {
    @Override
    public Response createPayment(long customerId, long orderId, Payments payment, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deletePayment(long customerId, long orderId, long paymentId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getPayment(Long limit, long orderId, long customerId, long paymentId, Long offset, long orderId2, long customerId2, long paymentId2, long invoiceId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updatePayment(long customerId, long orderId, long paymentId, Payments payment, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
