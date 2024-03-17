package vn.edu.iuh.fit.utils.crypting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Base64EncodingTextTest {
    private EncodingText coding;
    @Test
    void encrypt() {
        try {
            coding=new Base64EncodingText();
            String actual = coding.encrypt("this is a sample");
            String expected="dGhpcyBpcyBhIHNhbXBsZQ==";
            assertEquals(actual,expected);

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Test
    void decrypt() throws Exception{
        coding=new Base64EncodingText();
        String expected="this is a sample";
        String actual = coding.decrypt("dGhpcyBpcyBhIHNhbXBsZQ==");
        assertEquals(actual,expected);
    }
}