//偏移量偏移量  工具函数中体现的更为明显 所有都必须-a
class Merge{
    public static void main(String[] args) {
        int[] d = {2,1,3,0,5,3,32,653,3123,4,231,54};
        Merge.sort(d);
        IntStream.of(d).forEach(System.out::println);
    }

    private static void sort(int[] d) {
        Merge.sort(d,0,d.length-1);
    }

    private static void sort(int[] d, int start, int off) {
        //逻辑:合并两个有序的
        if(start >= off) return;
        int mid = (start+off)/2;
        sort(d,start,mid);
        sort(d,mid+1,off);
        helper(d,start,mid,off);
    }

    private static void helper(int[] d, int a, int b, int c) {
        //需要使用一个变量
        int[] ops = Arrays.copyOfRange(d, a,c+1);
        int i = a, j = b+1;
        for (int k = a; k <= c ; k++) {
            if(i > b){
                d[k] = ops[j-a];
                j++;
            }else if(j > c){
                d[k] = ops[i-a];
                i++;
            }else if(ops[i-a] < ops[j-a]){
                d[k] = ops[i-a];
                i++;
            }else{
                d[k] = ops[j-a];
                j++;
            }
        }

    }
}
