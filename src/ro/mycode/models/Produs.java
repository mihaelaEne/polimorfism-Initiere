package ro.mycode.models;

public class Produs {

    private String type;
    private int id;

    public Produs(String type, int id) {
        this.type = type;
        this.id = id;
    }
    public Produs(){}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String descriereProdus(){
        String text="";
        text+="Acesta este un produs cu urmatoarele caracteristici:"+"\n";
        text+="type: "+this.type+"\n";
        text+="id: "+this.id;
        return text;
    }

    public Produs(String prop){
        String [] split=prop.split(",");
        this.type=split[0];
        this.id=Integer.parseInt(split[1]);
    }

    public String toSaveProdus(){
        return type+","+id;
    }


    public void test(){
        System.out.println("eu sunt test din produs");
    }
}
