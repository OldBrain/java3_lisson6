import java.util.Stack;

public class ResearchesArray implements ExploringArray {

  public ResearchesArray() {
  }

  public Integer[] getArr(int[] arr) {
    Stack stack = new Stack();
    int i;
    int j;
    for (i = arr.length - 1; i > 0; i--) {
      if (arr[i] != 4) {
        stack.push(arr[i]);
      } else {
        Integer[] resultArray = new Integer[stack.size()];
        for (int k = 0; k < resultArray.length; k++) {
          resultArray[k] = (Integer) stack.pop();
        }
        return resultArray;
      }
    }
    if (!stack.empty() || (stack.size() == 0)) {
      throw new RuntimeException("Нет четверки!");
    }
    return null;
  }

  public boolean checkArray(int[] a) {
    if (a == null) {
      return false;
    }
    int count4 = 0;
    int count1 = 0;
    for (int i = 0; i < a.length; i++) {
      switch (a[i]) {
        case (4):
          count4++;
          break;
        case (1):
          count1++;
          break;
        default:
          return false;
      }
    }
    if (count1 == 0 || count4 == 0) {
      return false;
    }
    return true;
  }
}
