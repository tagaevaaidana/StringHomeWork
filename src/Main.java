import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // TODO: 24.12.2023 Эгерде arrylist тин ичинде создун 1 чи символу
        //  А болсо анда ошол созго Салам деп кошуп чыгаруу керек
//        ArrayList<String> name = new ArrayList<>();
//        name.add("Aidana");
//        name.add("Nur");
//        name.add("DiAna");
//       for (String a : name){
//           System.out.println(a.charAt(0));
//           if (a.charAt(2) == 'A'){
//               System.out.println(a + " Salam");
//           }
//       }
        // TODO: 24.12.2023  arraylist ичиндеги соз 7 символдон
        //  коп болсо анда биринчи 5 тамганы кесип кайтаруу керек
//        ArrayList<String> name1 = new ArrayList<>();
//        name1.add("My name is Aidana");
//        name1.add("Hello world");
//        name1.add("PeakSoft");
//        name1.add("Hello");
//        for (String a : name1){
//            if (a.length()>7){
//                System.out.println(a.substring(0,5));
//            }
//        }
        // TODO: 24.12.2023  arraylist тин ичиндеги создорду башка  arraylist ке чон кылып салуу керек

//        ArrayList<String> name2 = new ArrayList<>();
//        name2.add("aidana");
//        name2.add("hello");
//        name2.add("java");
//        name2.add("world");
//        ArrayList<String> name3 = new ArrayList<>(name2);
//        name3.add("tagaeva");
//        name3.add("Hello");
//        name3.add("My world");
//        for (String a : name3){
//            System.out.println(a.toUpperCase());
//        }
        // TODO: 24.12.2023 arraylist тин ичиндеги создорду кичине кылып консолго 4 жол менен чыгаруу
//        ArrayList<String> name3 = new ArrayList<>();
//        name3.add("HELLO WORLD");
//        name3.add("MOSCOW");
//        name3.add("HELLO WORLD");
//        name3.add("HELLO PEAKSOFT");
//        for (int i = 0; i < name3.size(); i++) {
//                System.out.println(name3.get(i).toLowerCase());
//        }
//        for (String a : name3){
//            System.out.println(a.toLowerCase());
//        }

        // TODO: 24.12.2023 arraylist тин ичинедги создордо
        //  А жана d символу камтылса консолго чыгарып arraylist
        //  тин ичинен очуруп кою керек жана баарын консолго чыгаруу
//        ArrayList<String> con = new ArrayList<>();
//        con.add("Aidana");
//        con.add("diana");
//        con.add("world");
//        con.add("hello");
//        con.add("Asan");
//        con.add("uson");
//        for (int i = 0; i < con.size(); i++) {
//            if (con.get(i).contains("A") || con.get(i).contains("d")){
//                con.remove(con.get(i));
//            }
//        }
//        System.out.println(con);

        // TODO: 24.12.2023  1- arraylist тин ичине 2чи arraylist теги создор болсо анда консолго чыгаруу
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("Hello Java");
//        arrayList.add("Hello Python");
//        arrayList.add("Hello C#");
//        ArrayList<String> arrayList1 = new ArrayList<>();
//        arrayList1.add("Aidana");
//        arrayList1.add("Tagaeva");
//        arrayList1.add("Hello Java");
//        for (String a : arrayList){
//            System.out.println(a.concat(" Aidana"));
//
//        }
        // TODO: 24.12.2023 arraylist тин ичиндеги создордун а символу турган индекстерди чыгаруу   indexOf(); 

//        ArrayList<String> study = new ArrayList<>();
//        study.add("Aidana");
//        study.add("Tagaeva");
//        study.add("Java");
//        study.add("Python");
//        System.out.println(study.indexOf('a'));
        // TODO: 24.12.2023 Эгерде листтин ичинде Aidana деген соз болсо аны Тагаева деп алмаштыруу керек
//        ArrayList<String> lastName = new ArrayList<>();
//        lastName.add("Aidana");
//        lastName.add("Asan");
//        lastName.add("Uson");
//        lastName.add("Diana");
//        for (String name : lastName){
//            System.out.println(name.replace("Aidana", "Tagaeva"));
//        }
        // TODO: 24.12.2023  arraylist тин ичиндеги создордун узундуктарын чыгаруу керек

        ArrayList<String> list = new ArrayList<>();
        list.add("I am study Java");
        list.add("I live in Moscow");
        list.add("and i am working in Moscow");
        list.add("I like to travel");
       for (String list1 : list){
           list1.length();
           System.out.println(list1);
       }

        }

    }
