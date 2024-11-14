package testproject;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;


@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
@DirtiesContext(classMode = ClassMode.BEFORE_EACH_TEST_METHOD)
@TestMethodOrder(MethodOrderer.MethodName.class)
class DataBoundaryTest {
    @Autowired
    TestRestTemplate restTemplate;

    @Test
    void a_get_data() {
        restTemplate.getForObject("/data", Void.class);
    }

    @Test
    void b_delete_data() {
        restTemplate.exchange("/data/42", HttpMethod.PUT, HttpEntity.EMPTY, Void.class);
    }
}
