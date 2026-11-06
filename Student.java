public class Student {
     private String idno;
     private String name;
     private int age;
     private double cgpa;
    
     private static int numberOfStudents = 0;
     
     public Student() {
     	numberOfStudents++;
     }
     
     public Student(String id) {
     	idno = id;
     	numberOfStudents++;
     }
     
     public Student(String id, String n) {
     	idno = id;
     	name = n;
     	numberOfStudents++;
     }
     
     public Student(String id,String n,int a,double c) {
     	idno = id;
     	name = n;
     	age = a;
     	cgpa = c;
     	numberOfStudents++;
     }
     
     public String getIdno() {
     	return idno;
     }
     
     public void setIdno(String id) {
     	idno = id;
     }
     
     public String getName() {
     	return name;
     }
     
     public void setName(String n) {
     	name = n;
     }
     
     public int getAge() {
     	return age;
     }
     
     public void setAge(int a) {
     	age = a;
     }
     
     public double getCgpa() {
     	return cgpa;
     }
     
     public void setCgpa(double c) {
     	cgpa = c;
     }
     
     public static int getNumberOfStudents() {
     	return numberOfStudents;
     }
     
     public void displayInformation() {
     	System.out.println("Displalying student's information");
     	System.out.println("ID Number = " + idno);
     	System.out.println("Name = " + name);
     	System.out.println("Age = " + age);
     	System.out.println("CGPA = " + cgpa);
     }
     
     public void printGradeReport() {
     	System.out.println("Your CGPA in this semester = " + cgpa);
     }
     
     public static void main(String[] args) {
     	Student s1 = new Student();
     	System.out.println("Number of students = " + Student.numberOfStudents);
     	s1.displayInformation();
     	Student s2 = new Student("bdu0001");
     	s2.displayInformation();
     	System.out.println("Number of students = " + Student.getNumberOfStudents());
        Student s3 = new Student("bdu0002","Abebe",20,3.7);
     	s3.displayInformation();
     	System.out.println("Number of students = " + Student.getNumberOfStudents());
        s3.printGradeReport();
        System.out.println("ID number = " + s3.idno);
        System.out.println("Name = " + s3.getName());
        s3.setName("Kebede");
        System.out.println("Name = " + s3.name);
        System.out.println("Name = " + s3.getName());
     }   
}
