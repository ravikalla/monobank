package in.ravikalla.monobank.cucumber.stepdefs;

import in.ravikalla.monobank.MonobankApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MonobankApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
