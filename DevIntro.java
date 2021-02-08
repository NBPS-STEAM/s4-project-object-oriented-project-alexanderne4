

class DevIntro { 
  
    int age, exp; 
    String name; 
    static String category; 
  
    // Static block with category Developer 
    static { category = "Developer"; } 
    
    
    // Default Constructor 
    public DevIntro() 
    { 
        System.out.println("-"  + "\t" + "-" + "\t" + "-" + "\t" + "\t"+ "-"); 
    } 
    
    // Parameterized Constructor with two arguments 
    public DevIntro(int age, String name) 
    { 
        System.out.println(age + "\t" + name + "\t" + category + "\t" + exp); 
    } 
    
    // Parameterized Constructor with three arguments 
    public DevIntro(int age, String name, int exp) 
    { 
         System.out.println("DOB" + "\t" + "     Name" + "\t"+ "    Category"+ "\t" + "Exp"); 
        
        System.out.println(age + "\t" + name + "\t" + category + "\t" + exp); 
    } 
} 