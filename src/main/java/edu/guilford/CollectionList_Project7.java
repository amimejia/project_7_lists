package edu.guilford;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;


public class CollectionList_Project7 
{
    public static void main( String[] args )
    {
       //declare a constant for the number of elements in the list and set it equal to 1000
        final int num = 1000;

        //Declare and instantiate an ArrayList for objects of your class
        ArrayList<Socialist> socialistArray = new ArrayList<>();

        //Use a loop to add the specified number of randomly generated objects to the list
        long startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            socialistArray.add(new Socialist());
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Array: Time to add " + num + " objects to the list: " + duration + " nanoseconds");
        
        //Sort the list using Collections.sort
        startTime = System.nanoTime();
        Collections.sort(socialistArray);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Array: Time to Collections.sort the list: " + duration + " nanoseconds");

        //Shuffle the list using Collections.shuffle
        startTime = System.nanoTime();
        Collections.shuffle(socialistArray);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Array: Time to Collections.shuffle the list: " + duration + " nanoseconds");

        //Use a loop to get a random element from the list 1,000,000 times
        int num_onemillion = 1000000;
        startTime = System.nanoTime();
        Random randDriver = new Random();
        for (int i = 0; i <num_onemillion; i++){
            int randomList = randDriver.nextInt(num);
            Socialist randomPiece = socialistArray.get(randomList);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Array: Time to get a random element from the list 1,000,000 times: " + duration + " nanoseconds");

        //Use a loop to get each element from the loop sequentially
        //Get the first element, then the second, then the third, etc.

        startTime = System.nanoTime();
        for(int i = 0; i < socialistArray.size(); i++) {
            Socialist socialistArray_2 = socialistArray.get(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Array: Time to get each element from the loop sequentially: " + duration + " nanoseconds");

        //Repeating using LinkedList

        LinkedList<Socialist> socialistLink = new LinkedList<>();
        //Use a loop to add the specified number of randomly generated objects to the list
        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            socialistLink.add(new Socialist());
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList: Time to add " + num + " objects to the list: " + duration + " nanoseconds");

        //Sort the list using Collections.sort
        startTime = System.nanoTime();
        Collections.sort(socialistLink);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("LinkedList: Time to Collections.sort the list: " + duration + " nanoseconds");

        //Shuffle the list using Collections.shuffle
        startTime = System.nanoTime();
        Collections.shuffle(socialistLink);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("LinkedList: Time to Collections.shuffle the list: " + duration + " nanoseconds");

        
        //Use a loop to get a random element from the list 1,000,000 times
        startTime = System.nanoTime();
        for (int i = 0; i <num_onemillion; i++){
            int randomList = randDriver.nextInt(num);
            Socialist randomPiece = socialistLink.get(randomList);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("LinkedList: Time to get a random element from the list 1,000,000 times: " + duration + " nanoseconds");
        
        //Use a loop to get each element from the loop sequentially
        //Get the first element, then the second, then the third, etc.
        startTime = System.nanoTime();
        for(int i = 0; i < socialistLink.size(); i++) {
            Socialist socialistLink_2 = socialistLink.get(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("LinkedList: Time to get each element from the loop sequentially: " + duration + " nanoseconds");


        
       

    }
}
