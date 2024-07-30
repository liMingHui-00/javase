package day18;

public class StudyTest {
    public static void main(String[] args) {
        Study study = new Study() {
            @Override
            public void study() {
                System.out.println("学习Java");
            }
        };
        study.study();
        Study k = new Study() {
            @Override
            public void study() {
                System.out.println("k📕");
            }
        };
        k.study();
    }
}
