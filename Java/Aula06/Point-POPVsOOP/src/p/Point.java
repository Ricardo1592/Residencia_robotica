package p;

import java.util.Objects;

public class Point  {
	
	//data variables / fields/ attributes
	private int x;
	private int y;
	
//	public Point() {}
	
//	public Point(int x) {
//		this.x = x;
//		this.y = 100;
//	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void moveBy(int dx, int dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}
	
	
	
}
