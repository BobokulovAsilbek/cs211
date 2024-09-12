//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");
        /*
        Rectangle rectangle = new Rectangle();
        //rectangle.setParam(12, 12);
        System.out.printf("%f\n", rectangle.area());
        System.out.printf("%f", rectangle.prem());
        */
        Invoice invoice = new Invoice("12", "qw", 23, 143);
        System.out.printf("%.2f", invoice.getInvoiceAmount());

    }
}

//invoice class
public class Invoice {
    private String partNum;
    private String partDesc;
    private int quantity;
    private int price;
    Invoice(String partNum, String partDesc, int quantity, int price){
        this.partNum = partNum;
        this.partDesc = partDesc;
        this.quantity = quantity;
        this.price = price;

    }

    public double getInvoiceAmount(){
        return price*quantity;
    }
}


//rectangle class
public class Rectangle {
    private double width = 1;
    private double length = 1;

    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public void setParam(double width, double length){
        if(width > 0 && width < 20){ this.width = width; }
        if(length > 0 && length < 20){ this.length = length; }
    }
    public double prem(){
        return 2 * (length + width);
    }
    public double area(){
        return length * width;
    }
}
