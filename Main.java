package com.company;

import java.util.Scanner;

class WuwException extends Exception{
    private double y;
    
    public double getz() {
        return y;
    }
    public WuwException(String massage, double z){
        super(massage);
        this.y = z;
    }
    class Wuw{
        public static double getWuw(double x, double z) throws WuwException{
            double result = 0;
            if (z == -1) throw new WuwException ("ошибка", z);

            result = (x + z)/(z + 1);
            return result;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = in.nextDouble();
        System.out.print("Введите y: ");
        double y = in.nextDouble();
        try {
            double result = WuwException.Wuw.getWuw(x, y);
            System.out.println(result);
        }
        catch (WuwException ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getz());
        }
    }
}