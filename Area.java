/*-----------------------------PROBLEM--------------------------------------
Create a class to print the area of a square and a rectangle. 
The class has two methods with the same name but different number of parameters. 
The method for printing area of rectangle has two parameters 
which are length and breadth respetively while the other method for printing 
area of square has one parameter which is side of square.
*/

//SOLOUTION

public class Area {
    //for rectangle area = length x width
    public static void printArea(int x, int y){
        System.out.println("Rectangle Area: " + x*y);
    }

    //for square area = side x side
    public static void printArea(int x){
        System.out.println("Square Area: " + x*x);
    }

    public static void main(String[] args) {
        printArea(6,4);
        printArea(4);
    }
}
