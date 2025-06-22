import java.util.Scanner;

public class MathFunction {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("try to guess the number");
        int chance = 5;
        double numberDeci = Math.random() *100;
        int number = (int)Math.ceil(numberDeci);
        while (chance > 0){
            System.out.println("guess the number");
            int guess = s.nextInt();
            if (guess == number ){
                System.err.println("tht correct the number was, "+ number);
                break;
            }
            else{
                chance -= 1;
                System.out.println("tht wrong try again");
            }
            if (chance == 0){
                System.out.println("you lost");
                break;
            }


        }

    }


}