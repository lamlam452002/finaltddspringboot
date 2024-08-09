package stucturalpatterns.decorator;

public class TomatoPizza implements IPizza{

    @Override
    public String doPizza() {
        return "I am a Tomato pizza";
    }
}
