package io.swagger.api.factories;

import io.swagger.api.CreateApiService;
import io.swagger.api.impl.CreateApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-21T10:24:43.114Z")
public class CreateApiServiceFactory {
    private final static CreateApiService service = new CreateApiServiceImpl();

    public static CreateApiService getCreateApi() {
        return service;
    }
}
