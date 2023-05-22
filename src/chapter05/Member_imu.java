 package chapter05;

import chapter04.IdNumber;

public record Member_imu(IdNumber id, String name) {
	public Member_imu (IdNumber id, String name) {
		this.id = new IdNumber(id.getNumber());
		this.name = name;
	}
	public IdNumber id () {
		return new IdNumber(id.getNumber());
	}
}
