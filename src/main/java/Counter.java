
public class Counter {

//    void countDown(int start,int stop) {
//        System.out.println("Enter START number");
//
////        if(start>stop) {
////            System.out.println("Value of Start Number must be smaller than stop number");
////            return;
//        }


//// RECURSION: the process of a function/method calling itself
//
//    //create a method that counts from a start number to a stop number
//
    void countTo(int start, int stop) {


        //check if START value is greater than STOP value, then return an error if so
        if(start>stop) {
            System.out.println("START value must be less than STOP value. Please try again");
            return;
        }
        //print the value of START to the console
        System.out.println(start);

        //add 1 to the value of START
        start++;

       //checks if start value is less or equal than stop
        if (start <= stop) {
            //call the "countTo" function again with new value

            countTo(start, stop);
        }

        //for stopping method and exiting if previous function does not work
        return;
    }

    void countDown(int start, int stop) {

     if (start<stop) {
         System.out.println("Start value must be greater than stop value to countdown. Please try again");
         return;
     }
        System.out.println(start);

        start--;

        if (start>=stop) {
            countDown(start, stop);
        }
        return;
    }


    //Create a method that counts down from start number to a stop number
}
