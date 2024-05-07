package vn.tvn.practice.bt_4;

public class ScoresBT {
    private byte writing;
    private byte reading;
    private byte listening;

    public ScoresBT(byte writing, byte reading, byte listening) {
        this.writing = writing;
        this.reading = reading;
        this.listening = listening;
    }

    //4.2 Dựa theo 4.1 viết 1 method để trả về điểm trung bình của sinh viên
    public byte getAverage(){
        return (byte) ((writing + reading + listening) / 3);
    }
    public void printInforScores(){
        System.out.println("===== " + writing);
        System.out.println("===== " + reading);
        System.out.println("===== " + listening);
    }
}
