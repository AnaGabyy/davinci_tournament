import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date comienzoDeCursada = new Date(2022, 7, 18);
        Date finDeCursada = new Date(2022, 11, 5);
        Date fechaParcial = new Date(2022, 8, 29);

        Season torneoDaVinci = new Season("Torneo 2022, 2do cuatri", comienzoDeCursada, finDeCursada);

        Player profeSergio = new Player("Sergio Medina", "GoalKeeper");
        Player profeSuplente = new Player("Suplente", "Defender");

        Team profesPoo = new Team("Profes POO");
        profesPoo.addPlayer(profeSergio);
        profesPoo.addPlayer(profeSuplente);

        Team estudiantesPoo = new Team("Estudiantes POO");

        Match primerParcial = new Match(
                "Aula 116",
                fechaParcial,
                profesPoo,
                estudiantesPoo
        );



    }
}
