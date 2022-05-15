package class03;

import org.testng.ITestListener;
import org.testng.ITestResult;

import java.sql.SQLOutput;

public class listeners implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("The test case that failed is ::"+ result.getName());
    }
    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("the test that pass is ::: "+ result.getName());
    }
}
