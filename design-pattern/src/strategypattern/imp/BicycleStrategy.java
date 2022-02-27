package strategypattern.imp;

import strategypattern.ITravelStrategy;

/**
 * @Author jhYang
 * @Date 2022/2/27 0027 15:50
 * @Discription todo
 */
public class BicycleStrategy implements ITravelStrategy {
    @Override
    public void travelAlgorithm() {
        System.out.println("骑自行车...");
    }
}
