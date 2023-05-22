package chapter22;

import java.time.Duration;
import java.time.LocalTime;

public class Ex3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalTime skatsuki = LocalTime.of(9, 12, 30);
		LocalTime srintaro = LocalTime.of(9, 35, 20);
		LocalTime gkatsuki = LocalTime.of(14, 15, 10);
		LocalTime grintaro = LocalTime.of(15, 44, 20);

		Duration dk = Duration.between(skatsuki, gkatsuki);
		Duration dr = Duration.between(srintaro, grintaro);

		System.out.println("katsuki " + dk.toHoursPart() + "時間 " +
				dk.toMinutesPart() + "分 " + dk.toSecondsPart() + "秒");
		System.out.println("rintaro " + dr.toHoursPart() + "時間 " +
				dr.toMinutesPart() + "分 " + dr.toSecondsPart() + "秒");

		Duration d = dr.minus(dk);
		System.out.println("時間差" + d.toHoursPart() + "時間 " +
				d.toMinutesPart() + "分 " + d.toSecondsPart() + "秒");
	}

}
