package models;

public abstract class Id {
    protected int id;

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public void print(){
        System.out.println("print content in console");
    }
}
