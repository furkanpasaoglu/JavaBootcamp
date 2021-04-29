public class Instructor extends User{
    private String courseName;
    private double price;

    public Instructor() {
    }

    public Instructor(int id, String firstName, String lastName, String courseName, double price) {
        super(id, firstName, lastName);
        this.courseName = courseName;
        this.price = price;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
