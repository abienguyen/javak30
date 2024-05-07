package vn.tvn.selection_decisions;
import org.apache.commons.lang3.StringUtils;

public class SwitchCaseDemo {
    //syntax:
    //switch (expression là 1 giá trị nào đó có trong case){
    //case x:
    //break;
    //case y;
    //break;
    //default}

    public void demoSwitchCase(String browser) {
        switch (browser) {
            case "ie":
                System.out.println("Start IE browser");
                break;// luôn nhớ có break để dừng case
            case "safari":
                System.out.println("Start Safari browser");
                break;
            case "firefox":
                System.out.println("Start Firefox browser");
                break;
            default:
                System.out.println("No start anything");
        }
    }

    public void ifElseVsSwitchCase(String browser) {
        if (StringUtils.equals(browser,"ie")){
        System.out.println("Start IE browser");
    } else if(StringUtils.equals(browser,"safari")) {
        System.out.println("Start Safari browser");
    } else if(StringUtils.equals(browser,"firefox")) {
        System.out.println("Start Friefox browser");
    } else{
        System.out.println("No start anything");
    }
}

    public static void main(String[] args) {
        SwitchCaseDemo switchCaseDemo = new SwitchCaseDemo();
        switchCaseDemo.demoSwitchCase("safari");
        switchCaseDemo.ifElseVsSwitchCase("firefox");
    }
}
