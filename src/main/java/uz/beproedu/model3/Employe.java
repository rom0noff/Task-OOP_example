package uz.beproedu.model3;

public class Employe {
    private double insp;
    private String name;
    private String lastName;
    private double salary;

    public double getInsp() {
        return insp;
    }

    public void setInsp(double insp) {
        this.insp = insp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "insp=" + insp +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
