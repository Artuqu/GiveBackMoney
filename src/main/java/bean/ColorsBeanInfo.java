package bean;

import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class ColorsBeanInfo extends SimpleBeanInfo {
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor rectangular = new PropertyDescriptor("rectangular", Colors.class);
            PropertyDescriptor[] pd = {rectangular};
            return pd;
        } catch (Exception e) {
            System.out.println("Exception catch" + e);
        }
        return null;
    }
}
