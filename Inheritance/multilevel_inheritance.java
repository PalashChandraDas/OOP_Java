class Animal{
    void eat(){
        System.out.println("Eating.");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Barking.....");
    }
}

class BabyDog extends Dog{
    void babyDogSound(){
        System.out.println("Weeping.....");
    }
    
    public static void main(String[] args){
        
        BabyDog babydog = new BabyDog(); //babydog object
        
        babydog.eat();
        babydog.sound();
        babydog.babyDogSound();
    }
}
