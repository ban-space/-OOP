public class Dog extends AnimalPolymorphism{
    @Override
    public void speak(){
        System.out.println("Dog is barking");
    }
    public static void main(String[] args){
        Dog a1 = new Dog();
        a1.speak();
    }
}