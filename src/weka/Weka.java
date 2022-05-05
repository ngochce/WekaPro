/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package weka;

/**
 *
 * @author DELL
// */
public class Weka {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
//        MyKnowledgeModel model = new MyKnowledgeModel(
//                "C:\\Users\\DELL\\Weka-3-8-6\\data\\iris.arff");
//        System.out.println(model);
//        model.saveData("D:\\Data\\iris.arff");
//        model.saveData2CSV("D:\\Data\\iris_CSV.cav");
        
//        MyAprioriModel model = new MyAprioriModel(
//        "C:\\Users\\DELL\\Weka-3-8-6\\data\\weather.numeric.arff",
//        "-N 10 -T 0 -C 0.9 -D 0.05 -U 1.0 -M 0.1 -S -1.0 -c -1",
//        "-R 2-3");
//        model.mineAssociationRules();
//        System.out.println(model);


           MyFPGrowthModel model = new MyFPGrowthModel(
                   "C:\\Users\\DELL\\Weka-3-8-6\\data\\weather.nominal.arff",
                   "-P 2 -I -1 -N 10 -T 0 -C 0.7 -D 0.05 -U 1.0 -M 0.2",
                   "-N -R first-last");
           model.mineAssociationRules();
           System.out.println(model);

    }
    
}
