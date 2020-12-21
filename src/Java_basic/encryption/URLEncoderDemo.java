package Java_basic.encryption;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class URLEncoderDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String encoded= URLEncoder.encode("中文!", String.valueOf(StandardCharsets.UTF_8));
        System.out.println(encoded);//%E4%B8%AD%E6%96%87%21

        String decoded= URLDecoder.decode("%E4%B8%AD%E6%96%87%21", String.valueOf(StandardCharsets.UTF_8));
        System.out.println(decoded);

    }
}
