import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CardManage {
    public static final String NULL = "";
    public static final String JAN = "01";
    public static final String MAR = "03";
    public static final String MAY = "05";
    public static final String JUL = "07";
    public static final String AUG = "08";
    public static final String OCT = "10";
    public static final String DEC = "12";
    public static final String APR = "04";
    public static final String JUN = "06";
    public static final String SEP = "09";
    public static final String NOV = "11";
    public static final String FEB = "02";
    public static final String THIRTY_ONE = "31";
    public static final String THIRTY = "30";
    public static final String TWENTY_NINE = "29";
    public static final String TWENTY_EIGHT = "28";
    public static final String NOT_EXITS = "CardId you enter not exits";
    Map<String, Card> cardLists = new HashMap<>();
    Set<String> keyLists = cardLists.keySet();

    public void addNew(String cardId, Card card) {
        cardLists.put(cardId, card);
    }

    public void displayById(String cardId) {
        for (String key : keyLists) {
            boolean testCardId = key.equals(cardId);
            if (testCardId) {
                System.out.println(cardLists.get(key));
                return;
            }
        }
        System.out.println(NOT_EXITS);
    }

    public void showObjByReturnDayIsLastDayOfMonth() {
        boolean isLastDayOfMonth = true;
        for (String key : keyLists) {
            String returnDay = cardLists.get(key).getReturnDay();
            String lastDayOfMonth = takeLastDayOfMonth(returnDay);
            String day = returnDay.substring(0, 2);
            isLastDayOfMonth = day.equals(lastDayOfMonth);
            if (isLastDayOfMonth) {
                System.out.println(cardLists.get(key));
            }
        }
        if (!isLastDayOfMonth) System.out.println(NOT_EXITS);
    }

    public String takeLastDayOfMonth(String returnDay) {
        String month = returnDay.substring(3, 5);
        int year = Integer.parseInt(returnDay.substring(6, 10));
        String lastDayOfMonth = NULL;
        switch (month) {
            case JAN:
            case MAR:
            case MAY:
            case JUL:
            case AUG:
            case OCT:
            case DEC:
                lastDayOfMonth = THIRTY_ONE;
                break;
            case APR:
            case JUN:
            case SEP:
            case NOV:
                lastDayOfMonth = THIRTY;
                break;
            case FEB:
                boolean isLeapYear = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
                if (isLeapYear) {
                    lastDayOfMonth = TWENTY_NINE;
                } else lastDayOfMonth = TWENTY_EIGHT;
                break;
        }
        return lastDayOfMonth;
    }
}
