package diome.java.basico.aula02;

public class IFSwitchDiaDaSemana {
    public static void main(String[] args) {
        int dia = 3; // Supondo que 1 = Domingo, 2 = Segunda, etc.

        // Usando if
        if (dia == 1) {
            System.out.println("Hoje é Domingo.");
        } else if (dia == 2) {
            System.out.println("Hoje é Segunda-feira.");
        } else if (dia == 3) {
            System.out.println("Hoje é Terça-feira.");
        } else if (dia == 4) {
            System.out.println("Hoje é Quarta-feira.");
        } else if (dia == 5) {
            System.out.println("Hoje é Quinta-feira.");
        } else if (dia == 6) {
            System.out.println("Hoje é Sexta-feira.");
        } else if (dia == 7) {
            System.out.println("Hoje é Sábado.");
        } else {
            System.out.println("Número do dia inválido.");
        }

        // Usando switch
        switch (dia) {
            case 1:
                System.out.println("Hoje é Domingo.");
                break;
            case 2:
                System.out.println("Hoje é Segunda-feira.");
                break;
            case 3:
                System.out.println("Hoje é Terça-feira.");
                break;
            case 4:
                System.out.println("Hoje é Quarta-feira.");
                break;
            case 5:
                System.out.println("Hoje é Quinta-feira.");
                break;
            case 6:
                System.out.println("Hoje é Sexta-feira.");
                break;
            case 7:
                System.out.println("Hoje é Sábado.");
                break;
            default:
                System.out.println("Número do dia inválido.");
                break;
        }
    }
}
