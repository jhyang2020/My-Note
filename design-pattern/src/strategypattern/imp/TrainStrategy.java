package strategypattern.imp;

import strategypattern.ITravelStrategy;

/**
 * @Author jhYang
 * @Date 2022/2/27 0027 15:49
 * @Discription todo
 */
public class TrainStrategy implements ITravelStrategy {
    @Override
    public void travelAlgorithm() {
        System.out.println("乘坐火车...");
    }
}
