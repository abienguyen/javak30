package vn.tvn.data_type;

public class CharacterVariable {
    public static void innit() {

        // syntax
        // data_type (char) variable_name = innit value
        char letterA = 'A'; //duy nhất 1 ký tự, trong dấu nháy đơn, lưu theo dạng ký tự ABC
        char letterB = 'B';

        char uniChar = '\u0026'; //& - lưu theo dạng unit code
        char aciiChar = 97; // lưu theo dạng ký tự số

        System.out.println(uniChar);
        System.out.println(letterA);
        System.out.println(aciiChar);

        Character objectCharacter = 'A';
        //BTVN tìm hiểu methods trong Character
        //method dùng làm gì
        //method trả về giá trị gì
        //method cần parameters gì

        //1. Dùng để kiểm tra Char có phải thuộc số
        //2. Trả về true/false
        //3. Parameter là char data_type

        boolean result = Character.isDigit(aciiChar);
        System.out.println(result);
    }

    public static void main(String[] args) {
        innit();
    }
}