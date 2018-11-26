Instructions to run the Projects

Install the latest Eclipse IDE, and follow the steps: 
> Clone or Download all assessment projects from GitHut: LINK: https://github.com/SurpriseTukisi/Automation-Testing-Assessments.git
> Save the projects in a desired location on your machine e.g Desktop
> Import the projects in Eclipse IDE
> Open the project file:
	>>for TASK1_APP, make string-path changes in the following classes:
		>>>Resources.java - For example my location is "C:\\Users\\de01\\TASK1_APP\\src\\main\\java\\files\\environment.properties" and yours might be different

	>>for TASK2_WEB, make string-path changes in the following classes:
		>>>base.java - For example my location is "C:\\Users\\de01\\TASK2_WEB\\src\\main\\java\\resources\\data.properties" and yours might be different
		>>>ExcelDriven.java - For example my location is "C://Users//de01//TASK2_WEB//testData.xlsx" and yours might be different

----------------------------------------------------------

Next, you can run the projects, by using two options:
	Option 1: Using TestNG
		Right-click on the testng.xml file to run all the test scripts using TestNG, examine the output on the console tab(specifically for TASK1_APP project)

		
After successfully running the test scripts, right-click the project (TASK1_APP/TASk2_WEB) and select refresh.
To view the test reports: 
Open the test-output folder, 
Right-click the ExtentReportsTestNG.html, 
Select Properties, 
Copy the "Location" path-address, 
Navigate to any broswer e.g chrome, firefox etc. and paste the copied address - examine the report and test results (I made one validation test to fail on purpose specifically for TASK2_WEB project) - so that you will notice the beauty of the report. :-)


---------------------------------------------------------------------
	Option 2: Using Maven
		 Open the command prompt 
		 Change directory to to the location of the project e.g C:...\Desktop\TASK1_APP 
		 Run the program by using maven commands: > mvn clean 	
							: > mvn compile 
							: > mvn test 

After successfully running the test scripts, open the project folder and navigate to the report file: 
For example my location is "C:\Users\de01\TASK2_WEB\test-output" yours might be slightly different
Right-click on a HTLM file called ExtentReportsTestNG.html, and select a desired browser to view the Report
Analyse the test results

Repeat the above steps to run TASK1_APP project

In order to read data from Excel (specifically for TASK2_WEB):
Change the string path of the FileInputStream according to the location of the project.
For example my location is "C://Users//de01//TASK2_WEB//testData.xlsx" and yours might be different




			********************************* THE END *********************************