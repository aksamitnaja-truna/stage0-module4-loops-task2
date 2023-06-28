package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 2;
        byte flag = 1;
        int i;
        while (counter <= printToInclusive){
            i = 2;
            flag = 1;
            while (i < counter) {
                if (counter % i == 0) {
                    flag = 0;
                    break;
                }
                i++;
            }
            if (flag == 1)
                System.out.println(counter);
            counter++;
        }
    }
}
