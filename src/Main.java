public class Main {
    static Agenda agenda = new Agenda();

    public static void main(String[] args) {
        Persona p1 = new Persona("63652343", "hugo.sardeagmail.com", "hugo", "Artidello");
        Persona p2 = new Persona("63654743", "pablo.Turboagmail.com", "Pablo", "Junco");
        Persona p3 = new Persona("63234763", "Alvaro.Montegmail.com", "Alvaro", "Gonzalez");
        Persona p4 = new Persona("63652343", "Gema.Institgmail.com", "Gema", "Suarez");
        agenda.addPersona(p1);
        agenda.addPersona(p2);
        agenda.addPersona(p3);
        agenda.addPersona(p4);

        System.out.println(agenda.ordenarporApellidos());
    }
}

