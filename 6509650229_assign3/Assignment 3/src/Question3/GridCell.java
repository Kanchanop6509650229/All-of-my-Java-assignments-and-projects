//กาญจนพ บัวรอด
//6509650229

package Question3;

public class GridCell {
	private boolean open , hasBomb;
	
	public GridCell() {
		open = false;
		hasBomb = false;
	}
	
	public boolean isOpen() {
		return open;
	}
	
	public void setOpen(boolean open) {
		this.open = open;
	}
	
	public boolean isHasBomb() {
		return hasBomb;
	}
	
	public void setHasBomb(boolean hasBomb) {
		this.hasBomb = hasBomb;
	}
}
