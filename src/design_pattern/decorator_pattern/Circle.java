package design_pattern.decorator_pattern;

//创建实现接口Shape的实体类Circle
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
