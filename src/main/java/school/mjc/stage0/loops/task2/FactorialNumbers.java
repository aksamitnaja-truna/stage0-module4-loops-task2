package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int factorial = 1, i = 0;
        while (i <= printToInclusive){
            if (i == 0){
                System.out.println(factorial);
                i++;
                continue;
            }
            factorial *= i++;
            System.out.println(factorial);
        }
    }
}
