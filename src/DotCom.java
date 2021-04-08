import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    // private int numOfHits;
    public void setLocationCells (ArrayList<String> loc) {
        locationCells = loc;
    }

    public String CheckYourSelf(String userInput) {
        String result = "Мимо";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "Потопил";
            } else {
                result = "Попал";
            }
        }
        return result;
    }
}
