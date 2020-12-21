package datastructure.liner.array;

/**
 * 自定义异常
 */
public class MyArrayIndexOutOfBoundsException extends RuntimeException {
    public MyArrayIndexOutOfBoundsException() {
    }

    public MyArrayIndexOutOfBoundsException(String message) {
        super(message);
    }
}
