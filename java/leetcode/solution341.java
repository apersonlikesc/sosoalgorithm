import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class solution341 {
    Queue<Integer> queue = new LinkedList<>();
    public solution341(List<NestedInteger> nestedList) {
        resolve(nestedList);
    }

    public void resolve(List<NestedInteger> nestedList){
        for(int i=0;i<nestedList.size();i++){
            NestedInteger nestedInteger = nestedList.get(i);
            if(nestedInteger.isInteger()){
                queue.add(nestedInteger.getInteger());
            }else{
                resolve(nestedInteger.getList());
            }
        }
    }


    public Integer next() {
        return queue.poll();
    }


    public boolean hasNext() {
        return !queue.isEmpty();
    }
}
