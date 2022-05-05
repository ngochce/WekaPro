/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weka;

import weka.associations.FPGrowth;
import weka.core.Instances;

/**
 *
 * @author DELL
 */
public class MyFPGrowthModel extends MyKnowledgeModel{
    Instances newData;
    FPGrowth fp;

    public MyFPGrowthModel(String filename, String m_opts, String d_opts) throws Exception {
        super(filename, m_opts, d_opts);
        this.fp=new FPGrowth();
    }
    
    public void mineAssociationRules() throws Exception{
        //Loc du lieu
        //this.newData = removeData(this.dataset);
        this.newData = convert2Binary(this.dataset);
        //Thiet lap cac thong so
        fp.setOptions(this.model_options);
        //Khai pa du lieu
        fp.buildAssociations(this.newData);
    }

    @Override
    public String toString() {
        return fp.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
