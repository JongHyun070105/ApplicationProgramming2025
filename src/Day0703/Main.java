package Day0703;

public class Main {

    public static String SchoolScoreToGrade(int score, boolean isMajorSubject) {
        if (isMajorSubject) {
            if (score >= 95) return "S";
            else if (score >= 90) return "A";
            else if (score >= 80) return "B";
            else if (score >= 70) return "C";
            else if (score >= 60) return "D";
            else return "F";
        } else {
            if (score >= 90) return "A";
            else if (score >= 80) return "B";
            else if (score >= 70) return "C";
            else if (score >= 60) return "D";
            else return "F";
        }
    }

    static class Student {
        String name;
        String stdnum;
        String department;
        String pillsu;
        int koreanScore;
        int mathScore;

        public Student(String name, String department, String stdnum, String pillsu, int koreanScore, int mathScore) {
            this.name = name;
            this.stdnum = stdnum;
            this.department = department;
            this.pillsu = pillsu;
            this.koreanScore = koreanScore;
            this.mathScore = mathScore;
        }

        public String[] getGrades() {
            boolean isMathMajor = department.equals("인공과");
            boolean isKoreanMajor = department.equals("보안과");

            String koreanGrade = SchoolScoreToGrade(koreanScore, isKoreanMajor);
            String mathGrade = SchoolScoreToGrade(mathScore, isMathMajor);

            return new String[]{
                name + " | " + stdnum + " | " + pillsu + " | " + koreanScore + " : " + koreanGrade + " |",
                name + " | " + stdnum + " | " + pillsu + " | " + mathScore + " : " + mathGrade + " |"
            };
        }
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student("강감찬", "보안과", "211213", "국어", 95, 56),
            new Student("김유신", "인공과", "212330", "수학", 95, 98),
            new Student("신사임당", "보안과", "201518", "국어", 100, 88),
            new Student("이순신", "보안과", "202360", "국어", 89, 95),
            new Student("홍길동", "인공과", "201290", "수학", 83, 56)
        };

        System.out.println("------------------");
        System.out.println("국어 수강생 학점");
        System.out.println("이름 | 학번 | 중점과목 | 점수");
        System.out.println("----------------------------");
        for (Student s : students) {
            System.out.println(s.getGrades()[0]);
        }
        System.out.println("----------------------------\n");

        System.out.println("------------------");
        System.out.println("수학 수강생 학점");
        System.out.println("이름 | 학번 | 중점과목 | 점수");
        System.out.println("----------------------------");
        for (Student s : students) {
            System.out.println(s.getGrades()[1]);
        }
        System.out.println("----------------------------");
    }
}