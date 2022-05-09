enum Day {
    SUNDAY(10), MONDAY(20), TUESDAY(30), WEDNESDAY(40), THURSDAY(50), FRIDAY(60), STARDAY(70);

    int number;

    private Day(int number) {
        this.number = number;
    }
}

class Test {
    Day day;
    int number;

    public Test(Day day) {
        this.day = day;
    }

    public int getnumber(int number) {
        return this.number;
    }

    public void Display() {
        switch (day) {
            case SUNDAY:
                System.out.println("The first day of the week");
                break;
            case MONDAY:
                System.out.println("The second day of the week");
                break;
            default:
                System.out.println("The End");
                break;
        }
    }
}

public class EnumLearning {
    public static void main(String[] args) {
        Day[] ch = Day.values();
        String str = "SUNDAY";
        Test dotw = new Test(Day.valueOf(str));

        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i] + " at index--->" + ch[i].number);
        }
    }
}