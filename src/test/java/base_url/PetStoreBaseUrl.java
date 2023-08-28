package base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class PetStoreBaseUrl {
    protected RequestSpecification spec;

    @Before
    public void setUp() throws Exception {
        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                setBaseUri("https://petstore.swagger.io/v2").
                build();
    }
}
