public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed1 = {1,0,0,0,1};
        int n1 = 1;
        int[] flowerbed2 = {1,0,0,0,1};
        int n2 = 1;

        System.out.println("For test case 1, flowers can be placed in flowerbed is - " + CanPlaceFlowers(flowerbed1, n1));
        System.out.println("For test case 1, flowers can be placed in flowerbed is - " + CanPlaceFlowers(flowerbed2, n2));
    }
    public static boolean CanPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if((flowerbed[i] == 0) && (i == 0 || flowerbed[i + 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i - 1] == 0)){
                    flowerbed[i] = 1;
                    n --;
                    i ++;
            }
        }
        return n <= 0;
    }
}
