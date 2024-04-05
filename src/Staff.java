public class Staff extends Person{
    private Double salary;
    private String shift;

    public Staff() {
    }

    public Staff(Integer dni, String name, String surname, String email, String address, Double salary, String shift) {
        super(dni, name, surname, email, address);
        this.salary = salary;
        this.shift = shift;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public Double anualSalary(){
        return this.salary*12;
    }


}
