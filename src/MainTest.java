import java.util.Scanner;

public class MainTest {
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int ZERO = 0;
    public static final String AMOUNT_STUDENT_ADD = "Nhập số học sinh bạn muốn thêm";
    public static final String CARD_ID = "Mời bạn nhập cardId sv bạn muốn tìm kiếm";
    public static final String AMOUNT_CARD = "1. Nhập n card quản lý:";
    public static final String DISPLAY_ALL = "2. Hiển thị tất cả card:";
    public static final String FIND_BY_CARD_NAME = "3. Tìm kiếm sinh viên mượn sách qua id";
    public static final String FIND_RETURN_BOOK_INTO_LASTDAY_OF_MONTH = "4. Hiển thị danh sách các sinh viên trả sách vào cuối tháng";
    public static final String EXIT_APP = "0. Thoát chương trình";
    public static final String ENTER_YOUR_CHOICE = "Nhập lựa chọn của bạn ";
    public static final String ENTER_NAME_STUDENT = "Nhập tên sv ";
    public static final String ENTER_STUDENT_ID = "Nhập mã sv ";
    public static final String ENTER_BIRTH_DAY_STUDENT = "Nhập ngày sinh sv ";
    public static final String ENTER_CLASS_STUDENT = "Nhập lớp của sv ";
    public static final String ENTER_CARD_ID = "Nhập mã thẻ thư viện";
    public static final String ENTER_BEGIN_DAY = "Nhập ngày mượn sách";
    public static final String ENTER_RETURN_DAY = "Nhập ngày trả sách";
    public static final String ENTER_BOOK_CODE = "Nhập mã sách ";
    static CardManage cardManage = new CardManage();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            menuShow();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case ONE:
                    System.out.println(AMOUNT_STUDENT_ADD);
                    int numberStudent =Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < numberStudent; i++) {
                        addNewCard();
                    }
                    break;
                case TWO:
                    System.out.println(cardManage.cardLists);
                    break;
                case THREE:
                    System.out.println(CARD_ID);
                    String cardId = sc.nextLine();
                    cardManage.displayById(cardId);
                    break;
                case FOUR:
                    cardManage.showObjByReturnDayIsLastDayOfMonth();
                    break;
                case ZERO:
                    break;
            }
        } while (choice != ZERO);
    }

    private static void menuShow() {
        System.out.println(AMOUNT_CARD);
        System.out.println(DISPLAY_ALL);
        System.out.println(FIND_BY_CARD_NAME);
        System.out.println( FIND_RETURN_BOOK_INTO_LASTDAY_OF_MONTH);
        System.out.println(EXIT_APP);
        System.out.println(ENTER_YOUR_CHOICE);
    }

    public static void addNewCard(){
        Scanner  sc1 = new Scanner(System.in);
        System.out.println(ENTER_NAME_STUDENT);
        String name = sc1.nextLine();
        System.out.println(ENTER_STUDENT_ID);
        String studentId = sc.nextLine();
        System.out.println(ENTER_BIRTH_DAY_STUDENT);
        String birthday = sc1.nextLine();
        System.out.println(ENTER_CLASS_STUDENT);
        String classOfStudent = sc.nextLine();
        System.out.println(ENTER_CARD_ID);
        String cardId = sc1.nextLine();
        System.out.println(ENTER_BEGIN_DAY);
        String beginDay = sc.nextLine();
        System.out.println(ENTER_RETURN_DAY);
        String returnDay = sc1.nextLine();
        System.out.println(ENTER_BOOK_CODE);
        String bookCode = sc.nextLine();
        Student student = new Student(name,studentId,birthday,classOfStudent);
        Card card = new Card(student,cardId,beginDay,returnDay,bookCode);
        cardManage.addNew(cardId,card);
    }
}
