package by.epam.learn.main;

public class LearnMainLiteral {
    public static void main(String[] args) {
        int x = 1; //десятичная система
        int x8 = 017; //c 0, восьмеричная система, т.е. 15
        int x16 = 0x656af; // c 0x или 0X, 16-ная
        int x2 = 0b10101; // двоичная, с 0b или 0B
        byte b = 127;
        long k = 9399383843843748L;
        double d = 1.1722; // по умолчанию этот тип, мб 1. или .1722
        double d1 = 1.7E+2;
        float f = 5.1F;
        boolean flag = true;
        char ch = 48; // это ноль
        char ch1 = 'A';
        char ch2 = '\n';
        char ch3 = '\255'; //ASCII-коды
        char ch4 = '\uffff'; //unicode, max 4 символа, от 0000 до ffff
        int aa = 1_999_900; //чтобы было удобнее читать
        String str = null;
        String str1 = "java";
        Object ob = null;

        int j = 'ъ';
        System.out.println(j);
    }
}
