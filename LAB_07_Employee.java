package LAB_7;

public class LAB_07_Employee {

    public LAB_07_Employee() {
    }

    public int salary ;
    public int num;
    public int getSum () {
        return this.salary * this.num;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
