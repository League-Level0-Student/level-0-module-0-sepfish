import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {

	public static void main(String[] args) {
		Robot gumi = new Robot();
		gumi.penDown();
		gumi.setRandomPenColor();
		gumi.setSpeed(10);
		gumi.setX(70);
	//K
		gumi.move(200);
		gumi.turn(180);
		gumi.move(100);
		gumi.turn(215);
		gumi.move(110);
		gumi.turn(180);
		gumi.move(110);
		gumi.turn(285);
		gumi.move(110);
		gumi.turn(-50);
		gumi.move(50);
	//A
		gumi.turn(-60);
		gumi.move(160);
		gumi.turn(120);
		gumi.move(80);
		gumi.turn(120);
		gumi.move(80);
		gumi.turn(180);
		gumi.move(80);
		gumi.turn(60);
		gumi.move(80);
		gumi.turn(-60);
		gumi.move(60);
	//Y
		gumi.turn(-90);
		gumi.move(100);
		gumi.turn(-30);
		gumi.move(100);
		gumi.turn(180);
		gumi.move(100);
		gumi.turn(-120);
		gumi.move(100);
		gumi.turn(180);
		gumi.move(100);
	}
}
