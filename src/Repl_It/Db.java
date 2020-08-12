package Repl_It;

public class Db {
    private String data;
    private int yint;

    public void insertData(String data, int yint){
        this.data = data;
        this.yint = yint;
    }

    public String getData(){
        return data;
    }
    public void setData(String Data){
        this.data = Data;
    }

    public int getYint(){
        return yint;
    }
    public void setYint(int Yint){
        this.yint = Yint;
    }

}
class main{
    public static void main(String[] args) {

        Db db = new Db();
        db.insertData("aaa",123);


        System.out.println(db.getData());//aaa
        System.out.println(db.getYint());//123

        db.setData("zzz");
        db.setYint(200);

        System.out.println(db.getData());//zzz
        System.out.println(db.getYint());//200

    }

}
