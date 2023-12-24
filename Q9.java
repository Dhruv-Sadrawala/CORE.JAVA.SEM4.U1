import java.util.Scanner;
class area {
   public area(int base,int height){
        int area_tr=(height*base)/2;

        System.out.println(area_tr+" is the area of triangle with "+base+" as base and "+height+" as height.");
    }

    public area(double length,double width){
        double area_tr= 2*(length+width);

        System.out.println(area_tr+" is the area of rectangle with "+length+" as length and "+width+" as width.");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter base of triangle");
        int base=sc.nextInt();

        System.out.println("Enter height of triangle");
        int height=sc.nextInt();

        System.out.println("Enter length of rectangle");
        double length=sc.nextInt();

        System.out.println("Enter width of rectangle");
        double width=sc.nextInt();

        new area(base,height);
        new area(length,width);
    }
}