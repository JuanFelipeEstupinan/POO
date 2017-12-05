package fr.ensimag.test;

import fr.ensimag.scheduler.Scheduler;

public class SchedulerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scheduler scheduler = new Scheduler();
		scheduler.addJob("test", 10, "Prueba");
	}

}
