import java.util.Scanner;

public class Tareas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Añade una tarea");
        String tareas=sc.nextLine();
        System.out.println(tareas);
        sc.close();
    }
}