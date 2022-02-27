package strategypattern.imp;

import strategypattern.ITravelStrategy;

/**
 * @Author jhYang
 * @Date 2022/2/27 0027 15:47
 * @Discription todo
 */
public class AirPlanelStrategy implements ITravelStrategy {
    @Override
    public void travelAlgorithm() {
        System.out.println("乘坐飞机...");
    }
}
