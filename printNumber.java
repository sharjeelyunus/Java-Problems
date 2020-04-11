/*-----------------------------PROBLEM--------------------------------------
Write a program to print the names of students by creating a Student class. 
If no name is passed while creating an object of Student class, 
then the name should be "Unknown", otherwise the name should be equal to the 
String value passed while creating object of Student class.
*/

//SOLOUTION

public class printNumber {

    public static void printn(int x){
        System.out.println("int: " + x);
    }

    public static void printn(float x){
        System.out.println("float: " + x);
    }

    public static void printn(double x){
        System.out.println("double: " + x);
    }

    public static void printn(long x){
        System.out.println("long: " + x);
    }

    public static void main(String[] args){
        printn(5);
        printn(8.23);
        printn(2.14563d);
        printn(2564345323L);
    }
}