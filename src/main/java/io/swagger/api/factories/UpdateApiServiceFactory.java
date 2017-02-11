package io.swagger.api.factories;

import io.swagger.api.UpdateApiService;
import io.swagger.api.impl.UpdateApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-21T10:24:43.114Z")
public class UpdateApiServiceFactory {
    private final static UpdateApiService service = new UpdateApiServiceImpl();

    public static UpdateApiService getUpdateApi() {
        return service;
    }
}
