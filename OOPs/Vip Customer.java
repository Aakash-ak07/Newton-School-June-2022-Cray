// Create a new class VipCustomer
// it should have 3 fields name, creditLimit(double), and email address, there default value is as {name:"XYZ", creditLimit:"10", email:"xyz@abc. com"} respectively means ordering of parameter should be same.
// E.g constructor(name,creditLimit,email);
// 1st constructor empty should call the constructor with 3 parameters with default values
// 2nd constructor should pass on the 2 values it receives as name and creditLimit respectively and, add a default value for the 3rd
// 3rd constructor should save all fields.
// create getters only for this name getName, getCreditLimit and getEmail and confirm it works.  Note: each methods and variables should of public type.

class VipCustomer{
    public String name;
    public double creditLimit;
    public String email;

    public VipCustomer()
    {
        name = "XYZ";
        creditLimit = 10;
        email = "xyz@abc.com";
    }
    public VipCustomer(String name, double creditLimit)
    {
        this(name, creditLimit, "xyz@abc.com");
    }   
    public VipCustomer(String name, double creditLimit, String email)
    {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName()
    {
        return name;
    } 
    public double getCreditLimit()
    {
        return creditLimit;
    }
    public String getEmail()
    {
        return email;
    }
}
