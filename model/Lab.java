package model;

import java.util.ArrayList;

public class Lab {
    private ArrayList<LabEquipment> labequipments;


    public Lab(){
        labequipments= new ArrayList<>();
    }

    public LabEquipment getLabEquipment(int index){
        return this.labequipments.get(index).clone();
    }
    public void setLabEquipment(LabEquipment labEquipment,int index){
        this.labequipments.set(index, labEquipment.clone());
    }

    public void addLabEquipment(LabEquipment labEquipment){
        this.labequipments.add(labEquipment.clone());
    }



}
