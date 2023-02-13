package DAY2;

class Employees {
    String name;
    String address;
    String mobile;

    Employees(String name,String address,String mobile)
    {
        this.name=name;
        this.address=address;
        this.mobile=mobile;
    }
    public void display()
    {
    System.out.println("Employee Details:");
    System.out.println("Name:"+name);
    System.out.println("Address:"+address);
    System.out.println("Phone:"+mobile);
    
    }
}
