public class Notebook {
    private String name;
    private Integer ram;
    private Integer ssd;
    private String os;
    private String color;

    public Notebook(String name, Integer ram, Integer ssd, String os, String color){
        this.name = name;
        this.ram = ram;
        this.ssd = ssd;
        this.os = os;
        this.color = color;
    }

    @Override
    public String toString() {
        return ("Ноутбук: " + this.name + "\nОперативная память: " + this.ram + " Гб"+ "\nЖесткий диск: " + this.ssd + " Гб" + "\nОперационная система: " + this.os + "\nЦвет: " + this.color);
    }

    public String getName() {
        return name;
    }

    public Integer getRam() {
        return ram;
    }

    public Integer getSsd() {
        return ssd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }
}
