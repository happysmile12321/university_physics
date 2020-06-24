public class 电势 implements 口水化的描述,脑筋急转弯{


    @Override
    public void 描述() {
        System.out.println("单位电荷的电势能");
        System.out.println("类比速率:单位时间移动的距离。那么肯定是一个比值形式的。也就是一个比值表示的一个物理量");
        System.out.println("电势差:∆V=V(f)-V(i)=V(B)-V(A)");
        System.out.println("电势能差:∆U(E)=q∆V");
        System.out.println("性质:沿着电场线方向电势降低");
        System.out.println("公式:V=U(E)/q 单位:V (J/C)|(N*m/C)");
        System.out.println("电势的正负和什么有关:和电势零点有关");
        System.out.println("公式:点电荷的电势:V=kQ/r，因为点电荷的电势能为:U=kQq/r,由电势的定义得");
        System.out.println("公式:电势叠加:Vp = V1 + V2 + ... + Vn = sum<i:1~n>(qi / 4πεri)");
        System.out.println("电势叠接原理:由N个点电荷在P点产生的电势等于各点电荷在P点单独产生的电势之和。");
        System.out.println("模型:均匀带电球形电荷内，上，电场为0.外，电场=Q/4πεr^2.这个公式是根据高斯定理推得的。R为球的半径。");
        System.out.println("模型:(场源电荷在球外)r>R,V=4πεr;r<=R,V=Q/4πεR");
        System.out.println("模型:(场源电荷在球外)r>R,V=kQ/r;r<=R,V=kQ/R");
        System.out.println("以无限远为电势零点。由于在球面外直到无穷远处场强的分布都和电荷集中在球心处的点电荷的场强分布一样，因此球面外任一点的电势与电量集中在球心的点电荷的电势分布相同。");
        System.out.println("为了更直观的表示球形带电体的电势，索性用图来表示。请看，球形导体的电势");
        System.out.println("~~~~描述");
    }


    public static void main(String[] args) {
        电势 电势 = new 电势();
        电势.描述();
        电势.判断();
        double 多个电荷在一点产生的电势差 = 电势.多个电荷在一点产生的电势差(8*Math.pow(10,-9),-8*Math.pow(10,-9),0.04,0.16);

    }

    @Override
    public void 判断() {
        System.out.println("通常情况下，无限远处U=0。那么，无限远处电势也为0吗?");
        System.out.println("点电荷的电势和自己的电荷量有关?");
        System.out.println("分析:根据公式:V=kQ/r,和自己的电荷量没有关系");
        System.out.println("因为电场为0，所以电势为0；因为电势为0，所以电场为0");
        System.out.println("分析:都不对。举个例子:");
        System.out.println("看图，例子1");
        System.out.println("条件是4个点电荷他们完全一样。");
        System.out.println("首先，根据电场的公式:E=kQ/r^2,可以看出，E肯定是抵消了。所以他们中点出的电场为0");
        System.out.println("再根据电势叠加原理，电势是4倍的1个点电荷对该点产生的电势的叠加");
        System.out.println("所以前半句错了");
        System.out.println("请看例子2，他的中点出的电势为0.根据电势计算公式:∅=kQ/r，因此中点电势为0.");
        System.out.println("但是中点电场可不为0.根据电场叠加原理，中点处的电场方向应该指向负电荷，大小为2倍的kQ/r^2");

    }

    /*@param:初末能量差说的是能量的变化，到底是电荷转化为其他能量-->负
             还是其他能量转化为电荷-->正
      @param:电荷量说的是这个过程中，
      转移的电荷大小，以及电荷是正点还是负电
    * */
    public double 电势差(double 初末能量差,double 电荷量){
        System.out.println("电势差为:"+初末能量差/电荷量);
        return 初末能量差/电荷量;
    }

    /*@param:电荷1的电荷量，电荷2的电荷量，电荷n的电荷量，
             电荷1距p点的距离，电荷2距p点的距离，电荷n距p点的距离
    * */
    public double 多个电荷在一点产生的电势差(double... 参数){

        int 多少个电荷 = 参数.length/2;
        double 总电势差 = 0;
        for(int i=0;i<多少个电荷;i++){
            double 电势差 = 常量表.静电常数 * 参数[i]/参数[i+多少个电荷];
            总电势差 += 电势差;
        }
        System.out.println(多少个电荷 + "的电势差为:" + 总电势差);
        return 总电势差;
    }


}
