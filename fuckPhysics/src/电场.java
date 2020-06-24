public class 电场 implements 口水化的描述,脑筋急转弯 {

    public double 计算一个点电荷对该点的电场强度(double 场源电荷,double 该点电荷距离该点的距离的平方){
        double 电场强度 = 常量表.静电常数 * 场源电荷 / 该点电荷距离该点的距离的平方;
        return 电场强度;
    }

    @Override
    public void 描述() {
        System.out.println("符号:E");
        System.out.println("公式:F=Eq");
        System.out.println("单位:N/C");
        System.out.println("静电平衡--电子不移动");
        System.out.println("静电平衡的电荷分布:局限在尖端、凸起的地方。可以理解成点电荷为人群，在地面上人挤人的情况下，很难移动。只有到那些羊肠小道才可以行进。");
        System.out.println("利用这个原理啊，(电荷在静电平衡状态下很容易集中在导体的尖端)，可以做避雷针--实际上是引雷到地面。");
        System.out.println("还有静电除尘。是让尘极化，然后在利用尖端收集尘。");
        System.out.println("物理模型:空腔不接地，屏蔽外界电场。空腔接地，屏蔽外界电场和内界电场。");
        System.out.println("电通量:Φ=EScosθ.cosθ是因为两个向量点乘。--高中数学学过。");
        System.out.println("高斯定理:很简单，就是Φ=EScosθ=q/ε.ε是高斯自己创造性引入的符号。是因为后面研究磁通量方便，--因为积分积出来是个球。");
        System.out.println("ε和库伦中的k是有关联的。ε=1/4πk.ε是无量纲的量，纯粹是因为数学代换方便产生的符号。");
        System.out.println("高斯定理给我们的启示是，做一个高斯面。你的电通量永远等于电荷量比上一个常数。");
        System.out.println("高斯面上电场为0");
        System.out.println("为什么电通量穿出为正?cosθ,穿出，和法线(法线规定是指向外的)的夹角<90度，因此为正");
        System.out.println("模型:球形导体，在<=R的距离,E=0.>R的距离(r是做的那个高斯面的半径),(Φ=E*4πr^2=q/ε;E=q/4πr^2*ε)");

    }

    @Override
    public void 判断() {

    }

    public static void main(String[] args) {
        电场 电场 = new 电场();
        电场.描述();
    }
}
