import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*Inicializar 4 estudiantes diferentes.*/
        Student s1 = new Student(31561321, "Eugenia", "Neira", "eugenia.neira@mail.com", "catamarca 2372", 2023, 20000d, "Tecnicatura en Programacion");
        Student s2 = new Student(30697998, "Rodriguez", "Martin", "martin.ro@mail.com", "cordoba 2456", 2022, 10000d, "Trader");
        Student s3 = new Student(24345678, "Sonia", "Rivero", "sonia.rivero@mail.com", "Balboa 3374", 2020, 15000d, "Ingenieria Industrial");
        Student s4 = new Student(12345678, "Malena", "Orellano", "malena.o@mail.com", "Terada 1531", 2024, 30000d, "Medicina");

        ///Inicializar 4 miembros de staff con características diferentes.
        Staff m1 = new Staff(52348900, "Graciela", "Camacho", "graciela.camacho@mail.com", "Cordoba 4545", 500000d, "Tarde");
        Staff m2 = new Staff(27900876, "Paula", "Neira", "p_neira@mail.com", "Mitre 3456", 689000d, "Mañana");
        Staff m3 = new Staff(25987678, "Lola", "Gonzalez", "lola.gon@mail.com", "San luis 4689", 450000d, "Tarde");
        Staff m4 = new Staff(56789098, "Montoto", "Perez", "montoto.perez@mail.com", "Av.colon 4567", 790000d, "Mañana");

        /*Crear un array que permita almacenar juntos los tipos anteriores y almacenar las 8 instancias creadas anteriormente.*/

        List<Person> peopleList = new ArrayList<>();

        peopleList.add(s1);
        peopleList.add(m1);
        peopleList.add(s2);
        peopleList.add(m2);
        peopleList.add(s3);
        peopleList.add(m3);
        peopleList.add(s4);
        peopleList.add(m4);

        /*Recorrer el array y mostrar por pantalla la cantidad de estudiantes y
        la cantidad de miembros de staff.*/

        int contStudents = 0;
        int contStaff = 0;
        for (Person p : peopleList) {
            if (p instanceof Student){
                contStudents++;
            }
            else{
                contStaff++;
            }
        }

        System.out.println(" La cantidad de estudiantes es "+ contStudents + " y la cantidad de miembros del staff es "+ contStaff);

        /* Recorrer el array y sumar el total de ingresos que percibe la
    institución por parte de la cuota de estudiantes.*/
        Double totalQuotas = 0d;
        for (Person p : peopleList) {
            if (p instanceof Student){
                totalQuotas += ((Student) p).getQuota();
            }
        }
        System.out.println("EL total de ingreso por cuotas de estudiantes es $" + totalQuotas);

    }
}
