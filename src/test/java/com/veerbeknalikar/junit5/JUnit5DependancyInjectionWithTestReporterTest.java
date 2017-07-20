package com.veerbeknalikar.junit5;

import java.util.HashMap;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

@DisplayName("TestReporter dependancy injection into test methods")
public class JUnit5DependancyInjectionWithTestReporterTest {
    @Test
    void reportSingleValue(TestReporter testReporter) {
        testReporter.publishEntry("entry key", "value");
    }

    @Test
    void reportSeveralValues(TestReporter testReporter) {
        HashMap<String, String> values = new HashMap<>();
        values.put("user name", "veer");
        values.put("birth year", "9999");

        testReporter.publishEntry(values);
    }
}
