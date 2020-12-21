package design_pattern.decorator_pattern;

//创建实现接口Shape的实体类Rectangle
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
