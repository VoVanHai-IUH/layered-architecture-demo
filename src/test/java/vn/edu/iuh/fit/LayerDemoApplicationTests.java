package vn.edu.iuh.fit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import vn.edu.iuh.fit.utils.crypting.EncodingText;

import javax.crypto.SecretKey;

@SpringBootTest
class LayerDemoApplicationTests {
    private EncodingText encoding;
    @BeforeTestClass
    void load()throws Exception{

    }
    @Test
    void contextLoads() {
    }

}
