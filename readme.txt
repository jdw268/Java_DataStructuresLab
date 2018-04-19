IMPORTANT:  READ THIS FILE BEFORE USING SupplyDump

Project:
SupplyDump

Description:
SupplyDump project takes in a user's input for a specific order of parts.  
This OID number is matched against a stock.xml file (that's imported into the program prior)
of the available models, options, and prices.  The OID number is ran
against the xml file options to build a specified parts invoice and output the user's
selections and associated costs.  The vehicle options are:  Sedan, Coupe, Truck, SUV, and Minivan.
Custom exceptions are built-in to let the user know specific formats for an OID number.
The invoice is outputted to screen as well as a .txt file.

Prerequisites:
minimum Java version 8 update 91

Files List:
to run: 
Manifest.mf
IrvinLab5.jar
stock.xml
SupplyDump.class
SupplyExceptions.class
Part.class


to build:
SupplyDump.java
Part.java
SupplyExceptions.java
stock.xml

Build Instructons:
Compile and run on the command line using the JDK compiler.  After extracting
the files to a folder, you can compile with javac *.java then run the program
using command java AnyCarMain

Run instructions:
If you have java runtime environment, use the java -jar IrvinLab5.jar to run the program

Authors:
Jillian Irvin
SupplyDump v1
