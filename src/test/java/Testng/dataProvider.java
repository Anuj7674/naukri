package Testng;

import org.testng.annotations.Test;

public class dataProvider {

//
//    @DataProvider(name = "data")
//    public Object[][] data() {
//        return new Object[][]{
//                {"1", "2"}, {"1", "2"}
//
//        };




    @Test(dataProvider = "getData",dataProviderClass = excelUtil.class)
    public void test1(String a,String b){

        System.out.println(a + " " + b);

    }

}