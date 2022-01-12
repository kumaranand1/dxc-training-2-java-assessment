# Java Assessment Question 2

Write a class `Janitor` to accompany the other law firm classes. Janitors work twice as many hours per week as other employees (80 hours/week), they make $30,000 ($10,000 less than general employees), they get half as much vacation as other employees (only 5 days), and they have an additional method clean that prints "Workin' for the man." Make sure to interact with the superclass as appropriate. 

```java
// A class to represent employees in general.
public class Janitor extends Employee {
    public int getHours() {
        return 2 * super.getHours();
    }
    
    public double getSalary() {
        return super.getSalary() - 10000;
    }
    
    public int getVacationDays() {
        return super.getVacationDays() / 2;
    }
    
    public void clean() {
        System.out.println("Workin' for the man.");
    }

   public void setHours(int Hours) {
     this.hours = hours;
    }
    
    public void setSalary(int Salary) {
     this.Salary = Salary;
    }
    
    public void setVacationDays(int VacationDays) {
     this.VacationDays = VacationDays;
    }
    

    public class Employee {

        private int baseHours = 40;
        private double baseSalary = 40000.0;
        private int baseVacationDays = 10;
        private String baseVacationForm = "yellow";
        
        public int getHours() {
            return baseHours;                
        }

        public double getSalary() {
            return baseSalary;              
        }

        public int getVacationDays() {
            return baseVacationDays;        
        }

        public String getVacationForm() {
            return baseVacationForm;         
        }
        
        
        public final void setBaseHours(int hours) {
            baseHours = hours;
        }
        public final void setBaseSalary(double salary) {
            baseSalary = salary;
        }
        public final void setBaseVacationDays(int days) {
            baseVacationDays = days;
        }
        public final void setBaseVacationForm(String form) {
            baseVacationForm = form;
        }

        public static void main(String[] args) {
    }
```