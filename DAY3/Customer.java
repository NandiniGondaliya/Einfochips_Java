package DAY2;

public class Customer {
    private String name;
    private String address;
    private String mobile;

    Customer(String name,String address,String mobile)
    {
        this.name=name;
        this.address=address;
        this.mobile=mobile;
    }
    public void display()
    {
    System.out.println("Name:"+name);
    System.out.println("Address:"+address);
    System.out.println("Phone:"+mobile);
    }
    

    
}

