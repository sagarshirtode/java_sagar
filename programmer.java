class Employee {
    float salary  = 40000;
}
class Animal{
    void eat(){
        System.out.println("eatting");
    }
}

class Programmer extends Employee{
    int bonus=1000;
    public static void main(String[] args) {
        Programmer p =new Programmer();
        Animal e = new Animal();
        e.eat();
        // System.out.println("Eatting:" +e);
        // System.out.println("Bonus:" +p.bonus);
        // System.out.print("Salary:" +p.salary);

        char[] ch = {'s','a','g','a','r'};
        System.out.print("ch:" +ch[0]);
        String s = new String(ch);
        String name = "sagar";
        System.out.println("s:" +s);
        System.out.println("name:" +name);
    }
}