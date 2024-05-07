package vn.tvn.practice.bt_4;

import vn.tvn.practice.bt_4.ClazzBT;
import vn.tvn.practice.bt_4.ScoresBT;
import vn.tvn.practice.bt_4.StudentBT;

public class StudentObject {
    public static void main(String[] args) {
        StudentBT thinh = new StudentBT("ABC", "Huyen",
                "Java for tester", (byte) 102, "7/11/1992", "123 Ngô Gia Tự");
        ClazzBT java = new ClazzBT("Gao", "123 Tan Binh", "IT");
        ScoresBT thinhScore = new ScoresBT((byte) 58, (byte) 69, (byte) 82);

        thinh.printInfoStudent();
        java.printInforClazz();
        thinhScore.printInforScores();

        //4.2 Dựa theo 4.1 viết 1 method
// để trả về điểm trung bình của sinh viên

        var avgThinh = thinh.getScore().getAverage();//khi ko viết 1 hàm method  bên StudentBT, cần fai gọi getScore.chỗ method có dấu *****
        var avg2 = thinh.getAvgScore();
        var rank = thinh.getRank();
        var rank2 = thinh.getRank2();
    }
}

