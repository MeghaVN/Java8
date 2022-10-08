package com.streams_flatMap;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStreams {

	public static void main(String[] args) {
		//sequential stream
		
		Stream<String> stream = Stream.of("Tom","Peter","John","chloe");
		//stream.forEach(x->System.out.println(x));
		
		//stream.forEach(System.out::println);//this stream is closed 
		
		stream.findFirst().ifPresent(System.out::println);//At run time illegal state exception is thrown as
		//the stream is closed and same stream is used 
		
		//2. 
		Arrays.asList("a1","a2","a3")
			.stream()
			.findFirst()
			.ifPresent(System.out::println);
		
		//print range 1 to 5
		//IntStream is primitive data stream
		IntStream.range(1, 5).forEach(System.out::println);
		
		//4. 
		Arrays.stream(new int[] {1,2,3,4,5,6}).map(n->2*n+1)
		.average()
		.ifPresent(System.out::println);
		
		//5.String data objects
		
//		Stream.of("a1","a2","a3","a4","a5")
//				.map(s->s.substring(1)) //a1->1
//				.mapToInt(Integer::println)
//				.max()
//				
		
		
		
				
		
		
	}
}
