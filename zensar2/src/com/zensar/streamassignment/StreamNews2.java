//class News { int newsId; String postedByUser; String commentByUser; String comment; }
//1.Find out the newsId which has received maximum comments.
//2.Find out how many times the word 'budget' arrived in user comments of all news. Assume that ‘budget’ word has arrived only once in a given user comment.
//3.Display commentByUser wise number of comments.
//4.Find out which user has posted maximum comments.
package com.zensar.streamassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class News
{
	int newsId;
	String postedByUser;
	String commentByUser;
	String comment;
	
	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getPostedByUser() {
		return postedByUser;
	}

	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}

	public String getCommentByUser() {
		return commentByUser;
	}

	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
public class StreamNews2
{

	public static void main(String[] args) 
	{
		List<News> list = Arrays.asList(
				                new News(101, "Finance", "Budget", "7"),
				                new News(101, "Politics", "Election", "3"),
				                new News(101, "Business", "Sensex", "5"),
				                new News(101, "RoadAccident", "Traffic", "1")
				           );
		System.out.println("The newsId which has received maximum comments is ");
		Map<Integer,Integer> map = new HashMap<>();
		list.stream()
		.forEach(c->{if(map.containsKey(c.newsId) ) map.put(c.newsId, map.get(c.newsId)+1); else map.put(c.newsId, 1);});
		int a = Collections.max(map.values());
		map.entrySet().forEach(e->{if(e.getValue()==a) System.out.println("NewsId="+e.getKey());});
		
		System.out.println("\nHow many times the word 'budget' arrived in user comments of all news. Assume that ‘budget’ word has arrived only once in a given user comment.");
		List<Integer> l1 = new ArrayList<>();
		list.stream().forEach(c->{if(c.comment=="Budget") l1.add(1);});
		System.out.println(l1.size());
		
		System.out.println("Display commentByUser wise number of comments.");
		Map<String,Integer> map1 = new HashMap<>();
		list.stream()
		.forEach(c->{if(map1.containsKey(c.commentByUser) ) map1.put(c.commentByUser, map1.get(c.commentByUser)+1); else map1.put(c.commentByUser, 1);});
		map1.entrySet().forEach(e->{System.out.println(e.getKey()+" = "+e.getValue());});
		
		System.out.println("\nUser who has posted maximum comments is ");
		Map<String,Integer> map2 = new HashMap<>();
		list.stream()
		.forEach(c->{if(map2.containsKey(c.postedByUser) ) map2.put(c.postedByUser, map2.get(c.postedByUser)+1); else map2.put(c.postedByUser, 1);});
		int b = Collections.max(map2.values());
		map2.entrySet().forEach(e->{if(e.getValue()==b) System.out.println("PostedByUser = "+e.getKey()+ ", No. of Comments = "+e.getValue());});
	}
}
