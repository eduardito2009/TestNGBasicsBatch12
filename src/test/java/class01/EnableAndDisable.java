package class01;

import org.testng.annotations.Test;

public class EnableAndDisable {


    @Test(enabled = false)
    public void first(){
        System.out.println("1st");
    }

    @Test
    public void second(){
        System.out.println("2nd");
    }

    @Test
    public void third(){
        System.out.println("3rd");
    }

}
