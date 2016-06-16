package training;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;

/*
 * Tip:
 * The Java 8 Stream API contains a set of terminal operations 
 * (such as average, sum, min, max, and count) which return one value by combining the elements of a stream. 
 * Such terminal operations are called reduction operations. 
 * In addition to those terminal operations, the JDK also provides the general-purpose reduction method - reduce()
 */

public class Exercises {

	public void exerciseExample() {
		
		List<Student> students = Arrays.asList(
			new Student(2014, 2, "M"),
			new Student(2011, 3, "M"),
			new Student(2014, 7, "F"),
			new Student(2011, 2, "M"),
			new Student(2011, 5, "F"),
			new Student(2014, 9, "M"),
			new Student(2011, 12,"F"),
			new Student(2014, 2, "M"),
			new Student(2011, 3, "F"),
			new Student(2014, 15,"M"),
			new Student(2011, 1, "F"));
		
		
		int highestScore = 0;
		int year = 2011;
		//Old java: 
		for (Student s : students) {
			if(s.getGradYear() == year){
				if(s.getScore() > highestScore){
					highestScore = s.getScore();
				}
			}
		}
		
		System.out.println("highestScore: " + highestScore);

	}
	
	public void exercise1() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Before Java8, too much code for too little to do");
			}
		}).start(); 

	}
	
	public void exercise2() {
		JButton show = new JButton("Show");
		show.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Event handling without lambda expression is boring");
			}
		}); 
	}
	
	
	public void exercise3() {
		List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		for (String feature : features) {
			System.out.println(feature);
		}
	}
	
	public void exercise4() {
		List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
		double total = 0;
		for (Integer cost : costBeforeTax) {
			double price = cost + .12 * cost;
			total = total + price;
		}
		System.out.println("Total : " + total);
		
	}

}


