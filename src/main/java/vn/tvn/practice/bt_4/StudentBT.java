package vn.tvn.practice.bt_4;

import vn.tvn.practice.bt_4.ClazzBT;
import vn.tvn.practice.bt_4.ScoresBT;

public class StudentBT {
    //4.1 Create Student class có 1 số thuộc tính (id, name, clazz, scores, birthday, address)
    //Tạo ra 3 students object khác nhau dựa trên Student class. (thuộc tính: id, name, clazz, scores, birthday, address)
    //Trong đó:
    //- class là 1 object của Clazz class. Nó bao gồm thông tin như (name, address, departments).
    //- scores cũng là 1 object của class Scores (nó bao gồm 3 scores: writing, reading, listening)
    private String id;
    private String name;
    private String clazz;
    private byte scores;
    private String birthday;
    private String address;
    private ScoresBT scoresBT;

    public StudentBT(String id, String thinh_tran, ClazzBT java, ScoresBT thinhScore, String birthday) {
    }

    public String getName() {
        return name;
    }

    public String getClazz() {
        return clazz;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

/*    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public void setScores(byte scores) {
        this.scores = scores;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }*/

    public StudentBT(String id, String name, String clazz, byte scores, String birthday, String address) {
        this.id = id;
        this.name = name;
        this.clazz = clazz;
        this.scores = scores;
        this.birthday = birthday;
        this.address = address;
    }
     public void printInfoStudent(){
         System.out.println("id: " + id);
         System.out.println("name: " + name);
         System.out.println("clazz: " + clazz);
         System.out.println("scores: " + scores);
         System.out.println("birthday: " + birthday);
         System.out.println("address: " + address);
     }


    //    Xếp loại của 1 sinh viên theo logic bên dưới
//- Below =20 - F
//-  20 to below 40 - E
//-  40 to below 50 - D
//- 50 to below 60 - C
//- 60 to below 80 - B
//- 80 and above 80 - A

    public ScoresBT getScore() {
        return scoresBT;
    }

    public String getId() {
         return id;
    }

    //viết thêm 1 method này thì ko cần gọi thêm getScore *****
    public byte getAvgScore(){
        return scoresBT.getAverage();
    }

    public String getRank(){
        var avg = getAvgScore();
        if (avg >= 80){
            return "A";
        } else if(avg >= 60){
            return "B";
        } else if (avg >= 50){
            return "C";
        } else if (avg >= 40){
            return "D";
        } else if (avg >= 20){
            return "E";
        } else {
            return "F";
        }
    }

    public String getRank2(){
        var avg = getAvgScore();
        var rank = avg / 10;
        switch (rank){
            case 10:
            case 9:
            case 8:
                return "A";
            case 7:
            case 6:
                return "B";
            case 5:
                return "C";
            case 4:
                return "D";
            case 3:
            case 2:
                return "E";
            default:
                return "F";
        }
    }

    public void print() {
    }
}
