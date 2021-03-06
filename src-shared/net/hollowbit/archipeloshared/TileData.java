package net.hollowbit.archipeloshared;

public class TileData {
	
	public static final int COLLISION_MAP_SCALE = 2;
	
	public short no = 0;
	public String id = "tile";
	public String category = "misc";
	public int x = 0, y = 0;
	public String name = "Tile";
	public boolean animated = false;
	public float animationTime = 0.2f;
	public int animationFrames = 4;
	public float speedMultiplier = 1f;
	public float damage = 0;//Damage dealt per second
	public boolean swimmable = false;
	public boolean[][] collisionTable = new boolean[COLLISION_MAP_SCALE][COLLISION_MAP_SCALE];
	public boolean flipX = false;
	public boolean flipY = false;
	public int rotation = 0;//0-3
	public String footstepSound;
	
	//Used by map editor
	public byte transitionCode = -1;//-1 to 11
	public String transitionInner = "";
	public String transitionOuter = "";
	
}
