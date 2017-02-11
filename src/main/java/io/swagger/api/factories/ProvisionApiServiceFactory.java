package io.swagger.api.factories;

import io.swagger.api.ProvisionApiService;
import io.swagger.api.impl.ProvisionApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-21T10:24:43.114Z")
public class ProvisionApiServiceFactory {
    private final static ProvisionApiService service = new ProvisionApiServiceImpl();

    public static ProvisionApiService getProvisionApi() {
        return service;
    }
}
