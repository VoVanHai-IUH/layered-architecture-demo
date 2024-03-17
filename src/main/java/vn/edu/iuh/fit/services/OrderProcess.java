package vn.edu.iuh.fit.services;

import jakarta.jms.Message;

public interface OrderProcess {
    void processOrder(Message message)throws Exception;
}
