package strategypattern;

import strategypattern.ITravelStrategy;

/**
 * @Author jhYang
 * @Date 2022/2/27 0027 15:51
 * @Discription todo
 */
public class PersonContext {

    private ITravelStrategy stravelStrategy;

    public void setStravelStrategy(ITravelStrategy stravelStrategy) {
        this.stravelStrategy = stravelStrategy;
    }

    public void travle(){
        stravelStrategy.travelAlgorithm();
    }
}
