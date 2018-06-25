========================================================
Read Me:
========================================================

This project is built on JDK1.5 and it uses following jars:

- Commons Lang - for Using some string comparison / checks
- Junit and Hamcrest for Junits


Directions to Run:
Execute the TestRunner.java.
This will execute the ReversAndReplaceTest.java and print the success and failure statements





Files In the Application:

ReplaceLastnameFirstname.java
	Class which does the actual processing of reversing and replacing


ReverseAndReplace.java
	Main Class for execution. It has just one standard input

ReverseAndReplaceTest.java
	Parameterized Junit which has a series of inputs defined
	For Example:
	{"I Like Cats.","Cats","Dogs"},
    {"hersh","e","E"},
    {"AAA AAB BAA","AA","a"},
    {"I Work.","Work","Play"},
    {"Tests are the best!","best!","just ok."},
    {"Tests are the best!","","   "},
    {" ","","  test "},
    {"lkasjaskjd jasjdasijd lskajdlasjd","Hersh","Test"},


TestRunner.java
	This class run the test and prints out the sucess info statements / failures 
	for example of the above inputs:
	
Jun 24, 2018 10:51:38 PM com.sho.hire.hw.test.ReverseAndReplaceTest testEscapeReverser
INFO: Dogs. Like I
Jun 24, 2018 10:51:38 PM com.sho.hire.hw.test.ReverseAndReplaceTest testEscapeReverser
INFO: hsrEh
Jun 24, 2018 10:51:38 PM com.sho.hire.hw.test.ReverseAndReplaceTest testEscapeReverser
INFO: Ba aB aA
Jun 24, 2018 10:51:38 PM com.sho.hire.hw.test.ReverseAndReplaceTest testEscapeReverser
INFO: Play. I
Jun 24, 2018 10:51:38 PM com.sho.hire.hw.test.ReverseAndReplaceTest testEscapeReverser
INFO: just ok. the are Tests
testEscapeReverser[5](com.sho.hire.hw.test.ReverseAndReplaceTest): one or more inputs are empty / null. Please correct
testEscapeReverser[6](com.sho.hire.hw.test.ReverseAndReplaceTest): one or more inputs are empty / null. Please correct
testEscapeReverser[7](com.sho.hire.hw.test.ReverseAndReplaceTest): Nothing to replace. Please correct input!
Result==false
	
