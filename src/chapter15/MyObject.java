package chapter15;

import java.io.Serializable;
import java.time.LocalDate;

public class MyObject implements Serializable{
	private static final long serialVersionUID = 10L;
	
	private static int counter;
	private double value;
	private LocalDate date;
}
