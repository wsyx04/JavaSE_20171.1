package java2017.kaoshi;

/**
 * Created by whb on
 * 2017/4/8 14:13
 */

//有工人,农民,教师,科学家,服务生,
// 其中,工人,农民,服务生只有基本工资.
// 教师除基本工资外,还有课酬(元/天),
// 科学家除基本工资外,还有年终奖,
// 请你写出相关类,并编写测试类将各种类型的员工的全年工资打印出来。
public class S4 {
    private String name;
    private int pay;

    public S4(String name, int pay) {
        this.name = name;
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }


}

class Scientist extends S4 {
    private int endPay;

    public Scientist(String name, int pay, int endPay) {
        super(name, pay);
        this.endPay = endPay;
    }

    public Scientist(String name, int pay) {
        super(name, pay);

    }

    public int getEndPay() {
        return endPay;
    }

    public void setEndPay(int endPay) {
        this.endPay = endPay;
    }
}

class Teacher extends S4 {
    private int dayPay;

    public Teacher(String name, int pay, int dayPay) {
        super(name, pay);
        this.dayPay = dayPay;
    }

    public int getDayPay() {
        return dayPay;
    }

    public void setDayPay(int dayPay) {
        this.dayPay = dayPay;
    }

    public Teacher(String name, int pay) {
        super(name, pay);
    }
}

class Worker extends S4 {

    public Worker(String name, int pay) {
        super(name, pay);
    }
}

class Waiter extends S4 {

    public Waiter(String name, int pay) {
        super(name, pay);
    }
}

class Farmer extends S4 {

    public Farmer(String name, int pay) {
        super(name, pay);
    }
}

class Ceshi {
    public static void main(String[] args) {
        Scientist scientist = new Scientist("科学家", 50000, 100000);
        Teacher teacher = new Teacher("老师", 10000, 100);
        Worker worker = new Worker("工人", 5000);
        Waiter waiter = new Waiter("服务生", 3000);
        Farmer farmer = new Farmer("农民", 2000);
        new Ceshi().Scientist(scientist);
        new Ceshi().Teacher(teacher);
        new Ceshi().Worker(worker);
        new Ceshi().Waiter(waiter);
        new Ceshi().Farmer(farmer);


    }

    public void Scientist(Scientist scientist) {
        System.out.println(scientist.getName() + "一年的工资是:" + (scientist.getPay() * 12 + scientist.getEndPay()));
    }

    public void Teacher(Teacher teacher) {
        System.out.println(teacher.getName() + "一年的工资是：" + (teacher.getDayPay() * 365 + teacher.getPay() * 12));
    }

    public void Worker(Worker worker) {
        System.out.println(worker.getName() + "一年的工资是：" + (worker.getPay() * 12));
    }

    public void Waiter(Waiter waiter) {
        System.out.println(waiter.getName() + "一年的工资是：" + (waiter.getPay() * 12));
    }

    public void Farmer(Farmer farmer) {
        System.out.println(farmer.getName() + "一年的工资是：" + (farmer.getPay() * 12));
    }
}