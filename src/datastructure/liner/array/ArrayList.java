package datastructure.liner.array;

/**
 * 顺序表
 * 底层采用数组，长度可以动态变化
 * <p>
 * java.util.ArrayList每次增加50%
 */
public class ArrayList implements List {
    private Object[] elementData; //数据是数组，目前还没确定长度
    private int size; //元素的个数

    public ArrayList() {
        //没有指定长度，默认长度是4
        this(4);
//        //没有指定长度，默认长度是0
//        elementData=new Object[]{};
    }

    /**
     * @param initialCapacity 指定数组的初始长度
     */
    public ArrayList(int initialCapacity) {
        //给数组分配指定数量的空间
        elementData = new Object[initialCapacity];
        //指定顺序表的元素个数
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int i) {
        if (i < 0 || i > size - 1) {
            //throw new RuntimeException("数组索引越界异常："+i);
            throw new MyArrayIndexOutOfBoundsException("数组索引越界异常：" + i);
        }
        return elementData[i];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object e) {
        int i;
        for (i = 0; i < size; i++) {
            //必须要用equals
            if (e.equals(elementData[i])) break;
        }
        if (i < size) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int indexOf(Object e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elementData[i])) return i;
        }
        return -1;
    }

    @Override
    public void add(int i, Object e) {
        if (i < 0 || i > size) {
            throw new MyArrayIndexOutOfBoundsException("数组索引越界异常：" + i);
        }
        //如果数组满，要扩容
        if (size == elementData.length) {
            grow();
        }
        //后移元素，从最后一个元素开始
        for (int j = size; j > i; j--) {
            elementData[j] = elementData[j - 1];
        }
        //数组赋值
        elementData[i] = e;
        size++;
    }

    @Override
    //将数据元素e插入到线性表末尾
    public void add(Object e) {
        //如果数组满，要扩容
        if (size == elementData.length) {
            grow();
        }
        //数组赋值
        elementData[size] = e;
        size++;
    }

    @Override
    public void addAfter(int i, Object e) {
        if (size == elementData.length) {
            grow();
        }
        for (int j = size; j > i + 1; j--) {
            elementData[j] = elementData[j - 1];
        }
        elementData[i + 1] = e;
        size++;
    }

    //扩容
    public void grow() {
        //新建一个数组，长度是旧数组2倍
        Object[] newArr = new Object[size * 2];
        //将旧数组的数据拷贝到新数组
        for (int i = 0; i < size; i++) {
            newArr[i] = elementData[i];
        }
        //让elementData指向新数组
        elementData = newArr;
        //elementData = Arrays.copyOf(elementData, elementData.length * 2);
    }


    @Override
    public Object remove(int i) {
        if (i < 0 || i > size) {
            throw new MyArrayIndexOutOfBoundsException("数组越界异常：" + i);
        }
        for (int j = i; j < size - 1; j++) {
            elementData[j] = elementData[j + 1];
        }
        size--;
        return elementData[i];
    }

    @Override
    public boolean remove(Object e) {
        int oldSize = size;
        for (int j = 0; j < size; j++) {
            if (e.equals(elementData[j])) {
                remove(j--);
            }
        }
        if (oldSize > size) {
            return true;
        } else return false;
    }

    @Override
    public Object replace(int i, Object e) {
        elementData[i]=e;
        return e;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                builder.append(elementData[i] + ",");
            } else {
                builder.append(elementData[i]);
            }

        }
        builder.append("]");
        return builder.toString();
    }
}
