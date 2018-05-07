package com.stackroute.demo;

import com.stackroute.demo.service.SparkService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Serializable;

@SpringBootApplication
public class SparkApplication implements Serializable {

	public static void main(String[] args) {
		new SparkService().sparkListener("my-topic");
//		System.out.println("inside main");
//		SpringApplication.run(SparkApplication.class, args);
		//SparkConf sparkConf = new SparkConf().setAppName("simple app").setMaster("local[2]").set("spark.executor.memory","1g");
		
		//SparkConf sparkConf = new SparkConf().setAppName("simple").setMaster(master);
		//check(sparkConf);
	}
	
	
}
	
	
//	public static void check(SparkConf sparkConf)
//	{
//		String file = "./README.md";
//		
//		JavaSparkContext javaSparkContext = new JavaSparkContext(sparkConf);
//		JavaRDD<String> lines = javaSparkContext.textFile(file).cache();
////		long numAs = data.filter(new Function<String, Boolean>() {
////		      public Boolean call(String s) { return s.contains("hai"); }
////		    }).count();
//	
//		JavaRDD<Integer> lineLengths = lines.map(new Function<String, Integer>() {
//			  public Integer call(String s) { return s.length(); }
//			});
//		
//		int totallength = lineLengths.reduce(new Function2<Integer,Integer,Integer>(){
//			public Integer call(Integer a, Integer b){return a+b;
//			}
//		});
//		
//		JavaPairRDD<String,Integer> pairs = lines.mapToPair(s -> new Tuple2(s,1));
//		JavaPairRDD<String,Integer> counts = pairs.reduceByKey((a,b) -> a+b);
//		counts.persist(StorageLevel.MEMORY_ONLY());
//		System.out.println(counts.collect());
//		javaSparkContext.stop();
//	}
	

