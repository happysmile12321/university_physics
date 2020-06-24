public class 电势能 implements 口水化的描述,脑筋急转弯 {
    @Override
    public void 描述() {
        System.out.println("势能：储存在场中的能量");
        System.out.println("电势能：储存在电场中的能量");
        System.out.println("符号:∆U,-∆U");
        System.out.println("势能与做功的关系:∆U=-W(field)");
        System.out.println("势能与做功的关系:W(MN)=-∆U=-(U(N)-U(M))=U(M)-U(N)");
        System.out.println("功和能是相互转化的，做正功，是谁促使他做正功？那除了电势能能分给他一部分能量外，别无选择");
        System.out.println("同理，电场力做负功。电场力怎么会减少了呢？是谁使他减少了呢？是不是他把他的能量转化给了电势能");
        System.out.println("参考图片:电场力和电势能很形象的例子");
        System.out.println("势能与做功的关系:电场力做正功，电势能减小；电场力做负功，电势能增加。");
        System.out.println("怎么求一个点的电势能:取无穷远处电势能为零，则:U(M)=U(M)-U(∞)=W(M∞),即电荷q0在电场中某一点的电势能在数值上等于将q0从该点移到无穷远处电场力所做的功。");
        System.out.println("性质:电势能和物体的位置有关，与路径无关。");
        System.out.println("性质:电势能的差值有物理意义，零电势的选取是任意的。电势能的值受零点的影响,但是电势能的差值不受影响。");
        System.out.println("性质:对于两个物体，通常选择无限远处为U=0。");
        System.out.println("性质:万有引力和电场力具有平方反比率，他们的势能具有相似的距离依赖关系");
        System.out.println("图片:电势能和重力势能的关系.png");
        System.out.println("为什么会有这个关系呢？两个物体，他们自然地收到电场力。自然要做功。无论他们同号/异号，他们都会自然地收到电场力的正功。因此，他们的电势能都会减小。");
        System.out.println("就像重力势能和电势能，重力势能永远是你越远离，你才势能越大。我将势能比喻为在某个场中积累的能量。");
        System.out.println("那么同性电荷呢，就像一根弹簧。你越靠近，他的电势能就越大");


        System.out.println("~~~~~~描述");
    }

    public static void main(String[] args) {
        电势能 电势能 = new 电势能();
        电势能.描述();
        电势能.现象_雷暴云();
        电势能.判断();

        System.out.println(4*常量表.静电常数*Math.pow(10,-6));

//        double a = 常量表.静电常数*8*Math.pow(10,-9)*2*Math.pow(10,-9)/(0.04);
//        double b = 常量表.静电常数*(-8*Math.pow(10,-9))*2*Math.pow(10,-9)/(0.16);
//        System.out.println(a+b);

    }

    public void 现象_雷暴云(){
        System.out.println("在雷雨中，电荷是通过一种由太阳引发的复杂机制被分离的。可以用一个简单的模型来表示雷暴云中的电荷：正电荷聚集在顶部，负电荷聚集在底部，就像一对点电荷。");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void 计算两个点电荷之间的电势能(double 电荷1的电荷量,double 电荷2的电荷量,double 两个点电荷之间的距离){
        double 电势能 = 电荷1的电荷量*电荷2的电荷量*常量表.静电常数/两个点电荷之间的距离;
        System.out.println("两个点电荷之间的电势能为:"+电势能);
    }

    /*@param:参数 第1个电荷的电荷量，第2个电荷的电荷量，如果有第n个电荷的电荷量。
    * 再依次输入1，2的距离，1，3的距离，2，3的距离，假设有3个。并依次类推。
    * */
    /*注意，该公式只是求一个系统的电势能。而不是求某一个电荷的电势能。
    电势能是一个标量。要求a电在b,c,d点的电势能，只需求出b,c,d对a点产生的电势能即可。
    * */
    public void 计算多个点电荷之间的电势能(int 多少个点电荷,double... 参数){
        int 循环次数=0;
        for(int i=1;i<=多少个点电荷-1;i++){
            循环次数 +=i;
        }
        //q1,q2,q3... r1,r2,r3... 假设有3个
        double [] 电荷辅助数组 = new double[多少个点电荷];
        double [] 距离辅助数组 = new double[循环次数];
        System.arraycopy(参数,0,电荷辅助数组,0,多少个点电荷);
        System.arraycopy(参数,多少个点电荷,距离辅助数组,0,参数.length-多少个点电荷);
        double 总共的电势能 = 0;
        int k = 0;
        for(int i=1;i<=电荷辅助数组.length;++i){
            for(int j=i+1;j<=电荷辅助数组.length;++j){
                ++k;
                double 电势能 = 电荷辅助数组[i-1]*电荷辅助数组[j-1]*常量表.静电常数/距离辅助数组[k-1];
                总共的电势能 += 电势能;
            }
        }
        System.out.println(多少个点电荷+"的电势能总共为:"+总共的电势能);
    }


    @Override
    public void 判断() {
        System.out.println("在一个由点电荷产生的电场中，电势能和一个点的位置有关，但和一个点的电荷量无关");
        System.out.println("分析:电势能和做功有关，做功就涉及到能量的转换。从能量的角度，一定和这个点电荷有关。");
        System.out.println("而电场强度则是固有属性，就像质量。");
        System.out.println("~~~~~~判断");
    }
}


