import java.util.ArrayList;
import java.util.List;

public class Holidays {
  private String[] dates = new String[] { "01/01/2023", "21/02/2023", "17/04/2023", "21/04/2023", "01/05/2023",
      "08/06/2023", "07/09/2023", "12/10/2023", "02/11/2023", "15/11/2023", "25/12/2023" };
  private String[] names = new String[] { "Confraternização mundial",
      "Carnaval",
      "Páscoa",
      "Tiradentes",
      "Dia do trabalho",
      "Corpus Christi",
      "Independência do Brasil",
      "Nossa Senhora Aparecida",
      "Finados",
      "Proclamação da República",
      "Natal" };
  private List<Holiday> holidays = new ArrayList<>();

  public Holidays() {
    for (int i = 0; i < dates.length; i++) {
      Holiday holiday = new Holiday(dates[i], names[i]);
      this.holidays.add(holiday);
    }
  }

  public void getHoliday(String date) {
    boolean found = false;
    String holidayName = "";
    for (int i = 0; i < holidays.size(); i++) {
      if (holidays.get(i).date == date) {
        found = true;
        holidayName = holidays.get(i).name;
        break;
      }
    }
    if (found) {
      System.out.println("Nesse dia haverá o feriado de: " + holidayName);
    } else {
      System.out.println("Nesse não haverá nenhum feriado");
    }
  }

  public List<Holiday> getAllHolidays() {
    return holidays;
  }

  public void printAllHolidays() {
    for (int i = 0; i < holidays.size(); i++) {
      System.out.println(holidays.get(i).date + " => " + holidays.get(i).name);
    }
  }
}
