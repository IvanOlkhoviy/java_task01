public class Main {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++ ){
            if (check(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean check(int number) {
        int countDivider = 0;

        for (int i= 1; i <= number; i++){
            if (number % i == 0){
                countDivider++;
            }
            if (countDivider > 2  ){
                return false;
            }
        }
        return true;
    }

}
