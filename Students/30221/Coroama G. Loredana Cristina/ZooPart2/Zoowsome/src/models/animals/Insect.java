package models.animals;

abstract public class Insect extends Animal{
public Insect(double mn, double dp) {
		super(mn, dp);
		// TODO Auto-generated constructor stub
	}
public boolean canFly;
public boolean isDangerous;
public boolean isCanFly() {
	return canFly;
}
public void setCanFly(boolean canFly) {
	this.canFly = canFly;
}
public boolean isDangerous() {
	return isDangerous;
}
public void setDangerous(boolean isDangerous) {
	this.isDangerous = isDangerous;
}
}
