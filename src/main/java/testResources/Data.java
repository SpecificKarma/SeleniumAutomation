package testResources;

import org.apache.commons.lang3.RandomStringUtils;

public class Data {

    public String homePage = "https://www.apple.com";

    public String iPadPage = "https://www.apple.com/ipad/";

    public String RandomUsername = RandomStringUtils.randomAlphabetic(7).toLowerCase();

    public String RandomNumeric = RandomStringUtils.randomNumeric(10);

    public String RandomEmail = RandomUsername + "@gmail.com";

}
