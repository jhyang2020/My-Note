package templatemethod;

/**
 * @Author jhYang
 * @Date 2022/2/27 0027 16:44
 * @Discription todo
 */
public class Test {
    public static void main(String[] args) {
        //美国申请留学报道
        StudyAbroad StudyInUsTm = new StudyInAmerica();
        StudyInUsTm.TemplateMethod();

        //英国申请留学报道
        StudyAbroad StudyInEnglandTm = new StudyInEngland();
        StudyInEnglandTm.TemplateMethod();
    }
}
