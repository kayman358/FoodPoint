package io.swagger.api.factories;

import io.swagger.api.CustomersApiService;
import io.swagger.api.impl.CustomersApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-21T10:24:43.114Z")
public class CustomersApiServiceFactory {
    private final static CustomersApiService service = new CustomersApiServiceImpl();

    public static CustomersApiService getCustomersApi() {
        return service;
    }
}
