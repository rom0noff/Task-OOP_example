package uz.beproedu.mode2;

public class Account {
    private double hisobRaqam;
    private String firstName;
    private double balanc;

    public double getHisobRaqam() {
        return hisobRaqam;
    }

    public void setHisobRaqam(double hisobRaqam) {
        this.hisobRaqam = hisobRaqam;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getBalanc() {
        return balanc;
    }

    public void setBalanc(double balanc) {
        this.balanc = balanc;
    }

    @Override
    public String toString() {
        return "Account{" +
                "hisobRaqam=" + hisobRaqam +
                ", firstName='" + firstName + '\'' +
                ", balanc=" + balanc + " $" +
                '}';
    }
}
