package datastructure.liner.stack;

public class MyStack {
    //栈底层使用数组来存储数据
    int[] elements;

    public MyStack() {
        elements = new int[0];
    }

    //压入元素
    public void push(int element) {
        //创建一个新数组
        int[] newArr = new int[elements.length + 1];
        //把原数组中的元素复制到新数组中
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        //把添加的元素放入到数组中
        newArr[elements.length] = element;
        //使用新数组替换旧数组
        elements = newArr;
    }

    //取出栈顶元素
    public int pop() {
        if (elements.length == 0) {
            throw new RuntimeException("stack is empty");
        }
        //取出最后一个元素
        int element = elements[elements.length - 1];
        //创建一个新的数组
        int[] newArr = new int[elements.length - 1];
        //原数组除了最后一个元素，其他元素都放入新数组
        for (int i = 0; i < elements.length - 1; i++) {
            newArr[i] = elements[i];
        }
        //替换数组
        elements = newArr;
        //返回栈顶元素
        return element;

    }

    //查看栈顶元素
    public int peek() {
        return elements[elements.length - 1];
    }

    //判断栈是否为空
    public boolean isEmpty() {
        return elements.length == 0;
    }
}
