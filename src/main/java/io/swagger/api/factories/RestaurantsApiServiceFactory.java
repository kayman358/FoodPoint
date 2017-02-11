package io.swagger.api.factories;

import io.swagger.api.RestaurantsApiService;
import io.swagger.api.impl.RestaurantsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-21T10:24:43.114Z")
public class RestaurantsApiServiceFactory {
    private final static RestaurantsApiService service = new RestaurantsApiServiceImpl();

    public static RestaurantsApiService getRestaurantsApi() {
        return service;
    }
}
