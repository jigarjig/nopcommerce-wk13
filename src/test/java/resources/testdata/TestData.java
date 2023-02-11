package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "Processor")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"2.2 Ghz Intel Pentium Dual-Core E2200", "2 GB", "320 GB", "Vista Home [+$50.00]", "Microsoft Office [+$50.00]"},
                {"2.5 Ghz Intel Pentium Dual-Core E2200 [+$ 15.00]", "4 GB[+$20", "400 GB [+$100]", "Vista Premium [+$60.00]", "Acrobat Reader [+$10.00]"},
                {"2.5 Ghz Intel Pentium Dual-Core E2200 [+$ 15.00]", "8 GB[+$60.00]", "320 GB", "Vista Home [+$50.00]", "Total Commander [+$5.00]"}};

        return data;
    }
}





