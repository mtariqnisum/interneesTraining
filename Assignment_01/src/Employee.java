abstract class Person{
    private String name;
    private final int acc_Number;
    private final int identity_Number;


    public Person(String name,int acc_Number,int identity_Number){
      this.name = name;
      this.acc_Number = acc_Number;
      this.identity_Number = identity_Number;
    }
    // Declaring abstract method
    public abstract void walk() ;
    public String getName(){
    return name;
    }

    public int getIdentity_Number(){
        return identity_Number;
    }

}



