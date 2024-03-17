package vn.edu.iuh.fit.utils;

import org.junit.jupiter.api.Test;
import vn.edu.iuh.fit.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class JsonUtilsTest {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    @Test
    void convertListProducts2Json() {
        Product p1=new Product(1,"Xoài","Xoài cực chua","iamges/xoai.jpg",100);
        Product p2=new Product(2,"Cóc","Cóc Thái","iamges/coc.jpg",150);
        List<Product> lp=new ArrayList<>();
        lp.add(p1);lp.add(p2);
        String expected ="[{\"id\":1,\"name\":\"Xoài\",\"description\":\"Xoài cực chua\",\"imagePath\":\"iamges/xoai.jpg\",\"quantity\":100},{\"id\":2,\"name\":\"Cóc\",\"description\":\"Cóc Thái\",\"imagePath\":\"iamges/coc.jpg\",\"quantity\":150}]";
        String actual = JsonUtils.convertListProducts2Json(lp);
        assertEquals(expected,actual);
    }


    @Test
    void convertJson2ListProduct() {
        String expected ="[{\"id\":1,\"name\":\"Xoài\",\"description\":\"Xoài cực chua\",\"imagePath\":\"iamges/xoai.jpg\",\"quantity\":100},{\"id\":2,\"name\":\"Cóc\",\"description\":\"Cóc Thái\",\"imagePath\":\"iamges/coc.jpg\",\"quantity\":150}]";
        List<Product>productList = JsonUtils.convertJson2ListProduct(expected);

        assertEquals(2,productList.size());
        productList.forEach(product -> {
            logger.info(product.toString());
        });
    }
}