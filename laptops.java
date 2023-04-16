/*
 * 1 Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
2 Создать множество ноутбуков.
3 Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
NoteBook notebook1 = new NoteBook
NoteBook notebook2 = new NoteBook
NoteBook notebook3 = new NoteBook
NoteBook notebook4 = new NoteBook
NoteBook notebook5 = new NoteBook
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

 */
public class laptops {
    private String color;
    private Integer RAM;
    private String OS;
    private Integer HDD;
    private Integer id;
    private String brand;
    private String model;
    
    

    public laptops(String model, Integer id, String brand){
        this.model = model;
        this.brand = brand;
        this.id = id;
        System.out.println("Ноутбук марки "+"'"+ this.brand+"'"+"Модель "+this.model+"  С id " +Integer.toString(this.id));
    }
    public String getColor(){
        return this.color;
    }
    public Integer getRAM(){
        return this.RAM;
    }
    public String getOS(){
        return this.OS;
    }
    public Integer getHDD(){
        return this.HDD;
    }
   
    public void setColor(String color){
        this.color =color;
    }
    public void setRAM(Integer RAM){
        this.RAM = RAM;
    }
    public void setOS(String OS){
        this.OS = OS;
    }
    public void setHDD(Integer HDD){
        this.HDD = HDD;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Ноутбук ");
        sb.append(this.id);
        sb.append(System.lineSeparator());
        sb.append(this.color);
        sb.append(" ");
        sb.append("OS "+this.OS);
        sb.append(System.lineSeparator());
        sb.append("HDD "+this.HDD);
        sb.append(System.lineSeparator());
        sb.append("RAM "+this.RAM);
        sb.append(System.lineSeparator());
      
        
        return(sb.toString());
    }
 

}
