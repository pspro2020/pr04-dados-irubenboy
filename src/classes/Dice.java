package classes;

import java.util.Random;

public class Dice{

    private static int[] nums = {1, 2, 3, 4, 5, 6};
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int num5;
    private int num6;

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getNum3() {
        return num3;
    }

    public int getNum4() {
        return num4;
    }

    public int getNum5() {
        return num5;
    }

    public int getNum6() {
        return num6;
    }



    public void throwDice(){
        Random r = new Random();
        int number = r.nextInt(6);

        if(number == 1){
            num1++;
        } else if(number == 2){
            num2++;
        } else if(number == 3){
            num3++;
        } else if(number == 4){
            num4++;
        } else if(number == 5){
            num5++;
        } else if(number == 6){
            num6++;
        }

        System.out.println("Se ha lanzado el número " + number);


    }
}
