package io.swagger.api.factories;

import io.swagger.api.ReviewsApiService;
import io.swagger.api.impl.ReviewsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-21T10:24:43.114Z")
public class ReviewsApiServiceFactory {
    private final static ReviewsApiService service = new ReviewsApiServiceImpl();

    public static ReviewsApiService getReviewsApi() {
        return service;
    }
}
