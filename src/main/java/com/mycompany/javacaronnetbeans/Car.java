
package com.mycompany.javacaronnetbeans;


public class Car {
    
   int maxSpeed = 100;   //enteros
   int minSpeed = 0;   // enteros
   boolean onCar = false;  // true or false
   double height = 1.1234567891011; // decimal grande
   char condition = 'Y'; // solo un caracter  
   String nameCar = "CarsName";
    
   public void printVariables(){
       System.out.println("this is  max Speed " +  maxSpeed);
       System.out.println(minSpeed);
       System.out.println(onCar);
       System.out.println(height);
       System.out.println(condition);
       
   }
   
   public void wreckCar(){
       condition = 'C';
   }
   public void upgradeSpeed(){
       minSpeed = maxSpeed;
       maxSpeed = maxSpeed + 1;
       condition = 'G';
   }
    
    public static void main(String[] args){
        
        Car familyCar = new Car();
        System.out.println("Family´s Car: ");
        familyCar.printVariables();
        Car aliceCar = familyCar;
        familyCar.wreckCar();
        System.out.println("Alice´s Car");
        aliceCar.printVariables();
        familyCar.upgradeSpeed();
        familyCar.printVariables();
       
    }
}
