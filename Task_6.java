import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class Task_6{
    public static void main(String[] args) {
        laptops lap1=new laptops("A5",1236,"Xiaomi");
        lap1.setColor("black");
        lap1.setHDD(700);
        lap1.setOS("Windows");
        lap1.setRAM(8);
        
        laptops lap2=new laptops("ABC30",6467,"Acer");
        lap2.setColor("white");
        lap2.setHDD(1000);
        lap2.setOS("Windows");
        lap2.setRAM(8);

        laptops lap3=new laptops("AB97",67201,"Acer");
        lap3.setColor("rose");
        lap3.setHDD(900);
        lap3.setOS("Windows");
        lap3.setRAM(16);

        laptops lap4=new laptops("OMAN11",1111,"hp");
        lap4.setColor("black");
        lap4.setHDD(700);
        lap4.setOS("Linux");
        lap4.setRAM(8);

        laptops lap5=new laptops("MAC101",8438483,"Apple");
        lap5.setColor("silver");
        lap5.setHDD(1000);
        lap5.setOS("macOS");
        lap5.setRAM(8);

        HashSet <laptops> laptops = new HashSet<>(Arrays.asList(lap1,lap2,lap3,lap4,lap5));
        HashSet <laptops> res = new HashSet<>();

        System.out.println("Здравствуйте");
        System.out.print("Введите цифру необходимого критерия:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        scanner.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        while(n!=5){
        if(n==1){
            System.out.println("Введите минимальную оперативную память");
            Integer temp = scanner.nextInt();
            scanner.nextLine();
            filters.put("RAM", temp);
        }
        if(n==2){
            System.out.println("Введите минимальный объем ЖД" );
            Integer temp = scanner.nextInt();
            scanner.nextLine();
            filters.put("HDD", temp);
        }
        if(n==3){
            System.out.println("Введите ОС");
            String temp = scanner.nextLine();
            filters.put("OS", temp);
        }
        if(n==4){
            System.out.println("Введите цвет");
            String temp = scanner.nextLine();
            filters.put("color", temp);
        }
        System.out.print("Введите цифру необходимого критерия:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
        n = scanner.nextInt();
        scanner.nextLine();
    }
        for (Entry<String, Object> entry : filters.entrySet()) {
            if(entry.getKey().equals("RAM")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    laptops lap = (laptops) it.next();
                    if(lap.getRAM()>=(Integer)entry.getValue()){
                        res.add(lap);
                    }
                }
            }
             if(entry.getKey().equals("HDD")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    laptops lap = (laptops)it.next();
                    if(lap.getHDD()>=(Integer)entry.getValue()){
                        res.add(lap);
                        }
                    }
            }
            if(entry.getKey().equals("OS")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    laptops lap = (laptops)it.next();
                        if(lap.getOS().equals(entry.getValue())){
                            res.add(lap);
                            }
                        }
            }
            if(entry.getKey().equals("color")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    laptops lap = (laptops)it.next();
                        if(lap.getColor().equals(entry.getValue())){
                            res.add(lap);
                                    
                                
                   }
                }
            }
            Iterator it = res.iterator();
            while(it.hasNext()){
                laptops lap = (laptops)it.next();
            System.out.println(lap.toString());
            System.out.println();
            }
        
        
        }
    }
}