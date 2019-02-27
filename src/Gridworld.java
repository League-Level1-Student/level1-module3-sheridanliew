import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	public static void main(String[] args) {
		World world = new World();
		Bug bug = new Bug();
		Flower flower = new Flower();
		Location loc0 = new Location(0, 0);
		Random random = new Random();
		int rx = random.nextInt(10);
		int ry = random.nextInt(10);
		Location locR = new Location(rx, ry);
		world.show();
		world.add(loc0, bug);
		Bug blueBug = new Bug(Color.BLUE);
		world.add(locR, blueBug);
		for (int i = 0; i < 2; i++) {
			blueBug.turn();
		}
		Location locR1 = new Location(rx, ry - 1);
		Location locR10 = new Location(rx, 9);
		if (ry == 0) {
			world.add(locR10, flower);
		} else {
			world.add(locR1, flower);
		}
		Location locR2 = new Location(rx, ry + 1);
		Location locR20 = new Location(rx, 0);
		if (ry == 9) {
			world.add(locR20, flower);
		} else {
			world.add(locR2, flower);
		}
		for (int x = 0; x < 10; x++) {
			for (int y = 0; y < 10; y++) {
				Location loc = new Location(x, y);
				world.add(loc, flower);
			}
		}
	}
}
