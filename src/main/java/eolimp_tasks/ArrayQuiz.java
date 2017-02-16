package eolimp_tasks;

public class ArrayQuiz {

    public static void main(String[] args) {
        int nub[] = new int[3];
        int nub2[] = {1, 2, 3, 4, 5};
        nub = nub2;
        for (int x : nub) {
            System.out.println(x);
        }
    }

}
