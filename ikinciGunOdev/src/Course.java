public class Course {
    int id;
    String name;
    String description;
    int price;

    public Course(){

    }

    public Course(int id, String name,int price,String description){
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
