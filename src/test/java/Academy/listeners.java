package Academy;

import resources.base;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class listeners implements ITestListener  {

    base b= new base();

    public void onFinish(ITestContext arg0) {

    }

    public void onStart(ITestContext arg0) {

    }


    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

    }

    public void onTestFailure(ITestResult result) {

        try {
            b.getScreenshot(result.getName());
        }catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void onTestSkipped(ITestResult arg0) {

    }

    public void onTestStart(ITestResult arg0) {

    }

    public void onTestSuccess(ITestResult arg0) {

    }

}
