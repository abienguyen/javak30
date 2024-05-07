package vn.tvn.selection_decisions;

import org.apache.commons.lang3.StringUtils;

public class IfElseDemo {
    // If Statement là điều đúng vs nó, nếu ko đúng thì bỏ ko chạy
    // If-else: nếu đúng thì làm stament A (body if), sai thì làm statment B (body else)
    //Nested-if (đk if lồng nhau): đúng thì làm đk 1, sau đó ktra tiếp đk2
    //If-Else-If ladder statment (khó, nên hạn chế dùng): đúng đk 1 thì làm stament 1, và kết thúc luôn
    //còn nếu đky 1 sai, thì mới ktra tiếp đk 2,...


    //If stament: là điều đúng vs nó, nếu ko đúng thì bỏ ko chạy

    public void ifDemo(int a){
        if (a % 2 == 0){
            System.out.println("Số chẵn");//nếu false ở if thì bỏ qua vòng lệnh if và chạy vòng dưới
        }
        System.out.println("Done");//nếu true ở if thì sẽ thực thi luôn vòng này
    }

    //If-else demo: nếu đúng thì làm stament A (body if), sai thì làm statment B (body else)
    // chỉ chạy 1 trong 2

    public void ifElseDemo(int a){
        if (a % 2 == 0){
            System.out.println("Số chẵn");
        } else {
            System.out.println("Số lẻ");
        }
        System.out.println("Done");
    }

    //Nested-if: (đk if lồng nhau):
    // dk 1 đúng thì sau đó mới ktra tiếp đk2
    // đk 1 sai thì sẽ done ko làm gì hết

    public void ifAndIfElseDemo (int a, int b){
        if (a % 2 == 0){
            if (b % 2 == 0){
                System.out.println("Cả 2 số chẵn: " + a + ", " + b);
            } else {
                System.out.println("Số " + a +" là chẵn, số "+b+ "lẻ");
            }
        }
        System.out.println("done");
    }

    //If-Else-If ladder statment (else-if) (khó, nên hạn chế dùng): đúng đk 1 thì làm stament 1, và kết thúc luôn
    //còn nếu đk 1 sai, thì mới ktra tiếp đk 2,...
    public void ladderStament(int a, int b){
        if (a % 2 == 0){

        } else if (b % 2 != 0) {
                System.out.println("Cả 2 số lẻ: " + a + ", " + b);
            } else {
            System.out.println("Số " + a +" là lẻ, số "+b+ "chẵn");
        }
        }

    public void ladderStament2(int a, int b){
        if (a % 2 == 0){

        } else {
            if (b % 2 != 0) {
                System.out.println("Cả 2 số lẻ: " + a + ", " + b);
            }
            }
        }

    public static void main(String[] args) {
        IfElseDemo ifElseDemo = new IfElseDemo();
        //ifElseDemo.ifDemo(13);
        //ifElseDemo.ifElseDemo(12);
        //ifElseDemo.ifAndIfElseDemo(14,6);
        ifElseDemo.ladderStament(14,6);
    }

    // BT: Tính lượng thực nhận của nhân viên
    // net = gross - tax
    // gross > 3000 --> tax = 30% (anywhere)
    //gross >= 2000 --> location (HN, HCM, DN)
    //                  --> tax = 25%, other location tax = 20%
    // gross < 2000 --> location (HN, HCM, DN)
    //    //                  --> tax = 15%, other location tax = 5%

    public double getNetSalary(double gross, String location){
        boolean isBigCity = isBigCity(location);
        double tax = 0;
        if (gross > 3000){
            tax = getTax(gross, 0.3f);
        } else if (gross >= 2000){
            // 2000 --> 3000
            if (isBigCity){
                tax = getTax(gross, 0.25f);
            } else {
                tax = getTax(gross, 0.2f);
            }
        } else {
            // < 2000
            if (isBigCity){
                tax = getTax(gross, 0.15f);
            } else {
                tax = getTax(gross, 0.05f);
            }
        }
        return gross - tax;
    }
    private boolean isBigCity(String location){
        return StringUtils.equals(location, "HCM")
                || StringUtils.equals(location, "HN")
                || StringUtils.equals(location, "DN");
    }

    private double getTax(double gross, float rate){
        return gross * rate;
    }

}

