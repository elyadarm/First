

public class Player {
	//first i start with constants!

final int Movespeed=5;

private  int CentreposX=16;
private int CentreposY=82;
private boolean movingLeft = false;
private boolean movingRight = false;
private boolean movinup = false;
private boolean movindown=false;

private int speedX = 0;


private Background bg1 = StartingClass.getBg1();
private Background bg2 = StartingClass.getBg2();

public void update() {
	// Moves Character or Scrolls Background accordingly.

	if (speedX < 0) {
		CentreposX += speedX;
	}
	if (speedX == 0 || speedX < 0) {
		bg1.setSpeedX(0);
		bg2.setSpeedX(0);

	}
	if (CentreposY <= 200 && speedX > 0) {
		CentreposY += speedX;
	}
	if (speedX > 0 && CentreposY > 200){
		bg1.setSpeedX(-Movespeed);
		bg2.setSpeedX(-Movespeed);
	}

	// Updates Y Position
	if (speedX < 0) {
		CentreposY += speedX;
	}
	if (speedX == 0 || speedX < 0) {
		bg1.setSpeedX(0);
		bg2.setSpeedX(0);

	}
	if (CentreposY <= 200 && speedX > 0) {
		CentreposY += speedX;
	}
	if (speedX > 0 && CentreposY > 200){
		bg1.setSpeedX(-Movespeed);
		bg2.setSpeedX(-Movespeed);
	}

	// Prevents going beyond X coordinate of 0
	if (CentreposX + speedX <= 60) {
		CentreposX = 61;
	}
}
public void moveRight() {
}

public void moveLeft() {
}
public void moveUP() {
}
public void moveDOWN() {
}
public void stopRight() {
	setMovingRight(false);
	stop();
}

public void stopLeft() {
	setMovingLeft(false);
	stop();
}
public void stopUP() {
	setMovingup(false);
	stop();
}

public void stopDOWN() {
	setMovingdown(false);
	stop();
}
private void stop() {
	if (isMovingRight() == false && isMovingLeft() == false) {
		speedX = 0;
	}

	if (isMovingRight() == false && isMovingLeft() == true) {
		moveLeft();
	}

	if (isMovingRight() == true && isMovingLeft() == false) {
		moveRight();
	}

}


public int getCenterX() {
	return CentreposX;
}

public int getCenterY() {
	return CentreposY;
}


public int getSpeedX() {
	return speedX;
}


public void setCenterX(int centerX) {
	this.CentreposX = centerX;
}

public void setCenterY(int centerY) {
	this.CentreposY = centerY;
}


public void setSpeedX(int speedX) {
	this.speedX = speedX;
}


public boolean isMovingRight() {
	return movingRight;
}

public void setMovingRight(boolean movingRight) {
	this.movingRight = movingRight;
}

public boolean isMovingLeft() {
	return movingLeft;
}

public void setMovingLeft(boolean movingLeft) {
	this.movingLeft = movingLeft;
}



public boolean isMovingupt() {
	return movinup;
}

public void setMovingdown(boolean movingdown) {
	this.movindown = movingdown;
}

public boolean isMovingdown() {
	return movindown;
}

public void setMovingup(boolean movingup) {
	this.movinup = movingup;
}
}


