/*-----------------------------PROBLEM--------------------------------------
Write a program to print the names of students by creating a Student class. 
If no name is passed while creating an object of Student class, 
then the name should be "Unknown", otherwise the name should be equal 
to the String value passed while creating object of Student class.
*/

//SOLOUTION

class Student {
    // Unknown Name
    public Student(){
        name = "Unknown";
    }

    // Student Name
    String name;
    public Student(String studentName){
        name = studentName;
    }
    
    public static void main(String[] args) {
        Student sharjeel = new Student("Sharjeel");
        Student unknown = new Student();

        System.out.println("Student Name: " + sharjeel.name);
        System.out.println("Student Name: " + unknown.name);

    }

}