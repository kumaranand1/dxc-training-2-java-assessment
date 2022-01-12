# Java Assessment Question 1

Suppose that the following two classes have been declared: 

public class MonsterTruck extends Truck
{
    public void m1(){
        System.out.println("monster1");
    
    }
    public void m2()
    {
        super.m1();
        super.m2();
    }
    public String toString()
    {
        return "monster" + super.toString();
    }
    public static void main(String[] args)
    {
        Monstertruck mt=new MonsterTruck();
        mt.m1();
        mt.m2();
        System.out.printlm(mt);
    }
}

   

Write a class `MonsterTruck` whose methods have the behavior below. Don't just print/return the output; whenever possible, use inheritance to reuse behavior from the superclass. 

```
    Method              Output

    m1()                monster 1
    m2()                truck1()
                        car1()
    toString()          "monster vroom vroom"
```