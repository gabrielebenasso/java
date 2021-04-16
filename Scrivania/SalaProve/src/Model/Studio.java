package Model;

import View.Owner.StudioView;

import javax.swing.*;
import java.util.ArrayList;

public class Studio {
    public String name;
    private String ownerName;
    private int studiosNumber;
    private ArrayList<RehearsalStudio> rehearsalStudios;
    private DefaultListModel<RehearsalStudio> rehearsalStudioListModel;
    private StudioView studioView;
    private String email;


    public Studio(String name, String ownerName, int studiosNumber, String email){
        this.name = name;
        this.ownerName = ownerName;
        this.studiosNumber = studiosNumber;

    }
//    public void setRehearsalStudios( ArrayList<RehearsalStudio> rehearsalStudios){
//        this.rehearsalStudios = rehearsalStudios;
//    }
    public String getName(){ return name; }

    public String getEmail(){ return email; }



    public void onUpdateStudioName(String name){
        this.name = name;
    }

    public String getOwnerName(){ return ownerName; }

    public int getStudiosNumber(){ return studiosNumber; }

    public ArrayList<RehearsalStudio> getRehearsalStudios() {
        return rehearsalStudios;
    }





}
