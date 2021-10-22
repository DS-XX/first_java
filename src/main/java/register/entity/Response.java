package register.entity;
public class Response {
    private String msg;
    private int code;
    private Boolean isSuc = false;
    private User data ;
    public Response(){}
    public Response(String msg,int code,Boolean isSuc,User data){
        this.msg = msg;
        this.code = code;
        this.isSuc = isSuc;
        this.data = data;
    }
    public Boolean getIsSuc() {
        return isSuc;
    }
    public void setIsSuc(Boolean isSuc) {
        this.isSuc = isSuc;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public User getData(){
        return this.data;
    }
}
