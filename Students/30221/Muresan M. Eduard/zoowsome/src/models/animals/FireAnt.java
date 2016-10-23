package models.animals;

public class FireAnt extends Insect{
	enum Role{queen, drone, other};
	private Role role; 
	public FireAnt()
	{
		super(false, true, "Unknown");
		this.role = null;
	}
	public FireAnt(String name, Role role)
	{
		super(false, true, name);
		this.role = role;
	}
	public Role getRole()
	{
		return role;
	}
	public void setRole(Role role)
	{
		this.role = role;
	}
}
