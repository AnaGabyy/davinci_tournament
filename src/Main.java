import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date comienzoDeCursada = new Date(2022, 7, 18);
        Date finDeCursada = new Date(2022, 11, 5);
        Date fechaParcial = new Date(2022, 8, 29);

        Season torneoDaVinci = new Season("Torneo 2022, 2do cuatri", comienzoDeCursada, finDeCursada);


        Team profesPoo = new Team("Profes POO");
        profesPoo.addPlayer(new Player("Sergio Medina", "GoalKeeper"));
        profesPoo.addPlayer(new Player("Suplente", "Defence"));
        profesPoo.addPlayer(new Player ("Lautaro", "Defence"));
        profesPoo.addPlayer(new Player ("Bautista", "forward"));
        profesPoo.addPlayer(new Player ("Julio", "midfielder"));


        Team estudiantesPoo = new Team("Estudiantes POO");
        estudiantesPoo.addPlayer(new Player("Kiara", "GoalKeeper"));
        estudiantesPoo.addPlayer(new Player("Ana", "Defence"));
        estudiantesPoo.addPlayer(new Player("Gianni", "Defence"));
        estudiantesPoo.addPlayer(new Player("Angel", "forward"));
        estudiantesPoo.addPlayer(new Player("Santino", "midfielder"));


        Match primerParcial = new Match(
                "Aula 116",
                fechaParcial,
                profesPoo,
                estudiantesPoo
        );

        System.out.println(primerParcial.generateMarker());
        primerParcial.makeGoal(profesPoo, profesPoo.getPlayers().get(0));
        System.out.println(primerParcial.generateMarker());

    }
}
