public class 磁场 implements 口水化的描述,脑筋急转弯 {
    @Override
    public void 描述() {
        System.out.println("请看图:磁性物质");
        System.out.println("规律:N、S极。相互作用,同性想斥，异性相吸。没有磁单极。--没有磁单极是针对点电荷说的。");
        System.out.println("磁偶极子:条形磁铁。请看图，条形磁铁.");
        System.out.println("磁感线是从N极传出流向S极然后再在内部回到N极。对比电偶极子，磁偶极子是封闭回路的。电偶极子是颇具极性的。");
        System.out.println("请看图:地球的磁极。");
        System.out.println("地球的磁极说明了什么事情呢？地理北极恰好是地磁的南极。请看，指南针");
        System.out.println("电与磁");
        System.out.println("电流与电流同向相吸，异向相斥。");
        System.out.println("通电螺线管和条形磁铁等效。");
        System.out.println("磁场强度的单位T(特斯拉)--特斯拉是国际单位 | Gs(高斯) | N/(C*m/s)");
        System.out.println("洛仑兹力的前言:安培的'分子电流假说'主要告诉了，电流才可以形成磁场。也就是电子要有速度，要运动。");
        System.out.println("洛仑兹力的来历:一位叫做洛仑兹的人进一步完善了这个理论，并且给出了计算磁场力的公式。从而给物理实验带来了很大的便利。磁场力也被成为洛仑兹力。回想电场力也被成为库伦力。");
        System.out.println("洛仑兹力的方向(右手螺旋定则):拿起右手，将手指伸直成掌状。四个指头指向速度的方向，手心慢慢旋转到磁感线方向(旋转的结果就是磁感线穿入手背)，如果此时这个电荷是正电荷，那么大拇指的方向就是它受力的方向。负电荷的话，和正电荷受力方向反向即可。");
        System.out.println("为了彻底搞透磁场方向，来做3个题:看图，磁场方向题1,求那个红色箭头的磁场力方向");
        System.out.println("分析1:右手四指指向速度的方向，手心慢慢转向磁场的方向，因为是正电，大拇指就是力的方向。[Χ]");
        System.out.println("看图，磁场方向题2,已知所受磁场力的方向和磁场方向，求电子的速度大概方向。");
        System.out.println("分析2:将力反向就是负电荷的受力方向，然后手心转向磁场方向，可以大致推测出电子速度方向是西北方向。但是也有可能是西北和西南，这得计算。");
        System.out.println("看图，磁场方向题3,求1，3的方向(粒子带负电）.");
        System.out.println("分析3:`1`因为速度方向和磁场平行因此磁场力为0。`3`--[Χ]");
        System.out.println("洛仑兹力的公式:F=|q|vB*sinө");
        System.out.println("洛仑兹力公式的重要例子:如果速度和磁场方向平行，那么F=0。要想F最大，那么需要速度和磁场方向垂直。");
        System.out.println("磁场方向的表示:[Χ--垂直纸面射入][●--垂直纸面传出]{叉进点出}");
        System.out.println("请看图:求解洛仑兹力的步骤.png");
        System.out.println("匀速圆周运动~~~");
        System.out.println("磁场中的带电离子坐着匀速圆周运动。");
        System.out.println("|q|vb=ma=mv^2/R; a=|q|vb/m; R=mv/qb; T=2πR/v=2πR/(Rqb/m)=2πm/qb; f=1/T=qb/2πm");
        System.out.println("关于T，R,都是需要背会的，因为用的真的很多。");
        System.out.println("质谱仪:遥想洛仑兹，正是他，才有了这个发明。");
        System.out.println("请看图:质谱仪");
        System.out.println("这个设备很简单。利用电池加速，使粒子得到速度。进入磁场，收到洛仑兹力做圆周运动，打到板上。");
        System.out.println("打不到的就不是我想要的粒子。然后测量半径，计算洛仑兹力。关键是这一切都可以输入计算机让其自动完成。");
        System.out.println("主要测量的是粒子的质量。");
        System.out.println("请看图:速度选择器");
        System.out.println("这个图更加精妙。通过让质子的质量和洛仑兹力相等，淘汰一些杂质粒子。然后再通过偏转的半径不同（为什么半径会不同?--同位素）来测定比荷(电荷和质量比)");
        System.out.println("比荷是粒子的基本性质");
        System.out.println("回旋加速器,请看图。");
        System.out.println("回旋加速器是怎样的一种设备呢？它靠中间有一段空间提供电场，进行加速。T=2πm/qB。因此粒子出去的时间是不会改变的。因此粒子就不断的加速。每次加速，根据公式R=mv/qB。半径都会扩大。不管扩大到多大，反正最后会加速飞出来。");
        System.out.println("回旋加速器的应用:医学中用来生产一些衰变期短的核素同位素。");




        










    }

    @Override
    public void 判断() {

    }

    public static void main(String[] args) {
        磁场 磁场 = new 磁场();
        磁场.描述();
        double a = Math.sqrt(3)/2;
        System.out.println(0.4*8*Math.pow(10,5)*a*常量表.基本电荷量);
    }

}
