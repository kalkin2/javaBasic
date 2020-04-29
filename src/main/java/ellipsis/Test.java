package main.java.ellipsis;

public class Test {


    private  static Integer countEllipsis(int... numberArray) {
        int sumresult = 0;
        for (int i = 0; i < numberArray.length; i++) {
            sumresult += numberArray[i];
        }
        return sumresult;
    }

    public static void main(String[] args) {
        System.out.println("aaa==="+Test.countEllipsis(1,2,3));

    }
}
