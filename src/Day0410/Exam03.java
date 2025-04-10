package Day0410;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

class Word{
    String eng;
    String kor;
    public Word(String eng, String kor){
        this.eng = eng;
        this.kor = kor;
    }
}

public class Exam03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        ArrayList<Word> a = new ArrayList<>();

        // 단어 추가
        a.add(new Word("apple","사과"));
        a.add(new Word("banana","바나나"));
        a.add(new Word("car","자동차"));
        a.add(new Word("dog","강아지"));
        a.add(new Word("elephant","코끼리"));
        a.add(new Word("orange","오렌지"));
        a.add(new Word("lion","사자"));
        a.add(new Word("tiger","호랑이"));
        a.add(new Word("king","왕"));
        a.add(new Word("queen","여왕"));
        a.add(new Word("moon","달"));
        a.add(new Word("sun","태양"));
        a.add(new Word("ball","공"));

        System.out.println("영어 단어 맞추기 게임(-1 입력시 종료, 0 입력시 단어 추가) >> ");

        int flag = scan.nextInt();
        if(flag == 0){
            System.out.println("추가할 영어 단어를 입력 >> ");
            String engplus = scan.next();
            System.out.println("추가한 영어 단어 뜻을 입력 >>");
            String korplus = scan.next();

            a.add(new Word(engplus,korplus));

            // 전체 출력
            for(Word w : a){
                System.out.println(w.eng+" "+w.kor);
            }
        }
        while(true){
            int answerIndex = rand.nextInt(a.size());
            Word answer = a.get(answerIndex);

            ArrayList<Word> options = new ArrayList<>();
            options.add(answer);

            // 정답이 아닌 3개의 보기
            while(options.size() < 4){
                int wrongIndex = rand.nextInt(a.size());
                Word wrong = a.get(wrongIndex);
                if(!options.contains(wrong)){
                    options.add(wrong);
                }
            }

            // 보기 섞기
            Collections.shuffle(options);

            // 문제 출력
            System.out.println(answer.eng + "의 뜻은? >>");
            for(int i = 0; i < options.size(); i++){
                System.out.println((i + 1) + ". " + options.get(i).kor);
            }
            System.out.println("정답 입력(1~4, -1은 종료) >> ");
            int user = scan.nextInt();

            if(user == -1){
                System.out.println("게임을 종료합니다.");
                break;
            }
            if(user < 0 || user > 4){
                System.out.println("1 ~ 4 사이의 값을 입력하세요");
                continue;
            }

            // 정답 판별
            if(options.get(user - 1).equals(answer)){
                System.out.println("정답입니다. ");
            } else{
                System.out.println("오답입니다.");
            }

        }
        scan.close();

    }
}
