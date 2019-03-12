***************Drone Carried Delivery System.**************

This project entails a test harness for a drone based delivery system. The emphasis has been laid on testing the code coverage for various scenarios.
Therefore a Test Driven Development would be the best approach for this program. To achieve the TDD, all the functional modules of this programe have respective test classes that aim at 
automating the various scenarios by the means of stubs and mock test data.

Following are some of the highlights about the implementation:

1) The test harness has been created using Java 1.8.0
2) Development enviornment used is Eclipse IDE(Oxygen).
3) Build tool- Maven


=============Test Automation Approach used===============

Approach- 1 for testing code coverage.
1) TDD framework
2) Junit automation

Approach- 2 for testing system Behaviour.
1) BDD Framework
2) Cucumber
3) Gherkin language


=============Assumptions======================

•	The file format for input and output is a .txt file

•	NPS calculation is considering following three things:
	1.   	Distance of the customer’s coordinates from launch center.
	2.	Time taken to make the shipment ready.
	3.	Total Time Taken = Sum of above two points(1+2).
	4.	Based on the Total Time taken, Customer satisfaction (1-10) is derived and thus NPS is calculated.

•	The process responsible to feed the input text file is out of scope. Assuming there is a separate system to serve this purpose.

•	The calculations done to derive the NPS score based on input file data as a part of Test Harness may not be the best algorithm, however, its for the best intrest of 			

	developing Automation framework around that harness.

•	The Device (the Drone) testing is out of scope.

•	There is an exisiting UI screen to capture the feedback from customers that acts as an input for NPS calculation.

•	As there is no UI involved in this particular assignement, UI automation is not considered as a solution for this.

•	As there are no APIs involved in this program, API testing is out of scope.

•	Defects will be fixed, migrated and re-tested in a timely manner.
