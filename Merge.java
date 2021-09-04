class Merge{
    public static void main(String[] args) {
        int[] d = {2,1,3,0,5,3,32,653,3123,4,231,54};
        Merge.sort(d);
        int[] ints = Arrays.copyOf(d, d.length);
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
        helper(d,start,mid,mid+1,off);
    }

    private static void helper(int[] d, int a, int b, int e, int f) {

    }
}
