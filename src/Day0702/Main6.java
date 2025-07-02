package Day0702;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("16진수 문자열을 입력하시오: ");

        ToBinary tobin = new ToBinary(input.next());
        tobin.hexTobin();
    }
}
class ToBinary {
    private String hex;
    private String[] hex2bin = {"0000", "0001", "0010", "0011", "0100", "0101",
            "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
    public ToBinary(String s) {
        hex = s;
    }
    public void hexTobin() {
        System.out.print("\"" + hex + "\"에 대한 이진수는 ");
        for (int i = 0; i < hex.length(); i++) {
            switch (hex.charAt(i)) {
                case '0':
                    System.out.print(hex2bin[0] + " ");
                    break;
                case '1':
                    System.out.print(hex2bin[1] + " ");
                    break;
                case '2':
                    System.out.print(hex2bin[2] + " ");
                    break;
                case '3':
                    System.out.print(hex2bin[3] + " ");
                    break;
                case '4':
                    System.out.print(hex2bin[4] + " ");
                    break;
                case '5':
                    System.out.print(hex2bin[5] + " ");
                    break;
                case '6':
                    System.out.print(hex2bin[6] + " ");
                    break;
                case '7':
                    System.out.print(hex2bin[7] + " ");
                    break;
                case '8':
                    System.out.print(hex2bin[8] + " ");
                    break;
                case '9':
                    System.out.print(hex2bin[9] + " ");
                    break;
                case 'a':
                    System.out.print(hex2bin[10] + " ");
                    break;
                case 'b':
                    System.out.print(hex2bin[11] + " ");
                    break;
                case 'c':
                    System.out.print(hex2bin[12] + " ");
                    break;
                case 'd':
                    System.out.print(hex2bin[13] + " ");
                    break;
                case 'e':
                    System.out.print(hex2bin[14] + " ");
                    break;
                case 'f':
                    System.out.print(hex2bin[15] + " ");
                    break;
            }
        }
    }
}
