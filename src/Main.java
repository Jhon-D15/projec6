import java.util.Scanner;

public class longitud {

public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double radio;
        double length;
        double area;

        System.out.println("///////////////////////////////////////////////////////////////////////");

        System.out.println("debes ingresar una medida para poder calcular el tamaño del radio");
        radio = lector.nextDouble();


        length = (2*radio*3.1416);
        area = ((length*radio)/2);

        System.out.println("///////////////////////////////////////////////////////////////////////");

        System.out.println(" area total del circulo es:"+" "+area+" "+"cm^2");
        System.out.println("la longitud del circulo es:"+" "+length+" "+"cm^3");

}
        }
