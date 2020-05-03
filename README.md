# moneylion-mobileautomation
# cucumber-bdd-api-java-maven

This is common framework can be used for Automating Android,iOS apps and Rest Assured API's, using BDD approach

# Environment Setup:
Install Java JDK/JRE should be 8
Install Maven 
Install "cucumber" using eclipse marketplace"
Install Eclipse IDE "oxygen"  or lesser but not latest.
Install command using "mvn clean install -P jenkins"

# Plugins :
Configure and Install Following Plugins
1.Help>>Install new software *Cucumber for Java http://cucumber.github.com/cucumber-eclipse/update-site.  
2.Navigate to jenkins home and click on "Manage jenkins" tab
3.Now click on "Manage plugins"
4.In "Available plugins" tab, perform serach for "Pipeline Maven Integration" and install

# Run tests:
Project link :https://github.com/rkn411/moneylion-mobileautomation.git
Clone or import project /Download as zip.
>Navigate to project root.
>>mvn clean
>>mvn install

(or) 

Right Click on TestRunner class and Click Run As > JUnit Test, TestngTest

## Import errors related to eclispe ide 
Issues can resolve by following document in below path

Navigate to project directory folder test-output "">> Framework Description >> .pdf"

# View HTML Report
HTML report will be generated once execution finish reports\.html
Open Index.html in browser to see the reports

## Path to Test Report file-

/MoneyLion/reports/cucumber-reports/cucumber-html-reports



# References
http://appium.io/docs/en/about-appium/intro/
http://rest-assured.io/  
https://cucumber.io/docs/guides/api-automation/  
https://dzone.com/articles/cucumber-selenium-jenkins-integration


