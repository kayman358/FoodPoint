package io.swagger.api.factories;

import io.swagger.api.CustomerContactsApiService;
import io.swagger.api.impl.CustomerContactsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-21T10:24:43.114Z")
public class CustomerContactsApiServiceFactory {
    private final static CustomerContactsApiService service = new CustomerContactsApiServiceImpl();

    public static CustomerContactsApiService getCustomerContactsApi() {
        return service;
    }
}
