public class Student extends Person{
    private Integer entryDate;
    private Double quota;
    private String degree;

    public Student() {
    }

    public Student(Integer dni, String name, String surname, String email, String address, Integer entryDate, Double quota, String degree) {
        super(dni, name, surname, email, address);
        this.entryDate = entryDate;
        this.quota = quota;
        this.degree = degree;
    }

    public Integer getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Integer entryDate) {
        this.entryDate = entryDate;
    }

    public Double getQuota() {
        return quota;
    }

    public void setQuota(Double quota) {
        this.quota = quota;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }


}
