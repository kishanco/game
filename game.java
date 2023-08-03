import java.util.*;
import java.util.Random;
public class geme {
    public static void main(String [] args)
    {
        System.out.println("HELLO USER WELCOME TO MY STONE \",PAPER AND SCISSORS GAME \n enter 0 to 2 number between");

        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();
        Random r=new Random();
        int NUMBER=r.nextInt(2);
        System.out.println(NUMBER);

        switch(number)
        {
            case 0:
            System.out.println("rock");
            break;
            case 1:
            System.out.println("paper");
            break;
            case 2:
            System.out.println(" scissors");
            break;

        }

        if(number==NUMBER)
        {
            System.out.println("you won");
        }
        else 
        {
            System.out.println("you loss");
        }


    }
}
