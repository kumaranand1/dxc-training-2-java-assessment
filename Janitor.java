package solution;

class Janitor extends Employee {

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

    class Employee {

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