import java.util.ArrayList;
import java.util.List;

public class DirectionList {
    private List<int[]> directions;

    public DirectionList() {
        directions = new ArrayList<>();
        directions.add(new int[]{1, 2});
        directions.add(new int[]{1,-2});
        directions.add(new int[]{-1,2});
        directions.add(new int[]{-1,-2});
        directions.add(new int[]{2,1});
        directions.add(new int[]{2,-1});
        directions.add(new int[]{-2,1});
        directions.add(new int[]{-2,-1});
    }
    public int getX(int index){
        return directions.get(index)[0];
    }
    public int getY(int index){
        return  directions.get(index)[1];
    }
    public int size(){
        return directions.size();
    }

}

