public class SecondsOfTheYear {

     public static void main(String[] args) {   
        // declarem les variables 
        
        int dies_any = 365;
        int hores_dia = 24;
        int minuts_hora = 60;
        int segons_minut = 60;
        int segons_any = dies_any * hores_dia * minuts_hora * segons_minut;

        System.out.println("There are " + segons_any + " seconds in a year");
    }

}
