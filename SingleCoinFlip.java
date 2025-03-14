package za.co.wethinkcode.examples.coinflip;
import java.util.Random;

public class SingleCoinFlip {
    public static void main(String[] args) {
        Random RandomObject = new Random();
        int num =  RandomObject.nextInt(2);
        if (num==0) {
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }

    }
}

