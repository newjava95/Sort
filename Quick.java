class Kuaipai {
    public static void main(String[] args) {
        int[] d = {2,1,3,0,5,3,32,653,3123,4,231,54};
        //int[] d = {9,8,7,6};
        Kuaipai.sort(d);
        //Arrays.sort(d);
        IntStream.of(d).forEach(System.out::println);
    }

    private static void sort(int[] d) {
        sort(d,0,d.length-1);

    }
    //这里本身是一个递归
    private static void sort(int[] d, int l, int r) {
        if(l >= r) return ;
        int p = helper(d,l,r);
        sort(d,l,p-1);
        sort(d,p+1,r);
        return;
    }

    //由于只能操作下标 所以注意好下标就完事了
    private static int helper(int[] d,int start,int off){
        int l = start;
        for (int i = l+1; i <= off ; i++) {
            //只动小的
            if(d[i] < d[start]){
                l++;
                swap(d,i,l);

            }
        }
        swap(d,start,l);
        return l;
    }
    private static void swap(int[] d,int i,int j){
        int t = d[i];
        d[i] = d[j];
        d[j] = t;
    }
}
