package ds.demo.entity;

public class User {
    String name;
    String password;
    public String getName(){
        return  name;
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
    public String toString(){
        return "user{name='"+name+"\',"+"password="+password+"}";
    }
}