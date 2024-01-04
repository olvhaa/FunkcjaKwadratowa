import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        System.out.println("Obliczanie pierwiastkow rownania kwadratowego");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wspolczynniki a,b,c rownania kwadratowrgo");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double x1;
        double x2;
        double delta;

        if(a == 0 && b == 0 && c == 0) System.out.println("Rownanie ma nieskonczenie wiele rozwiazan");
        else if(a == 0 && b == 0 && c != 0) System.out.println("Rownanie sprzeczne");
        else if(a == 0 && b != 0 && c != 0){
            x1 = -c / b;
            System.out.printf("Rownanie ma jedno rozwiazanie %.3f\n ", x1);
        }
        else if(a != 0 && b != 0 && c == 0){
            x1 = 0;
            x2 = -b / a;
            System.out.printf("Rownanie ma dwa rozwiazania %.3f oraz %.3f\n ", x1, x2);
        }
        else if((a > 0 && b == 0 && c < 0) || (a < 0 && b == 0 && c > 0)){
            x1 = Math.sqrt(-c/a);
            x2 = - Math.sqrt(-c/a);
            System.out.printf("Rownanie ma dwa rozwiazania %.3f oraz %.3f\n ", x1, x2);
        }
        else if(a != 0 && b == 0 && c == 0) {
            x1 = 0;

            System.out.printf("Rownanie ma jedno rozwiazanie  %.3f\n ", x1);
        }
        else if(a != 0 && b != 0 && c != 0) {
            delta = pow(b,2) - 4 * a * c;
            if(delta < 0) System.out.println("Rownianie nie ma pierwiastkow");

            else if(delta == 0) {
                x1 = -b/ (2 * a);
                System.out.printf("Rownanie ma jeden pierwiastek %.3f\n ", x1);
            }else {
                if(b >= 0 ) x1 = (-b - Math.sqrt(delta)) / (2 * a);
                else x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = c / (a * x1);
                System.out.printf("Rownanie ma dwa rozwiazania %.3f oraz %.3f\n ", x1, x2);
            }
        }
      else System.out.println("Rownanie nie ma pierwiastkow");

    }
}
