package SeleniumPOMFramework;


    package utils;

import org.testng.*;
import org.testng.xml.XmlSuite;
import java.io.*;
import java.util.*;

    public class CustomHTMLReporter implements IReporter {

        @Override
        public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {

            try {
                // Create output HTML file
                File reportFile = new File(outputDirectory + "/CustomReport.html");
                PrintWriter writer = new PrintWriter(new FileWriter(reportFile));

                // Start HTML
                writer.println("<html><head><title>Custom TestNG Report</title></head><body>");
                writer.println("<h1>Execution Report</h1>");
                writer.println("<table border='1' style='border-collapse: collapse;width:100%'>");
                writer.println("<tr><th>Test Case</th><th>Status</th><th>Duration (ms)</th></tr>");

                // Loop through suites
                for (ISuite suite : suites) {
                    Map<String, ISuiteResult> suiteResults = suite.getResults();
                    for (ISuiteResult result : suiteResults.values()) {
                        ITestContext context = result.getTestContext();

                        // Passed Tests
                        for (ITestResult testResult : context.getPassedTests().getAllResults()) {
                            writer.println("<tr style='color:green'><td>" +
                                    testResult.getName() + "</td><td>PASS</td><td>" +
                                    (testResult.getEndMillis() - testResult.getStartMillis()) +
                                    "</td></tr>");
                        }

                        // Failed Tests
                        for (ITestResult testResult : context.getFailedTests().getAllResults()) {
                            writer.println("<tr style='color:red'><td>" +
                                    testResult.getName() + "</td><td>FAIL</td><td>" +
                                    (testResult.getEndMillis() - testResult.getStartMillis()) +
                                    "</td></tr>");
                        }

                        // Skipped Tests
                        for (ITestResult testResult : context.getSkippedTests().getAllResults()) {
                            writer.println("<tr style='color:orange'><td>" +
                                    testResult.getName() + "</td><td>SKIPPED</td><td>" +
                                    (testResult.getEndMillis() - testResult.getStartMillis()) +
                                    "</td></tr>");
                        }
                    }
                }

                // End HTML
                writer.println("</table></body></html>");
                writer.close();

                System.out.println("✅ Custom HTML Report generated at: " + reportFile.getAbsolutePath());

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


