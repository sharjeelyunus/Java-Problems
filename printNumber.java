/*-----------------------------PROBLEM--------------------------------------
Create a class named 'PrintNumber' to print various numbers of different 
datatypes by creating different methods with the same name 'printn' having 
a parameter for each datatype.
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