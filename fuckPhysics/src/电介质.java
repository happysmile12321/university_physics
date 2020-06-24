public class 电介质 implements 口水化的描述,脑筋急转弯{

    @Override
    public void 描述() {

        System.out.println("电容器内加入一些绝缘材料叫做电介质");
        System.out.println("公式:电容器中间加入电介质，C=k(kappa--希腊字母)*ε.A/d=kε.A/d");
        System.out.println("解释:kappa为相对介电常数，kappa=C/C(0)=E(0)/E=ε/ε(0)=其中，C(0)和E(0)都是未加入电介质时的值，也就是kappa量纲为1时的值");
        System.out.println("介电强度:是恰好发生静电击穿，材料变成导体时所对应的电场强度。(绝缘体变成导体)");
        System.out.println("相对介电常数决定了在给定电势差的情况下储存电荷的多少。标志着电介质对静电场的影响程度。是反应电容器性质的一个重要参数");
        System.out.println("介电常数决定了电容器被击穿前所能承受的最大电势差的大小。∆V=Ed");
        System.out.println("材料的相对介电常数是绝缘材料被极化的难易程度的量度。越大代表这种材料更容易被极化。");
        System.out.println("请看图-电介质的极化。为什么是绝缘体--电容嘛，是导体就静电击穿了。");
        System.out.println("极化是什么?就是两级分化。绝缘体内的电荷正的跑到电容器的负极板一边，负电荷同理。");
        System.out.println("为什么相对介电常数越大，越容易被极化?因为相对介电常数越大(相对介电常数通常被认为是>1的数)，电容就越大，说明中间的绝缘体更绝缘。");
        System.out.println("为了更绝缘，那就需要极化的更厉害，从而形成抵抗电场强度的电场，从而阻隔了电极板两边想要连到一块的愿望。");
        System.out.println("极化现象的效应:电磁炉加热效应。心电图效应。特性：反射、穿透、吸收");


    }

    @Override
    public void 判断() {

    }

    public static void main(String[] args) {
        电介质 电介质 = new 电介质();
        电介质.描述();
    }

}
