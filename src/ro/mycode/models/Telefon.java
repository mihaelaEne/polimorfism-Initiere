package ro.mycode.models;

public class Telefon extends Produs {
    private String model;
    private String culoare;
    private int pret;

    public Telefon(String type, int id, String model, String culoare, int pret) {
        super(type, id);
        this.model = model;
        this.culoare = culoare;
        this.pret = pret;
    }

    public Telefon(String model, String culoare, int pret) {
        this.model = model;
        this.culoare = culoare;
        this.pret = pret;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public String descriereTelefon(){
        String text="";
        text+="Eu sunt un telefon cu urmatoarele caracteristici:"+"\n";
        text+="type: "+super.getType()+"\n";
        text+="id: " +super.getId()+"\n";
        text+="model: "+this.model+"\n";
        text+="culoare: "+this.culoare+"\n";
        text+="pret"+this.pret;
        return text;
    }

    public Telefon(String prop){
        String [] split=prop.split(",");
        this.model=split[2];
        this.culoare=split[3];
        this.pret = Integer.parseInt(split[4]);
    }

    public String toSaveTelefon(){
        return super.toSaveProdus()+","+model+","+culoare+","+pret;
    }
    public void test(){
        System.out.println("Eu sunt test din telefon");
    }
}
