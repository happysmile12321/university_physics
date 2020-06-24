public class 电流激发的磁场 implements 口水化的描述,脑筋急转弯{
    @Override
    public void 描述() {

        System.out.println("电荷激发电场、磁场总结:");
        System.out.println("运动的电荷收到磁力并激发磁场。");
        System.out.println("静止的电荷不受磁力，且不激发磁场");
        System.out.println("电荷收到电场力并激发电场，无论运动与否。");
        System.out.println("长直导线的磁场:方向:拇指指向电流方向，四指就指向了磁场方向");
        System.out.println("激发的磁场大小:B=μ0 I/2πr.μ0是真空磁导率。");
        System.out.println("请看图:同向电流为什么相吸.左边对右边产生了个磁场指入页面的磁场。右边对左边产生了一个指出页面的磁场。从罗沦兹力的角度分析就相互吸引了。");
        System.out.println("圆环的磁场。B=Nμ0 I/2r,N是线圈的匝数");

    }

    @Override
    public void 判断() {

    }

    public static void main(String[] args) {
        电流激发的磁场 电流激发的磁场 = new 电流激发的磁场();
        电流激发的磁场.描述();


        double I = 80;
        double _2r = 1.5;
        double B = 1.5;
        System.out.println(B*_2r/(常量表.真空磁导率*I));



    }
}
