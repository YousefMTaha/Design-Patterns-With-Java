package singletone;

public class Accountant {
    private String firstName;
    private String lastName;
    private Double salary;

    private static Accountant acc = null;

    private Accountant(String firstName, String lastName, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public static Accountant getInstance(){
        if(acc == null){
            acc = new Accountant("accountant1" , "first",2.4);
        }
        return acc;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void info(){
        System.out.println("Your First name is" + firstName);
        System.out.println("Your Last name is" + lastName);
        System.out.println("Your Salary is" + salary);
    }
}
