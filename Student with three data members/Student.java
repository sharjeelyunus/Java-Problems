/**
 * Author Sharjeel Yunus
 */
/*-----------------------------PROBLEM--------------------------------------
Create a class 'Student' with three data members which are name, age and address. 
The constructor of the class assigns default values name as "unknown", age as '0' 
and address as "not available". It has two members with the same name 'setInfo'. 
First method has two parameters for name and age and assigns the same whereas 
the second method takes has three parameters which are assigned to name, age and 
address respectively. Print the name, age and address of 10 students.
Hint - Use array of objects

*/

//SOLOUTION

class Student{
    public String name;
    public int age;
    public String address;

    public Student(){
        name = "Unknown";
        age = 0;
        address = "Not Available";
    }

    public String setInfo(String n, int ag){
        this.name = n;
        this.age = ag;

        return "name: " + name + "    age: " + age;
    }

    public String setInfo(String n, int ag, String ad){
        this.name = n;
        this.age = ag;
        this.address = ad;

        return "Name: " + name + "   Age: " + age + "    Address: " + address; 
    }

    public static void main(String[] args) {
        Student[] std = new Student[10];
        for( int i = 0; i < std.length; i++){
            std[i] = new Student();
        }
        // we are not providing the values of std[0] so, default values will be printed.
        std[1].name = "Sharjeel";
        std[1].age = 18;
        std[1].address = "Jalalpur Pirwala, Pakistan";

        std[2].name = "Aadil";
        std[2].age = 21;
        //also as we are not providing value of address for student at index 2 
        //so default value of address will be printed.

        std[3].name = "Arbaz";
        std[3].age = 20;
        std[3].address = "Pluto";

        std[4].name = "Muzamil";
        std[4].age = 19;
        std[4].address = "Mars";

        std[5].name = "Ali";
        std[5].age = 21;
        std[5].address = "Venus";

        std[6].name = "Hamza";
        std[6].age = 22;
        std[6].address = "Mercury";

        std[7].name = "Noni";
        std[7].age = 19;
        std[7].address = "Earth";

        std[8].name = "Batsy";
        std[8].age = 17;
        std[8].address = "Andromeda";

        std[9].name = "Khani";
        std[9].age = 20;
        std[9].address = "Jail Road";

        String nam;
        int ag;
        String adr;
            for (int i = 0; i < std.length; i++)
            {
                nam = std[i].name;
                ag = std[i].age;
                adr = std[i].address;
                System.out.println("The info of student " + (i+1) + " is: " + std[i].setInfo(nam, ag, adr));
            }
    }
    
}