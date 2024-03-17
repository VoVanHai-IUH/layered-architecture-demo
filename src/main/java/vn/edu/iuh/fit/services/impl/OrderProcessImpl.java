package vn.edu.iuh.fit.services.impl;

import jakarta.jms.Message;
import jakarta.jms.TextMessage;
import org.springframework.jms.annotation.JmsListener;
import vn.edu.iuh.fit.models.Product;
import vn.edu.iuh.fit.services.OrderProcess;

import java.util.List;


public class OrderProcessImpl implements OrderProcess {
    @JmsListener(destination = "order_products")
    public void processOrder(final Message jsonMessage) throws Exception {
        String messageData = null;
        String response = null;
        if(jsonMessage instanceof TextMessage) {
            //1. read message data
            String encodeJson = ((TextMessage) jsonMessage).getText();
            //2. ==> decode
//            List<Product> products=EncodingUtils.decode(encodeJson);
            //3. check for quantity
//            String result = makeOrder(products);
            //4. make order or reject
//            MailingService.sendTextMail("@gmail.com",result);
            //5. send email
        }

    }

    private String makeOrder(List<Product> products) {
        return null;
    }
}
