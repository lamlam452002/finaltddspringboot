package stucturalpatterns.bridge;

public class Test {
    public static void main(String[] args) {
        Color redColor = new Color("Đỏ");
        Color greenColor = new Color("Xanh");
        Color blackColor = new Color("Đen");

        Square redSquare = new Square();
        redSquare.color = redColor;

        redSquare.getColor();

        Circle blackCircle = new Circle();
        blackCircle.color = blackColor;

        blackCircle.getColor();
    }

}
