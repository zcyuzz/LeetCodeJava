public class Q1725 {
    public static int countGoodRectangles(int[][] rectangles) {
        //compare shorter side and count
        int result =0;
        int max =0;
        for(int i =0;i<rectangles.length;i++){
            int side =Math.min(rectangles[i][0],rectangles[i][1]);
            if(side>max) {
                max=side;
                result=0;
            }
            if(side==max) result++;
        }
        return result;
        //calculate max area and count - use LONG
//        long [] square = new long[rectangles.length];
//        long max=0;
//        int result =0;
//        for(int i=0;i<rectangles.length;i++){
//            int side = Math.min(rectangles[i][0],rectangles[i][1]);
//            square[i]=(long)side*side;
//            if(square[i]>max)max=square[i];
//        }
//        for(long i :square){
//         if(i==max) result++;
//        }
//        return result;
    }

    public static void main(String[] args) {
        int [][] testcase = new int[][]{{999999994,999999995},{999999992,999999994},{999999998,999999996},{999999991,999999996},{999999993,999999996},{999999996,999999992},{999999995,999999994},{999999994,1000000000},{999999990,999999991},{999999995,999999992},{999999993,999999996},{999999991,999999993},{999999991,999999997},{999999991,999999990},{999999996,999999994},{999999997,999999995},{999999993,999999997},{999999993,999999998},{999999994,999999999},{999999990,999999992},{1000000000,999999993},{999999990,999999997},{999999999,999999990},{999999990,999999996},{999999990,999999994},{999999990,999999997},{999999991,999999996},{999999993,999999994},{999999997,1000000000},{999999997,999999998},{999999994,999999999},{999999993,999999997},{999999995,999999993},{999999997,999999996},{999999998,999999990},{999999996,999999995},{999999990,999999991},{999999996,999999999},{999999996,1000000000},{999999996,999999991},{999999992,999999998},{999999990,999999999},{999999998,999999990},{999999996,1000000000},{1000000000,999999999},{999999999,999999992},{999999991,1000000000},{999999994,999999993},{999999999,999999994},{1000000000,999999994},{999999995,999999996},{999999995,999999997},{999999990,999999992},{999999998,999999992},{999999990,999999998},{999999996,999999991},{999999990,999999994},{999999992,999999999},{999999993,999999998},{999999998,999999992},{999999995,999999997},{999999991,999999995},{999999995,999999994},{999999998,999999991},{999999994,999999993},{999999995,999999998},{1000000000,999999997},{999999991,999999992},{1000000000,999999993},{999999997,999999990},{999999997,999999993},{999999995,999999994},{999999999,999999994},{999999992,999999990},{999999993,999999996},{1000000000,999999991},{999999992,999999996},{999999999,1000000000},{999999999,999999994},{999999992,999999997},{999999992,999999993},{1000000000,999999992},{999999995,999999991},{999999992,999999990},{999999990,999999991},{999999998,1000000000},{999999996,999999997},{999999999,999999992},{999999999,1000000000},{999999993,999999991},{999999991,999999997},{999999994,999999990},{999999991,999999995},{999999991,999999995},{999999994,999999998},{1000000000,999999997},{999999990,1000000000},{999999994,1000000000},{999999994,1000000000},{999999993,999999994},{999999990,1000000000},{999999990,999999997},{999999999,999999992},{999999996,999999994},{999999997,999999994},{999999997,999999994},{999999995,999999990},{999999993,999999991},{999999991,999999993},{999999990,999999997},{999999992,999999998},{999999995,999999991},{999999993,999999997},{999999991,1000000000},{1000000000,999999991},{999999995,999999990},{999999990,999999998},{1000000000,999999992},{999999991,999999996},{999999993,999999992},{1000000000,999999997},{999999995,999999997},{999999991,999999994},{999999997,999999992},{999999996,999999992},{999999994,999999995},{999999999,1000000000},{999999997,999999992},{999999999,999999991},{999999991,999999996},{999999998,999999990},{999999998,999999991},{999999997,999999999},{999999990,999999999},{999999994,999999996},{999999991,999999992},{1000000000,999999998},{999999995,999999999},{999999995,999999998},{999999992,999999998},{999999993,1000000000},{999999998,999999991},{999999991,1000000000},{999999995,999999994},{999999993,999999992},{999999994,1000000000},{999999991,999999995},{999999996,999999992},{999999994,999999998},{999999990,999999996},{999999997,999999990},{999999990,1000000000},{999999992,999999991},{999999991,999999990},{999999999,999999990},{999999992,999999990},{999999991,999999992},{999999995,1000000000},{999999996,999999992},{999999993,999999999},{999999995,1000000000},{999999996,999999990},{999999991,999999990},{999999991,999999993},{999999994,999999995},{999999999,999999994},{999999997,999999991},{999999993,1000000000},{999999993,1000000000},{999999997,999999992},{999999999,999999993},{999999997,999999990},{999999999,999999994},{999999996,999999994},{999999993,999999995},{1000000000,999999998},{999999994,999999991},{999999998,999999995},{999999992,999999995},{1000000000,999999992},{999999992,1000000000},{999999992,999999998},{999999999,999999991},{999999995,999999999},{999999998,1000000000},{1000000000,999999990},{1000000000,999999990},{999999992,999999990},{999999993,999999996},{999999997,999999993},{999999999,999999995},{999999997,999999999},{999999992,999999999},{999999998,999999993},{999999999,999999993},{1000000000,999999993},{1000000000,999999990},{999999998,999999999},{999999998,999999996},{999999995,999999990},{999999994,999999992},{999999997,999999992},{999999991,999999996},{999999990,999999996},{999999992,999999997},{999999999,999999992},{999999996,1000000000},{999999993,999999992},{999999998,999999995},{999999995,999999998},{999999990,999999998},{999999993,1000000000},{999999998,999999992},{999999995,999999999},{999999997,999999993},{1000000000,999999994},{999999998,999999991},{999999991,999999999},{999999993,999999996},{999999990,999999993},{999999994,999999998},{999999990,1000000000},{1000000000,999999996},{999999991,999999998},{999999998,1000000000},{999999992,1000000000},{999999994,999999992},{999999996,999999992},{999999990,999999998},{1000000000,999999993},{1000000000,999999990},{999999992,999999991},{999999990,999999999},{999999990,999999995},{999999990,999999997},{999999992,999999996},{999999999,999999996},{999999995,999999990},{999999998,999999990},{999999998,999999999},{999999996,999999999},{999999992,999999993},{999999990,1000000000},{999999999,999999992},{999999990,999999991},{999999992,999999999},{999999996,999999995},{999999998,999999991},{999999999,999999990},{999999991,999999994},{999999996,999999995},{999999998,999999999},{999999990,999999996},{999999991,999999996},{999999994,1000000000},{999999997,999999995},{999999995,999999999},{999999990,999999993},{999999996,999999991},{999999995,1000000000},{999999991,999999993},{999999996,999999991},{999999992,999999994},{999999997,999999999},{999999992,999999994},{999999994,999999999},{999999992,999999995},{999999990,999999999},{999999997,999999998},{1000000000,999999992},{999999991,999999996},{999999992,999999999},{999999998,999999992},{999999991,999999999},{999999990,1000000000},{999999995,999999996},{999999990,999999992},{999999990,999999993},{999999994,1000000000},{999999991,999999998},{1000000000,999999996},{999999991,999999993},{999999998,999999996},{999999996,999999993},{999999995,999999994},{999999999,999999997},{999999994,999999991},{999999992,999999998},{999999998,999999991},{999999994,1000000000},{999999993,999999991},{999999991,999999993},{999999996,999999993},{999999999,1000000000},{999999998,999999990},{999999997,999999995},{999999996,999999994},{999999997,999999991},{999999992,999999991},{999999995,999999992},{999999991,1000000000},{999999994,999999999},{999999991,999999997},{1000000000,999999997},{999999997,999999994},{999999997,999999998},{999999994,999999998},{999999992,1000000000},{1000000000,999999991},{999999992,1000000000},{999999997,999999996},{999999996,1000000000},{999999995,999999996},{999999990,999999996},{999999995,999999990},{999999998,999999992},{999999995,999999991},{1000000000,999999991},{1000000000,999999997},{999999991,999999994},{999999991,999999999},{999999999,999999997},{999999996,999999999},{1000000000,999999996},{999999991,999999997},{999999992,999999999},{1000000000,999999990},{999999998,999999999},{999999996,999999993},{999999991,999999995},{999999993,999999995},{999999994,999999999},{999999996,999999991},{999999997,999999999},{999999995,999999997},{999999996,999999997},{999999993,1000000000},{999999992,999999996},{999999992,1000000000},{999999996,999999995},{999999993,999999995},{999999990,999999994},{1000000000,999999992},{999999994,999999993},{999999994,999999998},{999999991,999999990},{999999991,999999998},{999999999,999999990},{999999994,999999997},{999999990,999999996},{1000000000,999999993},{999999995,999999990},{999999994,999999997},{999999998,999999999},{999999992,999999995},{999999994,999999992},{999999991,999999990},{999999997,999999995},{999999999,999999998},{999999997,999999990},{999999997,999999994},{1000000000,999999992},{999999992,999999991},{999999991,999999997},{999999990,999999995},{999999992,999999999},{999999997,999999992},{999999997,999999991},{999999994,1000000000},{999999998,999999992},{999999998,999999990},{999999994,999999992},{1000000000,999999990},{1000000000,999999993},{999999998,999999997},{999999994,999999992},{999999995,999999990},{999999996,999999999},{999999994,999999996},{999999994,999999993},{999999993,999999996},{999999991,999999998},{999999992,999999996},{999999994,999999999},{999999991,999999992},{999999998,999999997},{999999996,999999992},{999999998,999999990},{999999995,999999997},{999999991,999999992},{999999996,999999994},{999999992,999999997},{1000000000,999999996},{999999990,999999993},{999999991,999999995},{999999996,999999997},{1000000000,999999999},{999999997,999999992},{999999990,999999993},{999999994,999999997},{1000000000,999999999},{999999994,999999995},{999999991,999999995},{1000000000,999999997},{999999996,999999995},{999999994,999999990},{999999995,999999993},{999999992,999999997},{999999997,999999993},{999999992,999999995},{999999997,999999998},{999999990,999999999},{999999990,999999995},{999999995,999999994},{999999998,999999996},{999999993,999999995},{999999992,999999999},{999999995,1000000000},{999999999,999999992},{999999993,999999995},{999999993,999999999},{999999996,999999997},{999999994,999999992},{999999995,1000000000},{999999997,999999993},{999999994,999999991},{999999994,999999999},{999999991,999999992},{999999990,999999995},{999999999,999999993},{999999996,999999992},{999999992,999999999},{999999992,999999994},{999999999,999999994},{999999991,999999990},{999999993,999999998},{999999999,999999994},{999999996,1000000000},{999999993,999999997},{999999997,999999999},{999999992,999999991},{999999991,999999990},{999999996,999999993},{999999995,999999996},{999999993,999999990},{999999998,999999991},{999999990,999999993},{999999990,999999993},{999999998,999999996},{999999992,999999998},{1000000000,999999999},{999999998,999999994},{999999991,999999994},{999999999,999999993},{999999995,999999997},{999999992,999999998},{999999999,999999992},{1000000000,999999993},{999999990,999999997},{999999990,999999992},{999999995,999999996},{999999997,999999996},{999999992,1000000000},{999999990,1000000000},{999999997,999999994},{999999998,999999991},{999999992,999999996},{999999996,999999994},{999999999,999999993},{999999999,999999992},{999999992,999999993},{999999992,999999995},{999999998,999999999},{999999990,999999995},{999999996,999999997},{999999997,999999992},{999999999,999999995},{999999994,999999996},{999999996,999999998},{999999993,999999992},{999999993,999999991},{999999998,999999996},{999999997,999999992},{999999997,999999994},{999999991,999999999},{999999991,999999990},{999999992,999999990},{999999991,999999990},{999999995,999999992},{999999991,999999995},{999999995,1000000000},{999999996,999999995},{999999994,999999992},{999999994,999999997},{999999999,999999990},{999999991,1000000000},{999999995,999999999},{999999993,999999998},{999999998,999999996},{999999993,999999996},{999999993,999999996},{1000000000,999999991},{999999998,999999993},{999999991,999999995},{999999992,999999994},{999999994,999999995},{999999990,999999997},{999999993,999999991},{999999992,1000000000},{999999993,999999992},{999999995,999999997},{999999999,999999998},{999999996,999999991},{999999992,999999994},{999999998,999999991},{999999995,999999998},{999999994,999999993},{999999996,999999994},{999999991,999999997},{999999999,999999994},{999999991,999999994},{999999991,999999995},{999999992,999999997},{999999998,999999995},{999999996,999999995},{999999994,999999992},{999999999,1000000000},{999999994,999999993},{999999991,999999999},{999999994,999999996},{999999990,999999991},{999999991,999999999},{999999999,999999998},{999999997,1000000000},{999999994,999999998},{999999991,999999994},{999999996,999999990},{999999993,999999997},{999999991,999999999},{999999997,999999998},{999999992,999999991},{999999991,999999992},{999999995,1000000000},{999999993,999999990},{1000000000,999999997},{999999992,999999993},{999999992,999999990},{999999990,999999996},{1000000000,999999992},{999999991,999999990},{999999998,999999993},{999999994,999999997},{999999995,999999993},{999999994,999999996},{999999997,999999998},{999999991,999999993},{999999995,999999990},{999999994,999999991},{1000000000,999999995},{999999990,999999995},{999999990,999999991},{999999992,1000000000},{999999995,999999991},{1000000000,999999997},{999999996,999999999},{999999993,999999995},{999999994,999999995},{999999994,999999992},{999999995,999999997},{1000000000,999999996},{999999995,999999996},{999999999,1000000000},{999999996,1000000000},{1000000000,999999993},{999999990,999999999},{1000000000,999999999},{999999994,999999993},{999999995,999999990},{999999991,999999998},{999999998,999999992},{999999997,999999991},{1000000000,999999995},{999999992,999999991},{999999998,999999990},{999999997,999999995},{1000000000,999999993},{1000000000,999999997},{999999991,999999997},{999999992,999999999},{1000000000,999999996},{999999990,999999991},{999999996,999999993},{999999993,999999996},{999999991,999999996},{999999996,999999995},{999999995,999999998},{999999999,999999996},{999999996,999999998},{999999999,999999990},{999999990,999999998},{999999998,999999990},{999999992,999999991},{1000000000,999999999},{999999991,999999996},{999999992,999999991},{999999993,999999992},{999999990,999999993},{999999992,999999991},{999999999,999999995},{999999994,999999995},{999999998,1000000000},{999999993,999999990},{1000000000,999999993},{999999997,999999992},{999999993,999999999},{1000000000,999999993},{999999998,999999993},{1000000000,999999997},{1000000000,999999992},{999999998,999999990},{999999998,999999999},{1000000000,999999996},{999999999,999999995},{999999999,999999995},{999999993,999999991},{999999993,999999995},{999999999,999999997},{999999992,1000000000},{999999999,999999991},{999999994,1000000000},{999999995,999999997},{999999992,999999994},{999999998,999999995},{999999992,999999998},{999999999,999999994},{999999996,999999992},{999999998,999999995},{1000000000,999999998},{999999997,999999996},{1000000000,999999999},{999999991,999999997},{999999996,999999998},{999999995,999999997},{999999995,999999990},{999999997,999999994},{999999996,999999993},{999999995,999999990},{999999997,999999993},{999999998,999999991},{999999998,999999992},{999999999,999999992},{999999999,999999992},{999999990,999999998},{999999994,999999999},{999999991,999999999},{999999991,999999996},{999999990,999999994},{999999999,1000000000},{999999999,999999992},{999999998,999999992},{999999990,999999991},{999999997,1000000000},{1000000000,999999996},{999999990,1000000000},{999999994,999999992},{999999997,999999993},{999999999,999999990},{999999990,999999999},{999999990,999999996},{999999992,999999994},{999999999,999999995},{999999991,999999994},{999999992,999999991},{999999999,999999996},{999999993,999999996},{1000000000,999999993},{999999994,1000000000},{999999992,999999991},{999999991,999999997},{999999994,999999991},{999999995,999999991},{999999992,999999990},{999999999,999999995},{999999991,999999998},{1000000000,999999997},{999999999,999999990},{999999991,999999992},{999999992,1000000000},{1000000000,999999992},{999999993,999999996},{999999999,999999996},{999999998,999999992},{999999995,999999996},{999999991,999999996},{999999990,999999993},{999999993,999999994},{999999996,1000000000},{999999991,999999996},{999999996,999999995},{999999995,999999990},{999999992,999999991},{999999992,999999990},{999999996,999999993},{999999992,999999990},{1000000000,999999991},{999999996,999999990},{999999990,999999998},{999999991,999999994},{999999996,999999995},{999999998,999999990},{999999996,999999992},{999999999,999999990},{999999993,999999990},{999999998,999999996},{999999994,999999990},{999999999,999999995},{999999993,1000000000},{999999994,999999998},{999999990,999999994},{999999999,999999992},{999999998,999999994},{999999990,999999996},{1000000000,999999993},{999999990,999999993},{999999991,999999993},{999999992,999999999},{999999994,999999992},{999999993,999999994},{999999996,1000000000},{999999996,999999991},{999999996,1000000000},{999999997,999999995},{999999996,999999997},{999999995,999999999},{999999994,999999991},{999999990,999999992},{999999995,999999992},{999999992,999999990},{999999994,999999995},{999999994,999999991},{999999996,999999991},{999999996,999999997},{999999990,999999994},{999999996,999999997},{1000000000,999999998},{999999992,1000000000},{999999994,999999995},{999999992,999999997},{999999999,999999995},{1000000000,999999996},{999999991,999999990},{999999992,999999998},{999999998,999999999},{999999997,999999992},{999999996,999999995},{999999993,1000000000},{999999997,999999991},{999999996,999999997},{999999997,999999999},{999999990,999999992},{999999991,999999998},{999999996,999999998},{999999995,1000000000},{999999993,999999996},{1000000000,999999995},{999999998,999999997},{1000000000,999999992},{999999996,999999997},{999999995,999999994},{999999998,999999994},{999999998,999999995},{999999994,999999992},{999999997,999999993},{999999993,999999997},{999999991,999999996},{1000000000,999999999},{999999992,999999991},{999999992,999999996},{999999992,999999998},{999999993,999999994},{999999996,999999992},{999999995,999999992},{1000000000,999999996},{999999999,999999996},{999999990,999999999},{999999995,999999999},{999999990,999999995},{999999995,999999993},{999999993,999999994},{999999991,999999992},{999999991,999999998},{999999997,999999998},{999999993,999999995},{999999992,999999991},{999999991,999999993},{999999999,1000000000},{999999998,999999999},{999999995,999999997},{999999994,999999998},{999999993,999999990},{999999999,999999991},{999999999,999999994},{999999991,999999998},{999999999,999999998},{1000000000,999999993},{999999998,999999993},{999999993,999999994},{999999990,999999998},{999999996,999999994},{999999996,999999994},{999999997,999999999},{1000000000,999999990},{999999996,999999995},{999999991,999999999},{999999990,999999992},{999999997,999999998},{999999998,999999993},{999999995,999999997},{999999996,999999999},{999999995,999999990},{1000000000,999999999},{999999992,999999993},{999999999,999999994},{999999994,999999995},{999999990,999999994},{999999999,999999993},{999999998,999999993},{999999996,1000000000},{999999992,999999999},{999999999,999999995},{999999993,999999991},{999999997,999999992},{999999996,999999997},{1000000000,999999995},{999999998,999999994},{999999992,999999993},{999999990,999999991},{999999993,999999990},{999999995,999999994},{1000000000,999999996},{999999998,999999992},{999999999,999999996},{999999991,999999995},{999999991,999999993},{999999992,999999995},{999999997,999999994},{999999997,999999999},{1000000000,999999993},{999999992,999999993},{999999997,999999994},{999999992,999999994},{999999995,1000000000},{1000000000,999999994},{999999995,999999998},{999999990,999999995},{999999999,999999992},{999999992,999999995},{999999996,999999992},{999999996,999999992},{999999992,999999997},{999999991,999999999},{1000000000,999999990},{999999993,999999990},{999999997,999999992},{999999992,999999991},{1000000000,999999998},{999999992,999999990},{999999990,999999992},{999999991,999999990},{999999990,999999997},{999999997,999999996},{999999993,999999997},{999999998,999999993},{999999995,999999994},{999999996,999999995},{999999995,999999994},{999999994,999999998},{999999994,999999992},{999999993,999999992},{999999990,999999991},{999999998,999999991},{999999991,999999999},{1000000000,999999999},{999999998,999999990},{999999992,1000000000},{999999998,999999997},{999999997,999999995},{999999997,999999995},{999999998,999999994},{999999992,999999999},{999999998,999999996},{999999990,999999998},{999999991,999999992},{999999995,999999994},{1000000000,999999993},{999999994,999999999},{999999999,999999994},{999999995,999999991},{999999993,999999990},{999999998,999999999},{999999990,999999993},{999999994,999999993},{999999993,999999992},{999999992,999999991},{999999992,999999996},{999999997,1000000000},{999999990,999999998},{1000000000,999999992},{999999992,999999995},{999999997,999999994},{1000000000,999999996},{999999999,999999991},{999999992,999999995},{1000000000,999999994},{999999997,999999993},{999999994,999999992},{1000000000,999999992},{999999991,999999996},{999999998,999999990},{999999997,999999999},{999999998,999999991},{999999990,999999996},{999999998,999999991},{999999990,999999995},{999999999,999999994},{999999994,999999999},{999999994,999999996},{999999992,999999997},{999999999,999999992},{999999997,999999994},{999999992,999999994},{999999990,999999995},{999999991,999999995},{999999994,999999996},{999999998,999999993},{1000000000,999999990},{999999994,999999999},{1000000000,999999990},{999999998,1000000000},{1000000000,999999997},{999999999,999999996},{999999990,999999991},{1000000000,999999997},{999999996,999999998},{999999995,999999998},{999999992,999999998},{999999999,999999993},{999999996,999999998},{999999998,999999996},{999999991,999999992},{999999997,999999992},{999999990,999999993},{999999993,999999991},{1000000000,999999991},{999999997,999999998},{999999997,999999993},{999999999,999999991},{999999994,999999995},{999999992,999999997},{999999991,999999995},{999999996,999999994},{999999999,999999992},{1000000000,999999994},{999999993,999999998},{999999992,999999999},{999999991,999999992},{999999990,999999997},{999999997,999999990},{999999999,999999998},{999999999,999999992},{999999998,999999992},{999999999,1000000000},{999999992,999999999},{999999997,1000000000},{1000000000,999999990},{999999997,999999993},{999999995,999999991},{999999993,999999998},{999999997,999999993},{999999996,1000000000},{999999992,999999996},{999999990,999999991},{999999990,999999996},{999999991,999999998},{999999996,999999994},{999999992,1000000000},{999999995,999999996},{999999995,1000000000},{999999996,999999993},{999999993,999999997},{999999993,999999998},{999999997,999999999},{999999992,999999998},{999999994,999999991},{999999997,1000000000},{999999990,999999992},{999999994,999999998},{1000000000,999999996},{999999996,999999994},{999999990,999999998}};
        System.out.println(countGoodRectangles(testcase));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(testcase.length);
        System.out.println((long) 1000000000*1000000000);
    }
}