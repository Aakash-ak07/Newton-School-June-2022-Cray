// Sara loves triangles. Whenever she sees three points she connects them by straight lines to form a triangle. In triangles, her favorite one is a right-angled triangle. 
// If the triangle is not right-angled but it can be converted into one by moving one of the points exactly by distance 1 so, that all the coordinates remain integer, she calls such triangles "Special".
// Given three points A, B, and C your task is to check if the formed triangle is "Right", "Special" or "Simple".

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    
        public static boolean isRightAngledTriangle(int ax, int ay, int bx, int by, int cx, int cy) {
		// p, q and r are sides of our triangle
		
		// square of side ab
		int ab = ((ax - bx) * (ax - bx)) + ((ay - by) * (ay - by));
		
		int ac = ((ax - cx) * (ax - cx)) + ((ay - cy) * (ay - cy));
		
		int bc = ((bx - cx) * (bx - cx)) + ((by - cy) * (by - cy));
		
		// PYTHAGORAS THEOREM
		if(ab == ac + bc || ac == ab + bc || bc == ab + ac) return true;
		else return false;
	}

	public static void trianglesLove(int ax, int ay, int bx, int by, int cx, int cy) {
		if(isRightAngledTriangle(ax, ay, bx, by, cx, cy)) {
			System.out.println("Right");
			return;
		}
		
		int dirx[] = {0, 0, 1, -1};
		int diry[] = {1, -1, 0, 0};
		
		for(int i = 0; i < 4; i++) {
			// check with 1st point
			int newax = ax + dirx[i];
			int neway = ay + diry[i];
			if(isRightAngledTriangle(newax, neway, bx, by, cx, cy)) {
				System.out.println("Special");
				return;
			}
			
			// check with second point
			
			if(isRightAngledTriangle(ax, ay, bx + dirx[i], by + diry[i], cx, cy)) {
				System.out.println("Special");
				return;
			}
			
			
			// check with third point
			if(isRightAngledTriangle(ax, ay, bx, by, cx + dirx[i], cy + diry[i])) {
				System.out.println("Special");
				return;
			}
			
		}
		System.out.println("Simple");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int ax = scn.nextInt();
		int ay = scn.nextInt();
		int bx = scn.nextInt();
		int by = scn.nextInt();
		int cx = scn.nextInt();
		int cy = scn.nextInt();
		
		trianglesLove(ax, ay, bx, by, cx, cy);
    }
}


