package Java_basic.oop;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class PersonDemo {
    public static void main(String[] args) throws IntrospectionException {
        Person ming = new Person();
//        ming.setName("Xiao Ming"); // 设置name
//        ming.setAge(12); // 设置age
        System.out.println(ming.getName() + ", " + ming.getAge());
        BeanInfo info = Introspector.getBeanInfo(Person.class);
        for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
            System.out.println(pd.getName());
            System.out.println("  " + pd.getReadMethod());
            System.out.println("  " + pd.getWriteMethod());
        }
    }
}
