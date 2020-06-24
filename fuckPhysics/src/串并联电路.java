public class 串并联电路  implements  口水化的描述,脑筋急转弯{


    @Override
    public void 描述() {

        System.out.println("定义:流入一个节点的所有支路的电流之和等于流出这个节点的所有支路的电流之和。");
        System.out.println("电势升高的地方为正，电势降低的地方为负。");
        System.out.println("请看图:串并联。如果选择A点。");
        System.out.println("顺时针走一圈，那么 -IR1 + (-IR2) + E = 0");
        System.out.println("逆时针走一圈,那么  -E + IR2 + IR1 = 0");
        System.out.println("注意顺序。");
        for (int i = 0;i<100;i++)
            System.out.print("~");
        System.out.println();
        System.out.println("串并联电路的规律：");
        System.out.println("电量Q:串联两个电阻分得同样的电荷量。并联两个电阻的电量和是总电荷量。");
        System.out.println("电容C:串联 1/c = 1/c1 + 1/c2 + ... + 1/cn。并联: c = c1 + c2 + c3 + c4 + ... + cn");
        System.out.println("电阻R:串联 R = R1 + R2 + ... + Rn。并联:1/R = 1/R1 + 1/R2 + ... + 1/Rn");
        System.out.println("电流:串联 各点电流相等。并联:各个并的电流之和等于总电流。");
        System.out.println("电压:串联 各点电压不同。 并联，各并电压相同。");
        for (int i = 0;i<100;i++)
            System.out.print("~");
        System.out.println();
        System.out.println("更多电池和电动势的区别:");
        System.out.println("同：都可以产生电流。虽然电容器貌似不能靠传递电子懒产生电流。但别忘了它两端还有电势差。可以产生瞬时电流。");
        System.out.println("异:电动势是电池才有的概念。电动势对应的公式E(emp)=q∆V.而电容器存储的电势能有个公式则为:W=∆U=(∆V*Q)/2");
        System.out.println("异：电池有内阻。因此只有路段电压才是实际能提供的电压。且放电速度慢。内阻还会随着化学能的转化而增大。");
        System.out.println("反观电容器，放电完全是靠自由电子定向移动。因此放电速度块。两端产生的电势差也极大。");
        System.out.println("两个电池并联并不会增大电压，而是会减小内阻。因为电阻并联会减小。");
        System.out.println("两个电池头对尾串联会增大电压。");
        System.out.println("禁止两个电池头对头串联。");
        System.out.println("禁止两个不同电势差的电池并联。");








    }



    @Override
    public void 判断() {

    }


    public static void main(String[] args) {
        串并联电路 串并联电路 = new 串并联电路();
        串并联电路.描述();

    }
}
