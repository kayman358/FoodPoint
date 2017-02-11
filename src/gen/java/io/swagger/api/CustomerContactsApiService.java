package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;


import io.swagger.model.CustomerContacts;
import io.swagger.model.ErrorModel;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-21T10:24:43.114Z")
public abstract class CustomerContactsApiService {
    public abstract Response customerContactsIdGet(long limit,long id,long offset,SecurityContext securityContext) throws NotFoundException;
}
