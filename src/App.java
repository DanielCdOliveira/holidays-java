import java.util.List;

public class App {
    public static void main(String[] args) {
        Holidays feriados = new Holidays();
        feriados.getHoliday("21/02/2023");
        List<Holiday> todosFeriados = feriados.getAllHolidays();
        System.out.println(todosFeriados);
        feriados.printAllHolidays();
    }
}
