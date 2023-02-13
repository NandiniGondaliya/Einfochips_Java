//import java.util.*;
import java.util.ArrayList;


class DemoCollection {
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<Integer>();
        // ArrayList al=new ArrayList();
        al.add(12);
        al.add(78);
        // al.add(true);
        // al.add("nandini");
        // al.add(12.44);
        //al.add(new Employee("Arjun","Ahmedabad"));
        System.out.println(al);
        al.add(62);
        al.add(838);
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
        for(int i:al)
        {
            System.out.println(i);
        }
        ArrayList<Employee>al1=new ArrayList<Employee>();
        al1.add(new Employee("hello", "Anand","123"));
        System.out.println(al1);
        for(Employee e1:al1)
        {
            System.out.println(e1.getName()+" "+e1.getLocation()+" "+e1.getId());
        }
    }
}
