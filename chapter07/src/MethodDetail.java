public class MethodDetail {
    public static void main(String[] args) {
        AA a = new AA();
        int[] res = a.getSumAndSub(1, 4);
        System.out.println("和=" + res[0]);
        System.out.println("差=" + res[1]);
    }
}

class AA {
    public int[] getSumAndSub(int n1, int n2) {
        int[] resArr = new int[2];
        resArr[0] = n1 + n2;
        resArr[1] = n1 - n2;
        return resArr;
    }

    public double f1() {
        double d1 = 1.1 * 3;
        int n = 100;//int 兼容 double
        return n;//没有写void就需要有返回语句：return 值
    }
    public void f2(){
        System.out.println("Hello!");
        //写了void就不需要有返回语句；
    }
}
