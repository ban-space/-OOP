public class Teacher extends Person {
        String job;
        public static void main(String[] args ){
            Teacher t1= new Teacher();
            t1.name="John";
            t1.age=30;
            t1.job="teacher";

            System.out.println("Name: "+t1.name);
            System.out.println("Age: "+t1.age);
            System.out.println("Job: "+t1.job);
            System.out.println("Info: ");
            t1.displayInfo();
        }
    }

