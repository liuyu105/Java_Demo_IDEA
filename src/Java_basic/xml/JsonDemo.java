package Java_basic.xml;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileInputStream;

public class JsonDemo {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        // 反序列化时忽略不存在的JavaBean属性:
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Book book = mapper.readValue(new FileInputStream(new File("src\\Java_basic\\xml\\book.xml")), Book.class);
        //把JavaBean变为JSON，那就是序列化
        String json = mapper.writeValueAsString(book);
        System.out.println(json);

    }
}
