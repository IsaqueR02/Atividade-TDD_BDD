// src/test/java/runner/HamburgueriaRun.java
package runner;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources",
    glue = "classpath:steps"
)
public class HamburgueriaRun {
}
