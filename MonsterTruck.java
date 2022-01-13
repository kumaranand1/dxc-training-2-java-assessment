public class MonsterTruck extends Truck {
    public void m1() {
        System.out.println("monster1");

    }

    public void m2() {
        super.m1();
        super.m2();
    }

    public String toString() {
        return "monster" + super.toString();
    }

    public static void main(String[] args) {
        Monstertruck mt = new MonsterTruck();
        mt.m1();
        mt.m2();
        System.out.printlm(mt);
    }
}
