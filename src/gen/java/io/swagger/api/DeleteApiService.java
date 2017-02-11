package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;


import io.swagger.model.ErrorModel;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-21T10:24:43.114Z")
public abstract class DeleteApiService {
    public abstract Response deleteBookmark(long customerId,long bookmarkId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteCustomer(long id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteFavorite(long customerId,long favoriteId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteInvoice(long id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteMenu(long id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteOrder(long customerId,long restaurantId,long orderId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteRestaurant(long id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteReview(long id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deletecustomerContact(long id,SecurityContext securityContext) throws NotFoundException;
}
