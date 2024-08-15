package stucturalpatterns.bridge;

public class Circle extends Shape{
    @Override
    public void getColor() {
        System.out.println("Hinh tron co mau: "+ this.color.getColor());
    }
}
