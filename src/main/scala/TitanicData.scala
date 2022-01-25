import org.apache.log4j.PropertyConfigurator
import org.apache.spark.sql.SparkSession

object TitanicData {
  PropertyConfigurator.configure("C:/spark-2.4.7-bin-hadoop2.7/spark-2.4.7-bin-hadoop2.7/conf/log4j.properties")

  def main(args:Array[String]): Unit ={

   val spark=SparkSession.builder().master("local").appName("titanic Data").getOrCreate()

   val df=spark.read.csv("Data/titanic_data.txt")
   // df.show()
    df.createOrReplaceTempView("data")

//      1. Find the average age of people who died and who survived
    spark.sql("select avg(_c4) from data where (_c2=1) and (_c4!='NA')").show()
    spark.sql("select avg(_c4) from data where (_c2=0) and (_c4!='NA')").show()

//    2. Number of males and females survived in following age range: age <= 20, 20 < age <= 50 and (50 < age and age =NA)

    spark.sql("select count(*) from data where (_c10='male') and (_c4!='NA') and (_c4<=20)").show()
    spark.sql("select count(*) from data where (_c10='male') and (_c4!='NA') and (_c4>20) and (_c4<=50)").show()
    spark.sql("select count(*) from data where (_c10='female') and (_c4!='NA') and (_c4<=20)").show()
    spark.sql("select count(*) from data where (_c10='female') and (_c4!='NA') and (_c4>20) and (_c4<=50)").show()
    spark.sql("select count(*) from data where (_c10='male') and (_c4!='NA') and (_c4>50)").show()
    spark.sql("select count(*) from data where (_c10='male') and (_c4!='NA') and (_c4='NA')").show()
    spark.sql("select count(*) from data where (_c10='female') and (_c4!='NA') and (_c4>50)").show()
    spark.sql("select count(*) from data where (_c10='female') and (_c4!='NA') and (_c4='NA')").show()

//    3. Embarked locations and their count
    spark.sql("select _c5 as Embarked_locations ,count(*) as cnt from data group by _c5 order by cnt").show()

//    4. Number of people survived in each class
     spark.sql("select _c1 as class ,count(*) as count from data where _c2=1 group by _c1").show()

//    5. number of males survived whose age is less than 30 and travelling in 2nd class
    spark.sql("select count(*) as count from data where (_c10='male') and (_c4<30) and (_c4!='NA') and (_c1='2nd')").show()

  }
}
