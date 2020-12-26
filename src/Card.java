public class Card {
    Student student;
    private String cardId;
    private String beginDay;
    private String returnDay;
    String bookCode;

    public Card(Student student, String cardId, String beginDay, String returnDay, String bookCode) {
        this.student = student;
        this.cardId = cardId;
        this.beginDay = beginDay;
        this.returnDay = returnDay;
        this.bookCode = bookCode;
    }
    public String getReturnDay(){
        return returnDay;
    }

    @Override
    public String toString() {
        return "Card{" + student +
                ", cardId='" + cardId + '\'' +
                ", beginDay='" + beginDay + '\'' +
                ", returnDay='" + returnDay + '\'' +
                ", bookCode='" + bookCode + '\n' +
                '}';
    }
}
