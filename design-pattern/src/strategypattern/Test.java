package strategypattern;

import strategypattern.imp.AirPlanelStrategy;
import strategypattern.imp.TrainStrategy;

/**
 * @Author jhYang
 * @Date 2022/2/27 0027 15:53
 * @Discription todo
 */
public class Test {

    public static void main(String[] args) {

        PersonContext person = new PersonContext();

        //乘飞机
        person.setStravelStrategy(new AirPlanelStrategy());
        person.travle();

        //乘火车
        person.setStravelStrategy(new TrainStrategy());
        person.travle();

        //骑自行车
        person.setStravelStrategy(new AirPlanelStrategy());
        person.travle();

    }
}
