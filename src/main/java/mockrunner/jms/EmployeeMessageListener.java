package mockrunner.jms;

import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.jms.listener.SessionAwareMessageListener;


public class EmployeeMessageListener implements SessionAwareMessageListener<TextMessage> {
    @Override
    public void onMessage(TextMessage textMessage, Session session) throws JMSException {
        System.out.println("Message Received " + textMessage.getText());
    }
}