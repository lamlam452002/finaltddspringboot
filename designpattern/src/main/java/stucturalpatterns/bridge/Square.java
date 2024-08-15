package stucturalpatterns.bridge;

public class Square extends Shape{

    @Override
    public void getColor() {
        System.out.println("Hinh vuong co mau: "+ this.color.getColor());
    }
}
