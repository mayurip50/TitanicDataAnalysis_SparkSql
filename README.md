# TitanicDataAnalysis_SparkSql
Objective
Titanic was one of the biggest disasters in the history of mankind, which happened due to natural events and human mistakes. The objective is
to analyze Titanic data sets and generate various insights.

Sample Datasets
"row.names","pclass","survived","name","age","embarked","home.dest","room","ticket","boat","sex"
"1","1st",1,"Allen, Miss Elisabeth Walton",29.0000,"Southampton","St Louis, MO","B-5","24160 L221","2","female"
"2","1st",0,"Allison, Miss Helen Loraine", 2.0000,"Southampton","Montreal, PQ / Chesterville, ON","C26","","","female"
"3","1st",0,"Allison, Mr Hudson Joshua Creighton",30.0000,"Southampton","Montreal, PQ / Chesterville, ON","C26","","(135)","male"
"4","1st",0,"Allison, Mrs Hudson J.C. (Bessie Waldo Daniels)",25.0000,"Southampton","Montreal, PQ / Chesterville, ON","C26","","","female"
"5","1st",1,"Allison, Master Hudson Trevor", 0.9167,"Southampton","Montreal, PQ / Chesterville, ON","C22","","11","male"

Format of Data
1.	"row.names" – Row number
2.	"pclass" - PClass
3.	"survived" – Survived, 0-died, 1-survived
4.	"name" – passenger-name
5.	"age" – passenger-age
6.	"embarked" – Onboard-location
7.	"home.dest" – Destination
8.	"room" – Room
9.	"ticket" – Ticket
10.	"boat" – Boat
11.	"sex" – Sex

Problem Statements
1. Find the average age of people who died and who survived
2. Number of males and females survived in following age range: age <= 20, 20 < age <= 50 and (50 < age and age =NA)
3. Embarked locations and their count
4. Number of people survived in each class
5. number of males survived whose age is less than 30 and travelling in 2nd class
