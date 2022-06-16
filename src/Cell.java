
public class Cell {
    private char cellCharacter;
    private boolean available;


    public Cell() {
        this.cellCharacter = '?';
        this.available = true;
    }
    public void setUnavailable(){
        this.available = false;
    }

    public void setAvailable(){
        this.available = true;
    }

    public boolean getAvailable() {
        return this.available;
    }

    public void setCellCharacter(char character) {
        if (available) {
            this.cellCharacter = character;
            this.available = false;
        }
    }

    public char getCellCharacter() {
        return cellCharacter;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(cellCharacter);
        return str.toString();
    }
}

