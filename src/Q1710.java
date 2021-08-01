public class Q1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int result =0;
        int[] boxSize = new int[1001];
        for(int i =0;i<boxTypes.length;i++){
            boxSize[boxTypes[i][1]]+=boxTypes[i][0];
        }
        for(int i =boxSize.length-1;i>=0;i--){
            if(truckSize==0)continue;
            result+=boxSize[i]*i;
            truckSize-=boxSize[i];
            if(truckSize<=0){
                result-=(truckSize*-1)*i;
                break;
            }
        }
        return result;
    }
}
