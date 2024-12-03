class Student{
    public static int lenght;
        String name;
        int marks;
        int age;
    }
    
    public class arrayOfObjects {
        public static void main(String[] args) {
            
            Student s1 = new Student();
            s1.name = "John";
            s1.marks = 90;
            s1.age = 20;

            Student s2 = new Student();
            s2.name = "Alice";
            s2.marks = 85;
            s2.age = 22;
    
            Student s3 = new Student();
            s3.name = "Bob";
            s3.marks=100;
            s3.age = 21;
    
            Student students[] = new Student[3];
            students[0] = s1;
            students[1] = s2;
            students[2] = s3;
    
        //     for(int i=0;i<students.length;i++){
        //     System.out.println(students[i].name + " : " + students[i].marks);
        // }

        //Enhanced FOR loop
        for(Student stud : students){
            System.out.println(stud.name + " :"+stud.marks + " :" + stud.age);
        }

    }
}
