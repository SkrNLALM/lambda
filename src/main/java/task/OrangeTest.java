package task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class OrangeTest {
    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(300,Color.GREEN));
        inventory.add(Orange.builder().weight(200).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(100).color(Color.RED).build());
        inventory.add(Orange.builder().weight(500).color(Color.RED).build());
        inventory.add(Orange.builder().weight(300).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(301).color(Color.GREEN).build()) ;

//        OrangeFormatter simpleFormatter = orange -> "An orange of " + orange.getWeight() + "g";
//       prettyPrintApple(inventory,simpleFormatter);
//
//        prettyPrintApple(inventory,orange -> "An orange of " + orange.getWeight() + "g");
//
//        System.out.println("*************");
//
//       OrangeFormatter fancyFormatter = orange -> {
//          String characteristic = orange.getWeight()>150 ? "Heavy" : "Light";
//           return "A " + characteristic + " " + orange.getColor() + " orange";
//       };

        //allttaki satir functional interace kullanmak icin yazildi

        List<Orange> OApple = prettyPrintApple(inventory, orange -> orange.getColor().equals(Color.GREEN));
        System.out.println(OApple);

        List<Orange> OApple1 = prettyPrintApple(inventory, orange -> orange.getWeight()>300);
        System.out.println(OApple1);

     //  prettyPrintApple(inventory,fancyFormatter);
    }

//    private static void prettyPrintApple(List<Orange> inventory,OrangeFormatter orangeFormatter){
//        for(Orange orange : inventory){
//            String output = orangeFormatter.accept(orange);
//            System.out.println(output);
 //       }
     private static List<Orange> prettyPrintApple(List<Orange> inventory, Predicate <Orange> OrangeFormatter){
       for(Orange orange : inventory){
         String output = String.valueOf(OrangeFormatter.test(orange));
          // System.out.println(output);

        }
        return null;
    }

}
