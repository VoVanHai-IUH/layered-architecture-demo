package vn.edu.iuh.fit.utils.crypting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.crypto.SecretKey;

import static org.junit.jupiter.api.Assertions.*;

class PasswordEncodingTextTest {
    static SecretKey secretKey;
    static PasswordEncodingText encodingText;

    @BeforeAll
    public static void init() {

    }

    @BeforeAll
    static void pre() throws Exception {
        encodingText = new PasswordEncodingText();
        secretKey = (SecretKey) encodingText.loadKey("sec.key");
        encodingText.setSecretKey(secretKey);
    }

    @Test
    void encrypt() throws Exception {
       String actual = encodingText.encrypt("{a=200,b=100}");
        String expected ="8qpsOQb5GiA48hjaZF0iYg==";
        assertEquals(expected,actual);
    }

    @Test
    void decrypt() throws Exception {
        String actual = encodingText.decrypt("8qpsOQb5GiA48hjaZF0iYg==");
        String expected ="{a=200,b=100}";
        assertEquals(expected,actual);
    }
}