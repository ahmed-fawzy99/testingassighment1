import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class lab1Q2AssMain {


    public static boolean static_eqChecker(int nOfForces, float[] f1, float[] f2, float[] f3) {

        if(nOfForces > 100){
            return false;
        }

        for (int i = 0; i < nOfForces; i++) {
            if (f1[i] <= -100 || f1[i] >= 100){return false;}
            if (f2[i] <= -100 || f2[i] >= 100){return false;}
            if (f3[i] <= -100 || f3[i] >= 100){return false;}
        }

        Boolean x_eq = false;
        Boolean y_eq = false;
        Boolean z_eq = false;

        float xAxisSum = f1[0] + f2[0] + f3[0];
        float yAxisSum = f1[1] + f2[1] + f3[1];
        float zAxisSum = f1[2] + f2[2] + f3[2];

        if (xAxisSum == 0) {
            x_eq = true;
        }
        if (yAxisSum == 0) {
            y_eq = true;
        }
        if (zAxisSum == 0) {
            z_eq = true;
        }

        return x_eq && y_eq && z_eq;

    }

    public static float arraySum(float[] array) {
        float sum = 0;
        for (int i  = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    /*
    * dynamic_eqChecker() is exactly the same as the static one, but the input from the user here is dynamic.
    * I made static_eqChecker only so that I can pass test cases to it in Junit, but if I'm going to use this functionlity,
    * I will use the dynamic one. I don't know how to use junit with dynamic input from user so that's why it's like this.
    * */
    public static boolean dynamic_eqChecker() {

        System.out.println("please enter # forces");
        Scanner sc= new Scanner(System.in);
        int nOfForces = sc.nextInt();
        float[] x_axis = new float[nOfForces];
        float[] y_axis = new float[nOfForces];
        float[] z_axis = new float[nOfForces];
        System.out.println("please enter the x, y, and z coordinates accordingly");
        for (int i = 0; i < nOfForces; i++) {
            System.out.println("Force " + (i+1) + ":");
            x_axis[i] = sc.nextInt();
            y_axis[i] = sc.nextInt();
            z_axis[i] = sc.nextInt();
        }

        Boolean x_eq = false;
        Boolean y_eq = false;
        Boolean z_eq = false;

        if (arraySum(x_axis) == 0) {
            x_eq = true;
        }
        if (arraySum(y_axis) == 0) {
            y_eq = true;
        }
        if (arraySum(z_axis) == 0) {
            z_eq = true;
        }
        System.out.println(x_eq);
        System.out.println(y_eq);
        System.out.println(z_eq);

        return x_eq && y_eq && z_eq;
    }

    public static void printRes(boolean x){
        if (x){
            System.out.println("YES");
        } else {
        System.out.println("NO");
    }
    }

    // Main to test dynamic_eqChecker the old way -- no Junit.
     public static void main(String []args){
         Boolean x = static_eqChecker(3, new float[]{3, -1, 7},new float[]{-5, 2, -4},new float[]{2, -1, -3});
         printRes(x); // SHOULD BE YES
         x = static_eqChecker(3, new float[]{4, 1, 7},new float[]{-2, 4, -1},new float[]{1, -5, -3});
         printRes(x); // SHOULD BE NO
     }




}
