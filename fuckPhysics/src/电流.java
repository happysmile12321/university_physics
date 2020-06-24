public class 电流 implements 口水化的描述,脑筋急转弯{

    @Override
    public void 描述() {
        System.out.println("公式:I=∆q/∆t,单位时间通过某个横截面的电荷量");
        System.out.println("单位:c/s,mA");
        System.out.println("恒定电流:电流的大小和方向不随时间而变化。这个性质还会产生磁场，它是那种特别的，很稳定的磁场。这么个玩意儿只产生在闭合回路中。");
        System.out.println("请看图:电流1。电流只能反应通过一个面的流量，而不能反应整体。在图中这样粗细不均的导体中的电流就不是恒定的。\n为了精确化的描述这个问题，我们引入一个新的物理量--电流密度（垂直与电流方向的单位面积的电流）");
        System.out.println("电流定义:大量带电粒子定向移动形成的。");
        System.out.println("载流子：形成电流的带电粒子。如：自由电子、离子、空穴等。\n" +
                "导体的载流子是电子。离子溶液中的载流子是正离子和负离子。\n" +
                "在半导体材料中，既有正的载流子，也有负的载流子。负的载流子就是电子；正的载流子叫作空穴，相当于电荷为+e的粒子。电子和空穴沿相反方向做漂移运动，都对电流有贡献。");
        System.out.println("电流的方向:物理学界规定，正电荷运动的方向就是电流的方向。");
        System.out.println("一个关于电流的有效应用是霓虹灯。霓虹灯玻璃管中的氖气被两个电极间的大电势差电离，电子和离子间的碰撞产生了霓虹灯的特征红光。\n荧光灯中，碰撞产生了紫外辐射，在玻璃容器内壁的涂层能吸收这些紫外辐射并发射出可见光。");
        System.out.println("请看图，霓虹灯示例");
        System.out.println("从判断提2的意义上来说，电流也可以是一种标量。如果确定了正电荷移动的方向，那么负电荷的反方向就是电流的方向，无论什么情况。");
        System.out.println("电源和电池的作用:从电流的角度来看:图片:电源和电池的作用.");
        System.out.println("电池放电，导线上的自由电子不断的移动到电池的正极。为了让电势差不变，化学能转化过来的能量不断的又重新把电子从正极搬运到负极。");
        System.out.println("电池的电动势(emf):理想电池两端的电势差。把单位正电荷从电池的负极搬动到电池的正极所做的功就是电池的电动势。");
        System.out.println("电动势是标量。规定，从电源负极到正极的方向为电池电动势的方向。(和电流一样，都是正离子移动的方向。--其实就是逆着电场的方向。--提供一个和电场内部对抗的力)");
        System.out.println("电动势其实就是电势差。");
        System.out.println("电源:任何能把正电荷从低电势移动到高电势的装置。所有电源都是能量装化装置，他们能把其他形式的能量转化为电能。");
        System.out.println("关于电流有一个很形象的例子，请看图:电流2.该图中，人将正电荷从低电势搬运到高电势。");
        System.out.println("金属中电流的微观图像:自由电子模型。");
        System.out.println("单位体积内传导电子的数量：n，在体积A vD Δt内的电子数为N = nA vD Δt,电量为： ΔQ=Ne= neA vD Δt,因此，导线中电流的大小为：I=ΔQ/Δt=neAV(D),该公式可推广到任意载流子的体系中。");
        System.out.println("在半导体中，有正的载流子（空穴），和负的载流子（电子），对电流都有贡献。电流可表示为：I=n(+)eAV(+)+n(-)eAV(-)");
        System.out.println("电子和空穴沿相反方向做漂移运动，都对电流有贡献。");
        System.out.println("~~~~~~~~~~~~~~");
    }

    @Override
    public void 判断() {
        System.out.println("格雷厄姆汽车的蓄电池没电了，汽车无法启动，他决定用8个1.5V的干电池串联成12V的电池组，代替汽车的电瓶，这个计划能不能实现呢？");
        System.out.println("分析：要分析这个问题不是很难。首先，我们已经有直观的印象，那就是电流就是电荷的定向移动。电池什么的就类似与电容。");
        System.out.println("电容上的正极不断地吸引电子抵消它的场强，那么电池能够顶多久呢？而且更不用说电池放电还需要自己的化学能转化为电能。");
        System.out.println("这就好比你在Windows上开了个虚拟机，然后在那个虚拟机上用eclipse。");
        System.out.println("既然Ne都被电离成为电流了。那么水呢？水里面可是直接有大量的离子的啊。水不是轻轻一拆，就被电离了么？");
        System.out.println("这样的化，水中有电流么？");
        System.out.println("分析:电流大小是q/t。方向是正电荷移动的方向。水流向一个地方跑，那么电流就被抵消了。");
        System.out.println("这样就抵消了。因此水不带电。");




    }

    public static void main(String[] args) {
        电流 电流 = new 电流();
        电流.描述();
        电流.判断();
        double e = 常量表.基本电荷量;
        double q = 1.65 * Math.pow(10,21);
        double v = 12;
        double an = q*v /2;
        System.out.println(an);



    }
}
