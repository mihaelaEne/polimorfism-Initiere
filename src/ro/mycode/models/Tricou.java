package ro.mycode.models;

public class Tricou extends Produs{
    private int marime;
    private String firma;
    private String material;

    public Tricou(String type, int id, int marime, String firma, String material) {
        super(type, id);
        this.marime = marime;
        this.firma = firma;
        this.material = material;
    }

    public Tricou(int marime, String firma, String material) {
        this.marime = marime;
        this.firma = firma;
        this.material = material;
    }

    public Tricou(String type, int id, int marime, String firma) {
        super(type, id);
        this.marime = marime;
        this.firma = firma;
    }

    public Tricou(String firma) {
        this.firma = firma;
    }

    public int getMarime() {
        return marime;
    }

    public void setMarime(int marime) {
        this.marime = marime;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String descriereTricou(){
        String text="";

        text+="Eu sunt un tricou cu urmatoarele caracteristici:"+"\n";
        text+="type: "+super.getType()+"\n";
        text+="id: "+super.getId()+"\n";
        text+="marime: "+this.marime+"\n";
        text+="firma: "+this.firma+"\n";
        text+="material: "+this.material+"\n";

        return text;
    }


    public void test() {
        System.out.println("eu sunt test din tricou");
    }

}
