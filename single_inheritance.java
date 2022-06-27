class Employee{  // Base/Super/Parent class
    int salary = 900000;
}

class Engineer extends Employee{  // Derived/Sub/Child class
    int incrementRate = 9000;
    
    public static void main(String[] args){
      
        Engineer engineer = new Engineer(); 
      
        System.out.printf("Engineer's salary: %d Tk.\n", engineer.salary);
        System.out.printf("Engineer's increment rate: %d Tk.\n", engineer.incrementRate);
    }
  
}
