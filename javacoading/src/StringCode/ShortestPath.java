package StringCode;

public class ShortestPath {
	public static void main(String args[]) {
		String path = "WNEENESENNN";
		ShortestPath(path);
	}
	public static void ShortestPath(String path) {
		int x=0;
		int y=0;
		
		for(int i=0;i<path.length();i++) {
			if(path.charAt(i) == 'W') {
				x--;
			}else if(path.charAt(i) == 'E') {
				x++;
			}else if(path.charAt(i) == 'N') {
				y++;
			}else if(path.charAt(i) == 'S') {
				y--;
			}
		}
		int x2=(int) Math.pow(x, 2);
		int y2=(int) Math.pow(y, 2);
		System.out.print("Shortest path is = "+ Math.sqrt((x2+y2)));
		
		
	}

}
