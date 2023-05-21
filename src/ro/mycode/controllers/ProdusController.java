package ro.mycode.controllers;

import ro.mycode.models.FaceCare;
import ro.mycode.models.Produs;
import ro.mycode.models.Telefon;
import ro.mycode.models.Tricou;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ProdusController {

    private ArrayList<Produs>produse;

    public ProdusController(ArrayList<Produs>produse){
        this.produse=produse;
    }



    public ProdusController(){
        this.produse=new ArrayList<>();
        this.load();
    }


    public void load(){
        try {
            File file=new File("C:\\mycode\\OOP\\polimorfism\\src\\ro\\mycode\\data\\produs.txt");
            Scanner scanner=new Scanner(file);
            while(scanner.hasNextLine()){
                String text=scanner.nextLine();
                switch (text.split(",")[0]){
                    case "FaceCare":
                        this.produse.add(new FaceCare(text));
                        break;
                    case "Telefon":
                        this.produse.add(new Telefon(text));
                        break;
                    case "Tricou":
                        this.produse.add(new Tricou(text));
                        break;
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void afisareProdus(){
        for(int i=0; i<produse.size();i++){
            if(produse.get(i) instanceof FaceCare){
                FaceCare faceCare=(FaceCare) produse.get(i);
                System.out.println(faceCare.descriereFaceCare());
                System.out.println("\n");
            } else if(produse.get(i) instanceof Telefon){
                Telefon telefon=(Telefon) produse.get(i);
                System.out.println(telefon.descriereTelefon());
                System.out.println("\n");
            }else{
                Tricou tricou=(Tricou) produse.get(i);
                System.out.println(tricou.descriereTricou());
                System.out.println("\n");
            }

        }
    }

}
