package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "ComputerSpec")
    public Object[][] getData() {
        String[][] data = new String[][]{
                {"2.2 GHz Intel Pentium Dual-Core E2200","2 GB","Vista Home [+$50.00]" },
                {"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]","4GB [+$20.00]","320 GB","400 GB [+$100.00]","Vista Home [+$50.00]","Vista Premium [+$60.00] | Acrobat Reader [+$10.00]" },
                {"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]","8GB [+$60.00]","400 GB [+$100.00]","320 GB", "Vista" +
                        "Home [+$50.00]","Total Commander [+$5.00]"}
        };
        return data;
    }
}

