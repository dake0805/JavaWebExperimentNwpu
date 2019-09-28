package lesson.j2ee.ex2;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;


public class BookAddedListener implements HttpSessionAttributeListener {


    @Override
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
        String name = httpSessionBindingEvent.getName();
        Object value = httpSessionBindingEvent.getValue();
        System.out.println("Attribute added: " + name + ": " + value);
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
        String name = httpSessionBindingEvent.getName();
        Object value = httpSessionBindingEvent.getValue();
        System.out.println("Attribute removed: " + name + ": " + value);
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
        String name = httpSessionBindingEvent.getName();
        Object value = httpSessionBindingEvent.getValue();
        System.out.println("Attribute replaced: " + name + ": " + value);
    }
}
