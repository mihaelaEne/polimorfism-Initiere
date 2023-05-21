package ro.mycode.models;

public class FaceCare extends Produs{
    private String produs;
    private String detalii;
    private int luniValabilitate;

    public FaceCare(String type, int id, String produs, String detalii, int luniValabilitate) {
        super(type, id);
        this.produs = produs;
        this.detalii = detalii;
        this.luniValabilitate = luniValabilitate;
    }

    public FaceCare(String produs, String detalii, int luniValabilitate) {
        this.produs = produs;
        this.detalii = detalii;
        this.luniValabilitate = luniValabilitate;
    }

    public String getProdus() {
        return produs;
    }

    public void setProdus(String produs) {
        this.produs = produs;
    }

    public String getDetalii() {
        return detalii;
    }

    public void setDetalii(String detalii) {
        this.detalii = detalii;
    }

    public int getLuniValabilitate() {
        return luniValabilitate;
    }

    public void setLuniValabilitate(int luniValabilitate) {
        this.luniValabilitate = luniValabilitate;
    }

    public String descriereFaceCare(){
        String text="";
        text+="Eu sunt un produs de faceCare cu urmatoarele caracteristici:"+"\n";
        text+="type: "+super.getType()+"\n";
        text+="id: " +super.getId()+"\n";
        text+="model produs: "+this.produs+"\n";
        text+="detalii produs: "+this.detalii+"\n";
        text+="valabilitate (luni): "+this.luniValabilitate;
        return text;
    }

    public FaceCare(String prop){
        String [] split=prop.split(",");
        this.produs=split[2];
        this.detalii=split[3];
        this.luniValabilitate=Integer.parseInt(split[4]);
    }
}
