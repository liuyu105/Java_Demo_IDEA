package Java_basic.encryption;

import java.util.Arrays;
import java.util.Base64;

public class Base64Demo {
    public static void main(String[] args) {
        //Base64编码
        byte[] input = new byte[]{(byte) 0xe4, (byte) 0xb8, (byte) 0xad};
        String b64encoded = Base64.getEncoder().encodeToString(input);
        System.out.println(b64encoded); //5Lit

        //Base64解码
        byte[] output = Base64.getDecoder().decode(b64encoded);
        System.out.println(Arrays.toString(output)); //[-28, -72, -83]
    }
}
