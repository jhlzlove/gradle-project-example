package org.jimmer.jimmerdatasouce;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootWithJimmerMultipleDatasourceApplicationTests {

    @Test
    void contextLoads() {
        a(1, 2, 3, 4);
    }

    void a(int... a) {

    }
}
