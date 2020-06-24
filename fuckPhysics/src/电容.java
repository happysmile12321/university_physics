public class 电容 implements 口水化的描述,脑筋急转弯{
    @Override
    public void 描述() {
        System.out.println("电容，请看图:");
        System.out.println("电容，用来存储电势能和电荷(它也存储电荷。从它的公式就可以看出)。它其实就相当于电池了。它存储电势能。电势能会使电荷做功，从而转化为电荷的动能。电荷因此具有了速度，形成了电流。");
        System.out.println("电容，因为有悠久的历史，因此它的公式很多。");
        System.out.println("公式1:C=q/∆V（F 法拉）,表示升高单位电势所需要的电荷量。");
        System.out.println("公式2:(真空中孤立导体球的电容)：C=4πεR,孤立球体就相当于点电荷，它的电势为V=kQ/r,高斯化为:V=Q/4πεr,然后就推出来了");
        System.out.println("公式3:(导体外部紧临的电场):E=4πkδ=δ/ε.");
        System.out.println("推导公式3:看图.做一个圆柱型的高斯面。然后，侧面的法线和电场线垂直，E.S.cosӨ=0.只剩下两个底面。");
        System.out.println("而两个底面中下面那个面直接在导体里面了，然后没有电荷移动，然后E=0,然后只要求上底面就可以了。");
        System.out.println("公式:电通量=E.∆S=q/ε;所以，E=q/(ε.∆S);然后q/∆S='单位面积的电荷量'=δ(delta)=q/∆A.");
        System.out.println("公式4:平行板电容器电容(看图).E=δ/ε,∆V=Ed=δ.d/ε=Q.d/ε.A,C=Q/∆V=ε.A/d");
        System.out.println("从公式4可以看出，电容是物体的固有属性");
        System.out.println("电容器的充电:请看图片，电容器存储电势能推导公式");
        System.out.println("公式:W=Q^2/2C=C*(∆V^2)/2=(∆V*Q)/2,请看图片，电势能公式推导");
        System.out.println("~~~描述");
    }

    @Override
    public void 判断() {
        System.out.println("电容的定义式:C=q/∆V。那么电容是否表示存储的电荷量呢？");
        
        System.out.println("分析：有这个假象的原因是如果我们把一块南浮电池和一块平行板电容器串联，发现电容器两边带电荷。于是就认为这个电荷是电池给的。");
        System.out.println("历史上的莱茵瓶就曾这样搞过。他们把莱茵瓶充电，形成电势差。再让好多个人拉着手和莱茵瓶串联。好多人都被电的飞起。");
        System.out.println("这玩意儿能放电？因此我们就会自然想到莱茵瓶--我们说的电池，它存储者电荷。");
        System.out.println("其实呢？给莱茵瓶充电的过程就是使莱茵瓶两边的电子移动，形成一边都是负电荷，一边都是正电荷。这样的话，就形成了电势差。");
        System.out.println("历史上的莱茵瓶是电容。它既能充电也能放电。它和电池本身没有区别");
        System.out.println("分析:通过查阅资料，我们来回答这一道题。电池，是化学能转化为电能。转化为电能后就和电容器一样了。");
        System.out.println("这个转化的过程通常比电容器直接充放电要久。但电池能存储更高的能量密度。");
        System.out.println("现在的研究就是怎么提高电池的充放电速度和增加电容所能存储的电荷量");
        System.out.println("电容的并联:等效电容=各个电容相加");
        System.out.println("电容的串联:等效电容=1/各个电容的倒数和");
        System.out.println("并联总电容增大，耐压取决于耐压能力低的那个电容");
        System.out.println("串联总电容减小，耐压增大");

    }


    public static void main(String[] args) {
        电容 电容 = new 电容();
        电容.描述();
        电容.判断();
        }


}
