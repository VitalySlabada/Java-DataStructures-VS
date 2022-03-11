public class Factorial {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(20));
    }


    static public long calculateFactorial (int num){
        if (num==1) return 1;
        return num * calculateFactorial(num-1);
    }



}
