package Base;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
    String token = "3VcIrQij_ZI0Cr2PLCMfPhUCwMPue8lL7g4U8N4y8qhChjXJX5XqgzKdtXLEEMnbdp2Ag4rhs1DmWFzfgxvrsVU3_RPUaCoyAP_-Km0d7EYuxjyDtETYFg-8zZeO0YNkT0xKjwjqsvIHwYWApvRm0CatZJF42pJjqLyUx2fhbdHJreXNMPazmaMSvXI0OgDFpS-XuPWloBeSKemRw-JKX8kmEt6Y1SieVd_MYknkojgF5ZXBQIw5-mRvuSqARfM8wAf4AKg62HNuRmSZ9wLJJEau0zt9Me__oXCvRxGsJm1iUrxZFrizeO4NvSzRbKH3Ph0wXCdJ1ZMOUf6ksF7TDDV4CSpJz4azxPSSsuh35D-Ow8Pn8MB5E0u6KyhNYP5SUhhvlgCf7MMo1yceU8FSJdiD9z0y1qROrB8UvHkwMgodPPGBiJrcKoUzsJNAkot-7539cvLzkCWAbOjVu9E-k9rjrMDNznjv1nUWVDV6koYE4whMVFdJ5w2ov5bTeAgxek0LVdg3gvaDE77Yol9H3xpPxnm4wsd3QjDQ_5HhCk57cYvRHS6dVJC6T-ySHolzWDrqL-2zvUrh92UINQka_5F66mIGxURbWg3ADjSy_FC0zXIEryDDhPRiuO5yE-0y";
    public RequestSpecification requestSpecification;
    @BeforeMethod
    public void setConfig(){
        System.out.printf("Before Method");
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.addHeader("Authorization","Bearer " +token);
        requestSpecBuilder.addHeader("Content-Type", "application/json");

        requestSpecification = requestSpecBuilder.build();
        requestSpecification.baseUri("http://api.globedr.com");

    }

    @AfterMethod
    public void aferMethod(){
        System.out.printf("After Mehthod");
    }
}
