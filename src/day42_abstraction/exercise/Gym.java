package day42_abstraction.exercise;

public class Gym {
    public static void main(String[] args) {
     //   Exercise obj = new Exercise() { noy valid because Excercise is abstract- cannot create objects from it


        Running run = new Running();
        run.perform();
        run.getCaloriesBurned(30);
// Lifting obj = new Lifting(); Lifting is abstarct - we cannont create an object of this class

        Bench benching = new Bench();
        benching.perform();
        benching.getCaloriesBurned(20);
        benching.rackWeights();
            }


}
