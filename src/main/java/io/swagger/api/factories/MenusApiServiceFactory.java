package io.swagger.api.factories;

import io.swagger.api.MenusApiService;
import io.swagger.api.impl.MenusApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-21T10:24:43.114Z")
public class MenusApiServiceFactory {
    private final static MenusApiService service = new MenusApiServiceImpl();

    public static MenusApiService getMenusApi() {
        return service;
    }
}
