

// class Pen{
//     String color;
//     String type;

//     public void write(){
//         System.out.println("writing something");
//     }

//     public void print(){
//         System.out.println(this.color);
//         System.out.println(this.type);
//     }
// }


class Student{
    String name;
    int age;
    String  gender;
    String address;

    public void printInfo(){
        System.out.println("Student name is" + this.name + ", age is " + this.age + " " + "Gender is " + this.gender + "  " +"and address " + this.address);
    }

    //constructor
    Student(String name ,int age, String gender, String address){
        this.name = name;
        this.age = age;
        this.gender= gender;
        this.address = address;
        
    }
}



public class OOPS {
  public static void main(String[] args) {
    // Pen pen1 = new Pen();
    // pen1.color = "red";
    // pen1.type = "jel";
    // pen1.write();

    // Pen pen2 = new Pen();
    // pen2.color = "blue";
    // pen2.type = "ball";
    // pen2.print();

    Student student1 = new Student("Shubham Sing", 24 , "Male", "Noida Uttar Pradesh") ;
    // student1.name = "Shubham Singh";
    // student1.age = 20;
    // student1.gender = "Male";
    // student1.address = "Noida UP";

    student1.printInfo();
  }
}
