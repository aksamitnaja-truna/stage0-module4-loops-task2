package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0;
//        byte increment = multiplyByAndToInclusive / java.lang.Math.abs(multiplyByAndToInclusive)''
        while (counter < java.lang.Math.abs(multiplyByAndToInclusive)) {
            System.out.println(counter * multiplyByAndToInclusive);
            ++counter;
        }
        if (counter != 0)
            System.out.println(counter * multiplyByAndToInclusive);

    }
}
