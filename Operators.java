package it.itacademy.java.basics;

public class Operators {

    public static void main(String[] args) {

    //Task 7
    //myMethod3(7,2,2);

    myMethod4(110,25,7,1.25f);

    }

    static void myMethod3(int x, int y, int z) {
        if (x == y && x == z){
            System.out.println("Triangle is Equilateral. Sides:" + x + " " + y + " " + z);

        }else if ((x == y || x == z) || (z == y || x == z) || (z == y || y == x)){
            System.out.println("Triangle is Isosceles. Sides:" + x + " " + y + " " + z);
        }else
            System.out.println("Triangle is Scalene. Sides:" + x + " " + y + " " + z );

    }

    static void myMethod4(float distance, float fuel, float fuelUsage, float fuelPrice){

        if(fuel >= fuelUsage && distance >= 100){
            System.out.println("Destination is in " + distance + "km"+ ". Car is able to reach the destination. it will have " + (fuel-fuelUsage) + " of fuel left");
        }else if(fuel < fuelUsage && distance >= 100){
            System.out.println("Destination is in " + distance + " km"+ ". Car is not able to reach the destination. it needs " + (fuelUsage-fuel) + " liter of fuel more. It will cost "+ ((fuelUsage-fuel)*fuelPrice));
        }
    }

}
