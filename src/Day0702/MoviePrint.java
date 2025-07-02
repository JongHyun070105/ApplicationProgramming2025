package Day0702;

class Movie{
    String title = "명량";
    double value = 4.5;
    String director = "김아무개";
    int year = 2015;

    void print(){
        System.out.println("영화의 제목: " + title + '\n'
                + "영화의 평점: " + value + '\n' +
                "영화의 감독: " + director + '\n' +
                "영화의 발표연도: " + year);
    }
}

public class MoviePrint {
    public static void main(String[] args) {
        Movie mv = new Movie();
        mv.print();
    }
}
