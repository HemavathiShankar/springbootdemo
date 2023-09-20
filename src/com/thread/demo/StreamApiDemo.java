package com.thread.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo {

	public static void main(String[] args) {
		/*
		List<Integer> l1= Arrays.asList(1,5,6,2,3,4);
		List<Integer>  l2=l1.stream().flatMap().filter(n->n+n==6).collect(Collectors.toList());
		System.out.println(l2);
		*/
		String[] arr= {"am","hema","dhanu","haksh"};
		List<String> list= new ArrayList<>();
		for(String s:arr)
			list.add(s);
		list.stream().filter(s->s.startsWith("h")).map(s->s.concat("happy"))
		.forEach(s->System.out.println(s));
		
				
		}
	
	}


