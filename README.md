# Displate Test Sample

Displate Test Sample

Hi, here are test you requested.
How to run test? Glad you asked!

What you need:
- Chrome browser
- JDK >= 1.8
- Maven

From command line:
cd <project root>
mvn install
mvn clean test (run all tests: quick "smoke" test and e2e")
    or
mvn clean test -Dheadless="true" (run all test in headless mode)
    or
mvn clean test -Dcucumber.options="-t @smoke" (run quick "smoke" test, which checks if promo code in navbar is not empty)
    or
mvn clean test -Dheadless="true" -Dcucumber.options="-t @e2e" (run e2e test that you requested for in headless mode)

Reports are available in target/cucumberReport as html file
