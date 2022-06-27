class Employee{  // Base/Super/Parent class
    int salary = 900000;
}

class Engineer extends Employee{  // Derived/Sub/Child class
    int bonus = 9000;
    
    public static void main(String[] args){
      
        Engineer engineer = new Engineer(); //engineer is object
      
        System.out.printf("Engineer's salary: %d Tk.\n", engineer.salary);
        System.out.printf("Engineer's bonus: %d Tk.\n", engineer.bonus);
    }
  
}
