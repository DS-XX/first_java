package register.entity;

public class User {
    private String name;
    private String password;
    private int phone;
    private int age;
    private String course;
    public User(){}
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public User(String name, String password, int phone){
        this.name= name;
        this.password = password;
        this.phone = phone;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPassword(){
        return  password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public int getPhone(){
        return phone;
    }
    public void setPhone(int phone){
        this.phone= phone;
    }
}
