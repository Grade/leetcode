package leetcode.arrays;

class CanPlaceFlowers {

  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    if (n == 0) {
      return true;
    }
    int flowersPlaced = 0;
    for (int i = 0; i < flowerbed.length; i++) {
      if ((i == 0 || flowerbed[i - 1] == 0)
          && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)
          && flowerbed[i] == 0) {
        flowerbed[i] = 1;
        flowersPlaced++;
        if (flowersPlaced == n) {
          return true;
        }
      }
    }
    return false;
  }
}
