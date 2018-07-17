package lecture;

public class LectureMain {
    public static void main(String[] args) {
        // grade
        Grade grade = new Grade();
        System.out.println(grade.grade(50));

        // calculator
        Calculator calculator = new Calculator(1.5, 2.5);
        System.out.println(calculator.plus());

        // diamond
        Diamond diamond = new Diamond();
        diamond.draw();

        // lotto
        Lotto lotto = new Lotto();
        lotto.generateNumbers();
    }
}
